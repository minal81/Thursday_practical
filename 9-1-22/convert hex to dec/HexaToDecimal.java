
public class HexaToDecimal {
	public static int  HexaConvert(String a)
	{
        String digit="0123456789ABCDF";
        int val=0;
        for(int i=0;i<a.length();i++)
        {
          char c=a.charAt(i);
          int d = digit.indexOf(c);
          val=16*val +d;
        }
        return val;		
      }
      public static void main(String[] args)
      {
        System.out.println("convert hexadecimal to decimal of 7A: "+HexaConvert("7A"));
        System.out.println("convert hexadecimal to decimal of F: "+HexaConvert("F"));
      }

}
