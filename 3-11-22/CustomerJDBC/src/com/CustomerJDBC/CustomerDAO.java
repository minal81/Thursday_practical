package com.CustomerJDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;




public class CustomerDAO {
private JdbcTemplate jdbctemp;

	

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int AddCustomer(Customer c)
	{
		String insert="insert into customer value('"+c.getId()+"','"+c.getName()+"','"+c.getService()+"')";
		return jdbctemp.update(insert);
	}
	public int UpdateCustomer(Customer c)
	{
		String update="update customer set service='"+c.getService()+"' where id='"+c.getId()+"'";
		return jdbctemp.update(update);
	}
	public int DeleteCustomer(Customer c)
	{
		String delete="delete from customer  where id='"+c.getId()+"'";
		return jdbctemp.update(delete);
	}
	public List<Customer> ViewCustomer()
	{
		String select="select *from customer";
		List<Customer> cus=jdbctemp.query(select, new CustomerMapper());
		return cus;
	}
	

}
