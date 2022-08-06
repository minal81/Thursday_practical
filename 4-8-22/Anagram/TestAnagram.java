import java.util.Scanner;

class TestAnagram
{
		public static void main(String[] args)
		{
			AnagramTest A1=new AnagramTest();
			Scanner s=new Scanner(System.in);
			System.out.println("enter two String Values to check ANAGRAM");
			
			String a=s.next();
			String b=s.next();
			A1.AnagramCheck(a,b);
			
	}

}
