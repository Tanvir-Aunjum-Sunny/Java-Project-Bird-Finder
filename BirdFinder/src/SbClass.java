
import java.util.Scanner;


public class SbClass extends SperClass{
            static String sbspcs;
    @Override
        public void subSpecies(){
            System.out.println("IF any new Sub Species invent then\n add this variety with your species");
            Scanner sc=new Scanner(System.in);
            sbspcs=sc.nextLine();               
        }
        public void sbdisplay(){
            System.out.println("The latest subspecies is "+sbspcs);
        
        }

}
