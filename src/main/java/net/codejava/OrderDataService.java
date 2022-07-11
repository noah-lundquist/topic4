package net.codejava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDataService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	public OrderDataService (OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	
	public List<OrderEntity> findAll() {
		
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		try {
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
		
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return orders;
	}

	
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean create(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

}
