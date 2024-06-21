package ShowroomManagement;
import java.util.*;
public class Showroom implements utility{

   String ShowroomName;
   String Adress;
   String ManagerName;
   int Total_Emoloyee;
   int Total_carIn_Stock=0;


    @Override
   public void set_Details()
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("================= Enter Showroom Details =================");
    System.out.println();
    System.out.print("Showroom Name :");
     ShowroomName=sc.nextLine();
     System.out.print("Showroom Address :");
     Adress=sc.nextLine();
     System.out.print("Manager Name :");
     ManagerName=sc.nextLine();
     System.out.print("Total No Of Employee :");
     Total_Emoloyee=sc.nextInt();
     System.out.print("Total No Of Cars In Stocks :");
     Total_carIn_Stock=sc.nextInt();
     Total_carIn_Stock++;

   }

   @Override
   public void get_detail()
   {
    System.out.println("ShoeroomName "+ShowroomName);
    System.out.println("ShowroomAddress "+Adress);
    System.out.println("ManagerName "+ManagerName);
    System.out.println("Total Employee "+ Total_Emoloyee);
    System.out.println("Total Cars In Stocks "+Total_carIn_Stock);
    
   }
    
    
}
