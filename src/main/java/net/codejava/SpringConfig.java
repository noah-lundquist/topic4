package net.codejava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean(name="ordersBusinessServiceInterface", initMethod="init", destroyMethod="destroy")
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}
}
