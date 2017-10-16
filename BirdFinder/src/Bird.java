import java.util.Scanner;


public class Bird {
          static  int p ,i;
          static  int n;
          static int x;
    public static void main(String[] args) {
      //SbClass f=new SbClass();
       
    HunterBird[] obj=new HunterBird[100];
      do{
           Scanner sc=new Scanner(System.in);
           System.out.println("What do you want to do?\n1.Input Bird's informaytion\n2.Display\n3.Search\n4.Exit");
           n=sc.nextInt();
            switch(n){
               case 1:
                    System.out.println("Please select Bird's category");
                    System.out.println("1.Domestic\n2.Hunter");
                    int m = sc.nextInt();
            switch(m){
                case 1:
                    System.out.println("Domestic Bird's info");
                    System.out.println("How many Bird's you want to input?");
                    p=sc.nextInt();
                    for(i=1;i<=p;i++){
                    obj[i]=new HunterBird();
                    obj[i].get_info();
                    obj[i].genusspecies();
                   // f.subSpecies();
                    }
                    break;
                case 2:
                    System.out.println("Hunter Bird's info");
                    System.out.println("How many Bird's you want to input?");
                    p=sc.nextInt();
                    for(i=1;i<=p;i++){
                    obj[i]=new HunterBird();
                    obj[i].get_info();
                    obj[i].genusspecies();
                   
                    }
                    break;
            }
            break;
                case 2://DISPLAY
                    System.out.println("Display the inputted data by the user");
                    for(i=1;i<=p;i++){
                    obj[i]=new HunterBird();
                    obj[i].display_info();
                    obj[i].display_genus_species();
                  
                    }
                    break;          
            }
            break;
        } while(n!=0);
      
    }
  }
    
   

