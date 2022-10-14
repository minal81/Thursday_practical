import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StremApi {

	public static void main(String[] args) {
		
		
		Student stud1 = new Student("jayesh",12,new Address("1234"),Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
	 
	        Student stud2 = new Student("Ashok",13,new Address("1235"),Arrays.asList(new MobileNumber("1111"), new MobileNumber("2222"), new MobileNumber("1233")));
	 
	        Student stud3 = new Student("manish",12,new Address("1236"),Arrays.asList(new MobileNumber("1234"), new MobileNumber("1233")));
	        Student stud9 = new Student("jaggy",12,new Address("1235"),Arrays.asList(new MobileNumber("3333"), new MobileNumber("2222")));
	 
	        List<Student> students = Arrays.asList(stud1, stud2, stud3,stud9);
	        
	        
	        System.out.println("1. Get student with exact match name : jayesh");
	        Optional<Student> stud = students.stream().filter(student -> student.getName().equals("jayesh")).findFirst();
	        System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
	        System.out.println("-----------------------------------------------------------------");
	        

	        System.out.println("2. Get student with matching address :1235");
	        Optional<Student> s1 = students.stream().filter(student -> student.getAddress().getZipcode().equals("1235")).findFirst();
	            System.out.println(s1.isPresent() ? s1.get().getName() : "No student found");
	            System.out.println("-----------------------------------------------------------------");
	          
	            
	        System.out.println("3. Get all student having mobile numbers 3333");
	        List<Student> s3 = students.stream().filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
	                .collect(Collectors.toList());
	     
	              String result1 = s3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	              System.out.println(result1);
	            System.out.println("------------------------------------------------------------------");
	            
	     
	            System.out.println("4. Get all student having mobile number 1233 and 1234"); 
	            List<Student> s4 = students.stream().filter(student -> student.getMobileNumbers().stream().allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
	                                                  .collect(Collectors.toList());
	         
	                String result4 = s4.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	                System.out.println(result4);
	                System.out.println("-----------------------------------------------------------------");
	                
	            
	               
	               System.out.println("5.Create a List<Student> from the List<TempStudent>");
	               
	               TempStudent tmpStud1 = new TempStudent(
	                   "jayesh1",
	                   201,
	                   new Address("12341"),
	                   Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
	        
	               TempStudent tmpStud2 = new TempStudent(
	                   "manish1",
	                   202,
	                   new Address("12351"),
	                   Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
	        
	               List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
	        
	               List<Student> studentList = tmpStudents.stream()
	                   .map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
	                   .collect(Collectors.toList());
	        
	               System.out.println(studentList);
	               System.out.println("------------------------------------------------------------------------------");
	        
	              
	               System.out.println("6.Convert List<Student> to List<String> of student name");
	              
	               List<String> studentsName = studentList.stream()
	                   .map(Student::getName)
	                   .collect(Collectors.toList());
	        
	               System.out.println(studentsName.stream().collect(Collectors.joining(",")));
	               System.out.println(studentsName.stream().collect(Collectors.joining(",", "[", "]")));
	               System.out.println("-------------------------------------------------------------------------------");
	        
	               
	               System.out.println("7.Convert List<students> to String");
	              
	               String name = students.stream()
	                   .map(Student::getName)
	                   .collect(Collectors.joining(",", "[", "]"));
	               System.out.println(name);
	               System.out.println("--------------------");
	        
	              
	                System.out.println("8.Change the case of List<String>");
	              
	               List<String> nameList =
	                   Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
	        
	               nameList.stream()
	                   .map(String::toUpperCase)
	                   .forEach(System.out::println);
	               System.out.println("-------------------------------------------------------------------");
	        
	               
	               System.out.println(" 9.Sort List<String>");
	               
	               List<String> namesList =Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
	        
	               namesList.stream().sorted().forEach(System.out::println);
	               System.out.println("------------------------------------------------------------------");
	        
	               
	                System.out.println("10.Conditionally apply Filter condition, say if flag is enabled then");
	               
	               boolean sortConditionFlag = true;
	        
	               Stream<Student> conditionalFilterResult = students.stream()
	                   .filter(std -> std.getName().startsWith("j"));
	        
	               if(sortConditionFlag){
	                   conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
	               }
	        
	               System.out.println("Before sorting :");
	               students.forEach(s -> System.out.println(s.getName()));
	        
	               List<Student> list = conditionalFilterResult.collect(Collectors.toList());
	               System.out.println("\n After filter and conditional sorting :");
	               list.forEach(s -> System.out.println(s.getName()));
	                
	                
	                
	}

}
