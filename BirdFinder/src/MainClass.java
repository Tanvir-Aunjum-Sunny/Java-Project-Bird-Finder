
import java.util.Scanner;

public class MainClass{
    
     
    static String name,colour,nature,location;
    static int living_duration,code;
     Scanner sc=new Scanner(System.in);
     /* public void set_info(){
          String name="";
          String colour="";
          String nature="";
          String location="";
          living_duration=0;
          code=0;
          
     }*/
     public void get_info(){
         System.out.println("Enetr Name");
         name=sc.nextLine();
         System.out.println("Enetr Colour");
         colour=sc.nextLine();
         System.out.println("Enetr Nature");
         nature=sc.nextLine();
         System.out.println("Enetr Location");
         location=sc.nextLine();
         System.out.println("Enetr Living Duration");
         living_duration=sc.nextInt();
         System.out.println("Enetr Code");
         code=sc.nextInt();  
     }
    
     public void display_info(){
     
         System.out.println(name);
         System.out.println(colour);
         System.out.println(nature);
         System.out.println(location);
         System.out.println( living_duration);
         System.out.println(code);
     }
      
   
   

    
}
