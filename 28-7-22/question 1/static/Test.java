class OverLoadingStatic
{
	static void Sum(int a,int b)
	 {
		int c=a+b;
		System.out.println("sum of integer:"+c);
	 }
	 
}
class OverStatic extends OverLoadingStatic
{
	static void Sum(int a,int b)
	{
		System.out.println("Sum of Integer :"+(a+b)+" in OverStatic Class");
	
	}
	
		
}
class Test
{
	public static void main(String Arg[])
	{
		OverStatic o2=new OverStatic();
		OverStatic.Sum(8,8);
	}
}
