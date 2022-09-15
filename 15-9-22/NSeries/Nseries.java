
public class NSeries
{

	public static void main(String[] args)
  {
		int n;
		int tenth=0;
		int hundreds=0;
		int thousand=0;
		System.out.println("n \t 10*n \t 100*n \t 1000*n ");
		for(n=1;n<=5;n++)
		{
			tenth=10*n;			
			hundreds=100*n;		
			thousand=1000*n;
			System.out.println(n+"\t "+tenth+"\t"+hundreds+"\t"+thousand);
		}
				

	}

}
