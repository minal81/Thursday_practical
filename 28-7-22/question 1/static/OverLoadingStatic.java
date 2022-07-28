class OverLoadingStatic
{
	static void Sum(int a,int b)
	 {
		int c=a+b;
		System.out.println("sum of integer:"+c);
	 }
	 static void Sum(float a,float b)
	 {
		float v=a+b;
		System.out.println("SUm of float:"+v);
	
	 }
	 public static void main(String Arg[])
	 {
		OverLoadingStatic o1=new OverLoadingStatic();
		OverLoadingStatic.Sum(5,9);
		OverLoadingStatic.Sum(1.5f,6.8f);
	}
}
