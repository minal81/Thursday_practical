package com.CustomerJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class CustomerMapper  implements RowMapper<Customer>
{
	 public Customer mapRow(ResultSet rs, int rownumber) throws SQLException {  
	        Customer cus=new Customer();  
	        cus.setId(rs.getInt(1));  
	        cus.setName(rs.getString(2));  
	        cus.setService(rs.getString(3)); 
	         
	        return cus;  
	    }  

}
