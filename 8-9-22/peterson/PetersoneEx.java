import java.util.Scanner;

public class PetersonEx 
{

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int f=1;
		int sum=0;
		int r=0;
		
		while(num!=0)//running while loop until number becomes zero
		{
			f=1;
		
			 r=num%10;
		
			for(int i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			num=num/10;
		}
			
			if(temp==sum)
			{
				System.out.println("number is peterson");
				
			}
			else
			{
				System.out.println("number is not peterson");
			}
			
	}
}


