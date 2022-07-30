//using file read the text file and 
//using FileInputStream delete the starting 10 byte
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File1{

    public static void main(String[] args) {
       Reader reader = null;
        try {
            reader = new FileReader("C:\\Users\\admin\\Desktop\\java\\Frd.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    
        File f1=new File("C:\\Users\\admin\\Desktop\\java\\Frd.txt");
    	try
    	{
    		FileInputStream f2=new FileInputStream(f1);
    		int ch;
    		 
    		 System.out.println("   ");
    		 System.out.println("File Content after 10 byte is: ");
    		 f2.skip(10);
    		 while ((ch = f2.read()) != -1) 
    		 {
                 System.out.print((char) ch);
             }

         }
    	catch (IOException e)
    	{
             e.printStackTrace();
         
    	}
    	catch (Exception ioe)
    	{
             ioe.printStackTrace();
         
    	}
    }

}
