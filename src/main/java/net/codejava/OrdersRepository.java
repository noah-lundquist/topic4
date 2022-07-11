package net.codejava;

import org.springframework.data.repository.CrudRepository;
public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {

}
