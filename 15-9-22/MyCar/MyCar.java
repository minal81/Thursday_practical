class Car
{
	int speed;
	double price;
	String colour;
	
	Car(int speed,double price,String colour)
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
	Sedan(int speed,double price,String colour,int length)
	{
		super(speed,price,colour);
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
	Sedan s1=new Sedan(300,1000000,"red",30);
	System.out.println("discount values:"+s1.getSalePrice());
	
	Sedan s2=new Sedan(400,1000000,"white",10);
	System.out.println("discount values:"+s2.getSalePrice());

	}

}
