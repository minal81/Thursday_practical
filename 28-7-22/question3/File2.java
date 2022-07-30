//Using Filereader to read the file and print the output
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File1{

    public static void main(String[] args) {
       Reader reader = null;
        try
        {
            reader = new FileReader("C:\\Users\\admin\\Desktop\\java\\bhidu.txt");
            int data;
            while ((data = reader.read()) != -1)
            {
                System.out.print((char) data);
            }

        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        finally 
        {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    
       
    }

}
