class OverLoadingFinal
{
	final void Addition(int a,int b)
		 {
			 System.out.println("sum of integer:"+(a+b));
		 }
}
class OverFinal extends OverLoadingFinal
{
	final void Addition(int a,int b)
			 {
				 System.out.println("sum of integer:"+(a+b));
				 System.out.println("INSIDE THE OVERFINAL");
			 }
}
class Test1
{
	public static void main(String arg[])
	{
		OverFinal o1=new OverFinal();
		o1.Addition(3,6);
	}
}
