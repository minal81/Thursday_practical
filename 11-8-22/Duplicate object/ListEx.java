
import java.util.ArrayList;

public class ListEx 
{

	public static void main(String[] args) 
  {
      ArrayList<Integer> num1=new ArrayList<>();
      ArrayList<Integer> num2=new ArrayList<>();
      num1.add(1);
      num1.add(2);
      num1.add(4);
      num1.add(2);
      num1.add(1);
      num1.add(1);
      num1.add(3);
      num1.add(5);


      System.out.println("Array with duplicate number :"+num1);
      for( Integer element: num1)
      { 
        if (!num2.contains(element))
        {
          num2.add(element);
        }

      }
      System.out.println("Array with duplicate number :"+num2);
  }
  
}
		
