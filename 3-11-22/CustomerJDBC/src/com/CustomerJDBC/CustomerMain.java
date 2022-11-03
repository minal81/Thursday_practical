package com.CustomerJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CustomerJDBC.Customer;



public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO myBean=(CustomerDAO) beanFactory.getBean("cdao");
		
		        //insert data
				  /*System.out.println("inserted"+myBean.AddCustomer(new Customer(11,"minal","helping")));
				  System.out.println("inserted"+myBean.AddCustomer(new Customer(12,"satish","cleaning")));
		          System.out.println("inserted"+myBean.AddCustomer(new Customer(13,"satish","cooking")));
				  System.out.println("inserted"+myBean.AddCustomer(new Customer(14,"satish","washing")));
				  System.out.println("inserted"+myBean.AddCustomer(new Customer(15,"satish","cooking")));*/
				  
				
				//update data
				//System.out.println("updated"+myBean.UpdateCustomer(new Customer(11,"minal","cooking")));
				
				//delete data
				/*Customer c=new Customer();
				c.setId(14);
				System.out.println("Sucessfully deleted"+myBean.DeleteCustomer(c));*/
				
				
				List<Customer> c1=myBean.ViewCustomer();
				System.out.println("ID \t\t\t "+"name \t\t\t"+"service \t\t\t");	
				System.out.println("---------------------------------------------------------------------------------");
				for(Customer cus:c1)
				{
					System.out.println(cus.getId()+"\t\t\t"+cus.getName()+"\t\t\t"+cus.getService());
				}
	

	}

}
