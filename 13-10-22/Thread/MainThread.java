
import java.util.Scanner;


class FibonacciSeries extends Thread
{
     public void run()
     {
         
               int a=0, b=1, c=0;


               Scanner sc=new Scanner(System.in);
               System.out.print("Enter the Limit for fabonacci: ");

               int n = sc.nextInt();
               
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          
     }
}


class Reverse extends Thread
{
     public void run()
     {
    	 		System.out.println("\n --------------------------------------------------------");
		    	 System.out.println("\n Before reverse is:");
		    	 for (int i=1; i <= 10 ;i++ )
		         {
		              System.out.print(i+"  ");
		         }
		          
               
               System.out.println("\n After Reverse is: ");
               
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               
         
     }
}
public class MainThread {
	public static void main(String[] args)
    {
         try
         {
              FibonacciSeries fib = new FibonacciSeries();
              fib.start();
              fib.sleep(3000);
              Reverse rev = new Reverse();
              rev.start();
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }

}
