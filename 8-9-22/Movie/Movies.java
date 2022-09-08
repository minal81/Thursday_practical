import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args)
	{
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the movies title");
		String t=sc.next();
		System.out.println("enter the movies genre");
		String g=sc.next();
		System.out.println("enter the movies YearOfRelease");
		String y=sc.next();*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			//1.drop similer table
			//s.execute("drop table Movie");
			//System.out.println("drop movie table");
			
			
			
			//2.create a table
			//s.execute("create table Movies(id int auto_increment primary key ,title varchar(225),genre varchar(225),YearOfRelease int);");
			//System.out.println("table created");
			
			
			
			//3.insert the values
			/*PreparedStatement ps=con.prepareStatement("insert into Movies(title,genre,YearofRelease) values(?,?,?);");
			
			ps.setString(1, t);
			ps.setString(2, g);
			ps.setString(3, y);
			ps.executeUpdate();
			System.out.println("values inserted");
			*/
			
			//4.update selected row
			/*PreparedStatement ps=con.prepareStatement("update Movies set YearOfRelease=2000 where id=3");
			ps.executeUpdate();
			System.out.println("updated ...");*/
			 
			//5.delect selected row
			PreparedStatement ps=con.prepareStatement("delete from Movies  where id=2;");
			ps.executeUpdate();
			System.out.println("deleted ...");
			
			
			
			//6.printing the values
			ResultSet rs=s.executeQuery("select id,title,genre,YearOfRelease from Movies");
			System.out.println("id \t  title \t  genre \t  YearOfRelease ");
			System.out.println("---------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(" "+rs.getString(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)+"  \t "+rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
