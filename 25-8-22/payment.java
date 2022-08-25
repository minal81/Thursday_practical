
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 
public class payment {

	public static void main(String[] args) {
		
		
	
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the TransactionId");
		String TransactionId=sc.next();
		System.out.println("Enter the TransactionDate");
		String TransactionDate=sc.next();
		System.out.println("Enter the ModeOfTransaction");
		String ModeOfTransaction=sc.next();
		System.out.println("Enter the PaymentPersonId");
		String PaymentPersonId=sc.next();
		System.out.println("Enter the Status");
		String Status=sc.next();*/
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			
			
			
			/*s.execute("create table Payment(RecipitId int auto_increment primary key,TransactionId int,TransactionDate varchar(20) ,ModeOfTransaction varchar(20),PaymentPersonId int,Status varchar(20));");
			System.out.println("table create....");*/
		
			
			/*PreparedStatement ps=con.prepareStatement("insert into Payment(TransactionId,TransactionDate,ModeOfTransaction,PaymentPersonId,Status) values(?,?,?,?,?)");
		    ps.setString(1, TransactionId);
		    ps.setString(2, TransactionDate);
		    ps.setString(3,ModeOfTransaction);
		    ps.setString(4,PaymentPersonId);
		    ps.setString(5,Status);
		    
		    ps.executeUpdate();*/
			
			
			
			ResultSet rs=s.executeQuery("select  RecipitId,TransactionId,TransactionDate,ModeOfTransaction,PaymentPersonId,Status  from Payment") ;
			System.out.println("RecipitId    TransactionId   TransactionDate  ModeOfTransaction  PaymentPersonId  Status");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
				
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
