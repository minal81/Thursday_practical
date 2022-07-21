abstract class Marks
{
	public abstract void GetPercentage();
}
class StudentA extends Marks	
{
	int s1,s2,s3,sum1;
	float percentage1;
	StudentA(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		sum1=s1+s2+s3;
		System.out.println(" science: "+s1+" maths: "+s2+" english: "+s3);	
	}
	public void GetPercentage()
	{
		percentage1=((sum1*100)/300);
		System.out.println("StudentA percentage is :"+percentage1);
	}
}
class StudentB extends Marks	
{
	int s1,s2,s3,s4,sum2;
	float percentage2;
	StudentB(int s1,int s2,int s3,int s4)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		System.out.println(" science: "+s1+" maths: "+s2+" english: "+s3+" marathi: "+s4);
		sum2=s1+s2+s3+s4;	
	}
	public void GetPercentage()
	{
		percentage2=((sum2*100)/400);
		System.out.println("StudentB percentage is :"+percentage2);
	}
}
class MainStudent
{
	public static void main(String args[])
	{
		StudentA A=new StudentA(45,76,89);
		A.GetPercentage();
		StudentB B=new StudentB(67,89,45,87);
		B.GetPercentage();
	}
}
