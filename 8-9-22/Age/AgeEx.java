import java.time.LocalDate;
import java.time.Period;

public class AgeEx 
{

	public static void main(String[] args)
  {
		LocalDate dob = LocalDate.of(2000, 8, 30) ;
		
		LocalDate curDate = LocalDate.now();  
		
		Period period = Period.between(dob, curDate);  
		  
		System.out.printf(" age :"+ period.getYears());

	}

}
