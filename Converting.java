class Converting
{
public static void main(String Arg[])
{
	int i=81;
	char iValue=(char)i;
	double d=323.142;
	int dValue=(int)d;
	float f=72.38f;
	int fValue=(int)f;
	double d1=323.142;
	byte d1Value=(byte)d1;
	
	System.out.println(" value of integer value  :-  " +i+ " after casting into char :-  "+iValue);
	System.out.println(" value of  Double value:-  " +d+ " after casting into int :-  "+dValue);
	System.out.println(" value of float value:-   " +f+ "  after casting into int :-  "+fValue);
	System.out.println(" value of Double value:-  " +d1+ "  after casting in byte :-  "+d1Value);
	
}
}