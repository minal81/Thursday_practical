class BaseClass
{
	BaseClass(){};
	
}
class DerivedClass extends BaseClass
{
	//overlaod base class Contructor
	BaseClass()
	{
	
		System.out.println("Constructor of  overloading base class");
		
	}
	//derived class Constructor
	DerivedClass()
	{
		System.out.println("Constructor of derived class");
	}
	
}



public class ConstructorOverloading {

	public static void main(String[] args) {
		DerivedClass d1=new DerivedClass();
		

	}

}
