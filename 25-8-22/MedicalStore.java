import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MedicalStore {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Medical batch number");
		String MedicalBatchNum=sc.next();
		System.out.println("Enter the Medicine price");
		String price=sc.next();
		System.out.println("Enter the Medicine MFD");
		String MFD=sc.next();
		System.out.println("Enter the Medicine Exp_date");
		String Exp_date=sc.next();
		System.out.println("Enter the Medicine Company Name");
		String CompanyName=sc.next();
		System.out.println("Enter the Medicine Count");
		String Count=sc.next();
		System.out.println("Enter the Payment Mode");
		String Mode=sc.next();
		System.out.println("Enter the Medical License number");
		String LicenseNum=sc.next();
		System.out.println("Enter the Doctor Id");
		String D_Id=sc.next();
		System.out.println("Enter the Petient Id");
		String P_Id=sc.next();
		*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			
			
			/*
			s.execute("create table Medical(MedicalId int auto_increment primary key,MedicineBatchNumber int,Price int ,MFD int,EXP_date int,CompanyName varchar(20),MedicineCount int,PaymentMode varchar(20),LicenseNumber int,DoctorId int ,PatientId int);");
			System.out.println("table create....");
		*/
			
			/*PreparedStatement ps=con.prepareStatement("insert into Medical(MedicineBatchNumber,Price,MFD,EXP_date,CompanyName,MedicineCount,PaymentMode,LicenseNumber,DoctorId,PatientId) values(?,?,?,?,?,?,?,?,?,?)");
		    ps.setString(1, MedicalBatchNum);
		    ps.setString(2, price);
		    ps.setString(3,MFD);
		    ps.setString(4,Exp_date);
		    ps.setString(5,CompanyName);
		    ps.setString(6,Count);
		    ps.setString(7,Mode);
		    ps.setString(8,LicenseNum);
		    ps.setString(9,D_Id);
		    ps.setString(10,P_Id);
		    ps.executeUpdate();
			*/
			
			
			ResultSet rs=s.executeQuery("select MedicalId,MedicineBatchNumber,Price,MFD,EXP_date,CompanyName,MedicineCount,PaymentMode,LicenseNumber,DoctorId,PatientId  from Medical") ;
			System.out.println("MedicalId  MedicineBatchNumber  Price  MFD  EXP_date   CompanyName   MedicineCount  PaymentMode   LicenseNumber  DoctorId  PatientId");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10)+"\t"+rs.getString(11));
				
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
