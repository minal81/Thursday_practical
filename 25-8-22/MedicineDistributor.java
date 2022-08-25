
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MedicineDistributor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		/*System.out.println("Enter the Ditributor name");
		String name=sc.next();
		System.out.println("Enter the Licensenumber");
		String L_number=sc.next();
		System.out.println("Enter the order mode");
		String order=sc.next();
		System.out.println("Enter the Medical Id");
		String M_Id=sc.next();
		System.out.println("Enter the Medical name");
		String M_name=sc.next();
		System.out.println("Enter the payment mode");
		String payment=sc.next();
		System.out.println("Enter the company name");
		String C_name=sc.next();*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			//s.execute("create table MedicineDistributor(DistributorId int auto_increment primary key,DistributorName varchar(20),LicenseNumber int ,orderMode varchar(20),MedicalId int,MedicalName varchar(20),PaymentMode varchar(20),CompanyName varchar(20));");
			//System.out.println("table create....");
			
			
			/*PreparedStatement ps=con.prepareStatement("insert into MedicineDistributor(DistributorName,LicenseNumber,orderMode,MedicalId,MedicalName,PaymentMode,CompanyName) values(?,?,?,?,?,?,?)");
			 ps.setString(1,name);
			 ps.setString(2,L_number);
			 ps.setString(3,order);
			 ps.setString(4,M_Id);
			 ps.setString(5, M_name);
			 ps.setString(6, payment);
			 ps.setString(7, C_name);
			 ps.executeUpdate();*/
			 
			 
			 ResultSet rs=s.executeQuery("select DistributorId,DistributorName,LicenseNumber,orderMode,MedicalId,MedicalName,PaymentMode,CompanyName  from MedicineDistributor") ;
				System.out.println("DistributorId \t DistributorName \t LicenseNumber \t\t  orderMode \t\t  MedicalId \t\t MedicalName \t\t  PaymentMode \t\t  CompanyName");
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				while(rs.next()) 
				{
					System.out.println(rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3)+"			"+rs.getString(4)+"		 "+rs.getString(5)+"		 "+rs.getString(6)+"			 "+rs.getString(7)+"		 	"+rs.getString(8));
					
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
