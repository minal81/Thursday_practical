import java.util.*;
class SumDigit
{
public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int num=s.nextInt();
			int sum=0;
			int a=num;
			int rem=0;
			while(a>0)
				{
					rem=a%10;
					sum=sum+rem;
					a/=10;
				}
			System.out.println("sum of digit:- "+sum);
	}

}		
