package ShowroomManagement;
import java.util.*;
public class Car extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;

    @Override
   public void set_Details()
    {
        System.out.println("================= Plz Enter Car Details =================");
        System.out.println();
        Scanner sc=new Scanner(System.in);
;        System.out.print("Car Name :");
        car_name=sc.nextLine();
        System.out.print("car Colour :");
        car_color=sc.nextLine();
        System.out.print("car Fuel Type :");
        car_fuel_type=sc.nextLine();
        System.out.print("car Price ");
        car_price=sc.nextInt();
        Total_carIn_Stock++;

    }

    @Override
    public void get_detail(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        
    }
}
