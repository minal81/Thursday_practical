import java.util.*;
class SPYNo
{
public static void main(String Arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		int sum=0;
		int mul=1;
		int a=n;
		int rem=0;
			while(a>0)
			{
				rem=a%10;
				sum=sum+rem;
				mul=mul*rem;
				a/=10;
			}
			if(sum==mul)
				{
				
					System.out.println("This is spy number");
					
				}
			else
				{
					System.out.println("This is not spy number");
				}  
		
	}
}





