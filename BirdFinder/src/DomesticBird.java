
import java.util.Scanner;

public class DomesticBird extends MainClass{
    static String genus;
    static  String species;
    public void genusspecies(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Genus && Species");
        genus=sc.nextLine();
        species=sc.nextLine();    
    }
   

  public void display_genus_species(){
      System.out.println(genus);
      System.out.println(species);
  
  }
   
}
