import java.util.Scanner;

class StudentInfo
{
public static void main(String arg[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Student 8 digit ID:-");
    long ID=s.nextLong();
	System.out.println("Enter the Student Address:-");
	String Address=s.next();
	System.out.println("Enter the Student PHONE NUMBER:-");
	long PhoneNumber=s.nextLong();
	System.out.println("Enter the Student GENDER:-");
	char Gender=s.next().charAt(0);
	System.out.println("Enter the Student DATE OF BIRTH:-");
	long DOB=s.nextLong();
	System.out.println("Enter the Student HEIGHT:-");
	float Height=s.nextFloat();
	System.out.println("Enter the Student WEIGHT:-");
	byte Weight=s.nextByte();
	System.out.println("Enter the Student DEGREE PURSUED:-");
	String DegreePursued=s.next();
	System.out.println("Enter the Student Year Of Study:-");
	byte YearOfStudy=s.nextByte();
	System.out.println("Enter the Student Average GPA:-");
	float GPA=s.nextFloat();
	System.out.println("Enter the Student Tuition Grant (y/n):-");
	char TuitionGrant=s.next().charAt(0);
	System.out.println("Enter the Student Scholar (y/n):-");
	char Scholar=s.next().charAt(0);
	
	
	System.out.println(" the Student ID:-"+ID);
	System.out.println(" the Student Address:-"+Address);
	System.out.println(" the Student PhoneNumber:-"+PhoneNumber);
	System.out.println("the Student Gender:-"+Gender);
	System.out.println("the Student Date Of Birth:-"+DOB);
	System.out.println(" the Student Height:-"+Height);
	System.out.println(" the Student Weight:-"+Weight);
	System.out.println(" the StudentDegreePursued:-"+DegreePursued);
	System.out.println(" the Student YearOfStudy:-"+YearOfStudy);
	System.out.println(" the Student Average GPA:-"+GPA);
	System.out.println(" the Student TuitionGrant:-"+TuitionGrant);
	System.out.println("the Student Scholar:-"+Scholar);
}
}
	
	