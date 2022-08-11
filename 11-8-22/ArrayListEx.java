
import java.util.ArrayList;
public class ArrayListEx 
{

	public static void main(String[] args) 
  {
		List<String> Fruit=new LinkedList<String>();
		List<String> FruitName=new ArrayList<String>();
		System.out.println("Array list of Friut Name: ");
		Fruit.add("Apple");
		Fruit.add("Banana");
		Fruit.add("JackFruit");
		Fruit.add("Guava");
		Fruit.add("coconut");
		
		System.out.println(Fruit);
		System.out.println("remove the item with index:  "+Fruit.remove(0));
		System.out.println(Fruit);
  }
}
