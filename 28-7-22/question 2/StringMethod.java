class StringMethod
	{
		public static void main(String arg[])
		{
			String fname="Minal"; //literal
			String lname="VINOD";
			
			System.out.println(" String: "+fname);
			int Len=fname.length();
			System.out.println("lenght of the String="+Len);
			char c1=fname.charAt(2);
			System.out.println("char persent in Index the String="+c1);
			int b1=fname.indexOf("n");
			System.out.println("index of the charter in string="+b1);
			boolean b2=fname.contains("in");
			System.out.println("cantains in the String="+b2);
			String s1=fname.toUpperCase();
			System.out.println("upperCase of the String="+s1);
			String s2=fname.toLowerCase();
			System.out.println("LowerCase of the String="+s2);
			boolean b3=fname.equals(lname);
			System.out.println("equals or not ="+b3);
			boolean b4=fname.equalsIgnoreCase(lname);
			System.out.println("equals or not with ignore Case sensitive="+b4);
			
		}
	}
	
			
