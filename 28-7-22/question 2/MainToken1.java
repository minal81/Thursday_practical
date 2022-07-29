import java.util.StringTokenizer;
class Token1
{
	void display()
	{
		StringTokenizer st1=new StringTokenizer("I Am Software Engineers"," ");
		System.out.println("token of String :");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}
}

class MainToken1
{
	public static void main(String args[])
	{
		Token1 s1=new Token1();
		s1.display();
		
	}
}
		
	
	
