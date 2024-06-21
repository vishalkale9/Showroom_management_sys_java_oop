package ShowroomManagement;
import java.util.*;
public class Employee extends Showroom implements utility {
    String emp_name;
    String emp_id;
    int emp_age;
    
    @Override
    public void get_detail()
    {
        System.out.println("================= Employee Details =================");
        System.out.println();
        System.out.println("Employee id "+emp_id);  
        System.out.println("Employee Name "+emp_name);
        System.out.println("Emplyee Age "+emp_age);
         
    }
    @Override
    public void set_Details()
    {
    System.out.println("================= Plz Enter Employee Details =================");
    Scanner sc=new Scanner(System.in);
     System.out.println();
     UUID uuid = UUID.randomUUID();
     emp_id = String.valueOf(uuid);
     System.out.print("Employee Name :");
      emp_name=sc.nextLine();
      System.out.print("Employee Age :");
      emp_age=sc.nextInt();
     
    }
}
