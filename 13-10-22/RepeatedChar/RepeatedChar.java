import java.util.HashMap;
import java.util.Scanner;

		
public class RepeatedChar
{    
		    static void RepeatedNonRepeatedChar(String inputString)
		    {
		        //Creating a HashMap containing char as a key and occurrences as a value
		         
		        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		         
		       
		         
		        char[] strArray = inputString.toCharArray();
		         
		        //Checking each char of how many type occurrences store as a value
		         
		        for (char c : strArray)
		        {
		            if(charCountMap.containsKey(c))
		            {
		                //If char is present in charCountMap, incrementing it's count by 1
		                 
		                charCountMap.put(c, charCountMap.get(c)+1);
		            }
		            else
		            {
		                //If char is not present in charCountMap,set values as one
		             
		                 
		                charCountMap.put(c, 1);
		            }
		        }
		         
		        //checking which key's values is equal to one
		         
		        for (char c : strArray)
		        {
		            if (charCountMap.get(c) == 1)
		            {
		                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
		                 
		                break;
		            }
		        }
		         
		        //checking for which key's values is more than one
		         
		        for (char c : strArray)
		        {
		            if (charCountMap.get(c) > 1)
		            {
		                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
		                 
		                break;
		            }
		        }
		    }
		     
		    public static void main(String[] args)
		    {
		        Scanner sc = new Scanner(System.in);
		         
		        System.out.println("Enter the string :");
		         
		        String input = sc.next();
		         
		       RepeatedNonRepeatedChar(input);
		    }
		
	}


