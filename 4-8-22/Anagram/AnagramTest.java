import java.util.Arrays;
import java.util.Scanner;


public class AnagramTest {

		void AnagramCheck(String a,String b)
		{
			char[] c=new char[a.length()];
			char[] d=new char[b.length()];
			boolean status=false;
			
				if(a.length()== b.length())
				{
					for(int i=0;i<a.length();i++)
					{
						 c[i]=a.charAt(i);
						 d[i]=b.charAt(i);
					}
					Arrays.sort(c);
					Arrays.sort(d);
            if(Arrays.equals(c, d))
            {
              status=true;

            }
            if(status==true)
            {
              System.out.println("number is anagram");
            }
            else
            {
              System.out.println("number is not anagram");
            }
					
				}
				else
				{
					System.out.println("number is not anagram");
				}
			
			
		}
}

