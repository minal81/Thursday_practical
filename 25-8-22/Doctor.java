import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class Doctor {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Doctor name");
		String D_name=sc.next();
		System.out.println("Enter the Doctor Type");
		String D_Type=sc.next();
		System.out.println("Enter the Doctor Charges");
		String D_Charges=sc.next();
		System.out.println("Enter the Doctor Education");
		String D_Education=sc.next();
		System.out.println("Enter the Doctor Shift");
		String D_Shift=sc.next();
		System.out.println("Enter the Doctor Hospital name");
		String D_Hospitalname=sc.next();
		System.out.println("Enter the Doctor License number");
		String D_LicenseNumber=sc.next();
		System.out.println("Enter the Patient Id");
		String P_Id=sc.next();*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			
			//s.execute("create table Doctor(DoctorId int primary key auto_increment ,DoctorName varchar(20) not null , DoctorType varchar(20) , Charges varchar(20) not null , Education varchar(20), Shift varchar(20) ,HospitalName varchar(20),LicenseNumber int,PatientId int);");
			//System.out.println("table create....");
			  
			
			/*PreparedStatement ps=con.prepareStatement("insert into Doctor(DoctorName,DoctorType,Charges,Education, Shift,HospitalName,LicenseNumber,PatientId) values(?,?,?,?,?,?,?,?);");
			ps.setString(1,D_name);
			ps.setString(2,D_Type);
			ps.setString(3,D_Charges);
			ps.setString(4,D_Education);
			ps.setString(5,D_Shift);
			ps.setString(6,D_Hospitalname);
			ps.setString(7,D_LicenseNumber);
			ps.setString(8,P_Id);
			ps.executeUpdate();*/
			
			
			ResultSet rs=s.executeQuery("select DoctorId,DoctorName,DoctorType,Charges,Education,Shift,HospitalName,LicenseNumber,PatientId   from Doctor") ;
			System.out.println("DoctorId \t DoctorName \t  DoctorType \t   Charges \t Education \t Shift \t HospitalName \t LicenseNumber \t PatientId");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t "+rs.getString(3)+"\t  "+rs.getString(4)+"    \t    "+rs.getString(5)+"      \t    "+rs.getString(6)+"   \t"+rs.getString(7)+" \t"+rs.getString(8));
				
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
