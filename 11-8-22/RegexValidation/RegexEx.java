
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1
{
	public static void main(String[] args) 
  {
         Scanner sc=new Scanner(System.in);


        System.out.println("enter your username");
        String Username=sc.next();
        System.out.println(Pattern.matches("[a-zA-z0-9_]{6,30}",Username));

        System.out.println("enter your email id");
        String EmailId=sc.next();
        System.out.println(Pattern.matches("[a-zA-z0-9@._]{8,}",EmailId));

        System.out.println("enter your password");
        String Password=sc.next();
        System.out.println(Pattern.matches("[a-zA-z0-9@!$%^&*\s]{8,16}",Password));
  }
}

