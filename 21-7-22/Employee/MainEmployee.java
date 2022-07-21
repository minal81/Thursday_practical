
import java.util.*;

public class MainEmployee 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
	    Scanner s =new Scanner(System.in);
		System.out.println("enter the employee1  name,YearOfJoin,salary,Address");
		String EmpName=s.next();
		int YearOfjoins=s.nextInt();
		int salary=s.nextInt();
		String Address=s.next();
		
		e1.setEmpName(EmpName);
		e1.setYearOfJoin(YearOfjoins);
		e1.setSalary(salary);
		e1.setAddress(Address);
		
		Employee e3=new Employee();
		System.out.println("enter the employee3  name,YearOfJoin,salary,Address");
		String EmpName2=s.next();
		int YearOfjoins2=s.nextInt();
		int salary2=s.nextInt();
		String Address2=s.next();
		
		e3.setEmpName(EmpName2);
		e3.setYearOfJoin(YearOfjoins2);
		e3.setSalary(salary2);
		e3.setAddress(Address2);
		
		Employee e2=new Employee();
		System.out.println("enter the employee2  name,YearOfJoin,salary,Address");
		String EmpName1=s.next();
		int YearOfjoins1=s.nextInt();
		int salary1=s.nextInt();
		String Address1=s.next();
		
		e2.setEmpName(EmpName1);
		e2.setYearOfJoin(YearOfjoins1);
		e2.setSalary(salary1);
		e2.setAddress(Address1);
		
		
		System.out.println("Name	Year of joining		Salary				Address");
		System.out.println(e1.getEmpName()+"	"+e1.getYearOfJoin()+"			"+e1.getSalary()+"			"+e1.getAddress());
		System.out.println(e2.getEmpName()+"	"+e2.getYearOfJoin()+"			"+e2.getSalary()+"			"+e2.getAddress());
		System.out.println(e3.getEmpName()+"	"+e3.getYearOfJoin()+"			"+e3.getSalary()+"			"+e3.getAddress());
			
	}
		
		

}


