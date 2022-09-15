import java.util.Scanner;

class Car
{
	int speed;
	double price;
	String colour;
	
	public void values(int speed,double price,String colour)
	{
		this.speed=speed;
		this.price=price;
		this.colour=colour;
	}
	
	public double GetSalePrice()
	{
		return price;
	}
}

class Sedan extends Car
{
	int length;
	/*Sedan(int speed,double price,String colour,int length)
	{
		super(speed,price,colour);
		this.length=length;
	}*/
	public void values(int speed,double price,String colour,int length)
	{
		super.speed=speed;
		super.price=price;
		super.colour=colour;
		this.length=length;
	}
	
	public double getSalePrice()
	{
		if (length > 20) {
			super.GetSalePrice();
			System.out.println("your car lenght is more then 20 so you got 5% discount");
		return  0.05 * super.GetSalePrice();
		}
		else {
			super.GetSalePrice();
			System.out.println("your car lenght is less then 20 you got 10% discount");
		return  0.1 * super.GetSalePrice();
		}
		}
}
public class MyCar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sedan s1=new Sedan();
		System.out.println("enter the car speed");
		int s=sc.nextInt();
		System.out.println("enter the car price");
		double p=sc.nextDouble();
		System.out.println("enter the car colour");
		String c=sc.next();
		System.out.println("enter the car length");
		int l=sc.nextInt();
		s1.values(s, p, c, l);	
	     System.out.println("discount values:"+s1.getSalePrice());
	
	
	}

}
