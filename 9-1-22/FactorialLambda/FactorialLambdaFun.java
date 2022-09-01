import java.util.Scanner;

interface Factorial
{
	public void Cal();
}

public class FactorialLambdaFun
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		//interface object and lambda experssion
		Factorial f1=new Factorial()
				{
						public void Cal()
						{ 
							System.out.println("Enter the factorial number");
							int num=sc.nextInt();
							int fact=1;
							for(int i=1;i<=num;i++)
							{
								fact=fact*i;
							}
							System.out.println("factorial :"+fact);
						}
				};
				f1.Cal();
				
	}
}
				
				
				
		
		

	
