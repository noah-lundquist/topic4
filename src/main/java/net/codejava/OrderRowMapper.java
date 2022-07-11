package net.codejava;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<OrderEntity>{


	@Override
	public OrderEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new OrderEntity(rs.getLong("ID"), rs.getString("ORDER_NO"), rs.getString("PRODUCT_NAME"), rs.getFloat("PRICE"), rs.getInt("QUANTITY"));
		
	}
}
