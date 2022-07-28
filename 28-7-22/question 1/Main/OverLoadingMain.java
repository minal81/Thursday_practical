class OverLoadingMain
{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(float b)
	{
		System.out.println(b);
	}
	public static void main(String arg[])
	{
		OverLoadingMain o1=new OverLoadingMain();
		main(6);
		main(1.6f);
	}
}
