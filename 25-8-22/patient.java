import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class patient {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Patient Id");
		//int P_Id=sc.nextInt();
		System.out.println("Enter the Patient Name");
		String P_name=sc.next();
		System.out.println("Enter the Patient Gender");
		String P_gender=sc.next();
		System.out.println("Enter the Patient  Disease");
		String P_Disease=sc.next();
		System.out.println("Enter the Patient OPd");
		String OPD=sc.next();
		System.out.println("Enter the Patient IPD");
		String IPD=sc.next();
		System.out.println("Enter the Patient Age");
	    String age=sc.next();
		*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minal", "root", "Minal@2000");
			Statement s=con.createStatement();
			
			
			//s.execute("create table Patient(PatientId int primary key auto_increment ,PatientName varchar(20) not null , Gender varchar(20) , Disease varchar(20) not null , OPd varchar(20), IPD varchar(20) ,Age int not null);");
			//System.out.println("table create....");
			
			/*PreparedStatement ps=con.prepareStatement("insert into Patient(PatientName, Gender,Disease,OPd , IPD,Age) values(?,?,?,?,?,?);");
			ps.setString(1, P_name);
			ps.setString(2, P_gender);
			ps.setString(3,P_Disease);
			ps.setString(4, OPD);
			ps.setString(5, IPD);
			ps.setString(6,age);
			
			ps.executeUpdate();*/  
			
			
			
			ResultSet rs=s.executeQuery("select PatientId,PatientName,Gender,Dieses,OPd,IPd,Age from Patient");
			System.out.println("PatientId \tPatientName \t\t Gender \t Disease \t OPd \t IPd \t Age");
			System.out.println("----------------------------------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(rs.getString(1)+" \t\t    "+rs.getString(2)+"\t\t "+rs.getString(3)+"\t\t "+rs.getString(4)+"\t\t "+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7));
				
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
