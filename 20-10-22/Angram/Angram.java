
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Angram {

	
	static boolean areAnagram(char[] str1, char[] str2)
	{
		//  lengths of both strings
		int n1 = str1.length;
		int n2 = str2.length;


		//lengths not be same then return false
		if (n1 != n2)
			return false;

		//sort the array
		Arrays.sort(str1);
		Arrays.sort(str2);

		//check all words one by one
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1 String");
		String ns1=sc.next();
		System.out.println("Enter the 2 String");
		String ns2=sc.next();
		
		char str1[] =ns1.toCharArray();
		char str2[] =ns2.toCharArray();
	
		
		if (areAnagram(str1, str2))
			System.out.println("The two strings are anagram ");
		else
			System.out.println("The two strings are not anagram");
	}
}


