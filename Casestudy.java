import static java.lang.System.out;
import java.util.Scanner;

public class CaseStudy {
   
// Part of Brenden Aguilar I
public void integers(){
       	 int c;
        	for (c=1;c<=5;c++){
            System.out.println(c);
        }
        System.out.println("-------------------------");
    }
    
    public void Reverseorder(){
        int d;
        for (d=5;d>=0;d--){
            System.out.println("A Reverse Order:"+d);
        }
    }
    public void intro(){
        int a;
        System.out.println("Introducing our Group");
          System.out.println("This is our simple program");
       
    }
    public void Leader(){
        int a;
        System.out.println("Hi, I'm Brenden C. Aguilar");
          System.out.println("Leader in IPT2");
       
    }
        public void groupmember(){
        int a;
        System.out.println("List of Team Members:");

    }

// Part of Angelica Guitierrez
     public void member1(){
        int b;
        System.out.println("I'm Angelica Guitierrez");
        System.out.println("From San Miguel Tarlac City");
           System.out.println("Part of this group");
           System.out.println("\n");
     
    }

//Part of Jellie Edejer
     public void member2(){
        int b;
        System.out.println("I'm Jellie Edejer");
        System.out.println("From Sitio Tarican Brgy. Matatalaib Tarlac City");
           System.out.println("Part of this group");
           System.out.println("\n");
         
    }

//Part of Benjamin N. De Erit
     public void member3(){
        int b;
        System.out.println("I'm Benjamin N. De Erit");
        System.out.println("From Moncada, Tarlac");
           System.out.println("Part of this group");
           System.out.println("\n");
      
    }

//Part of Gomer L. Santos
     public void member4(){
        int b;
        System.out.println("I'm Gomer L. Santos");
        System.out.println("From San Juan, Concepcion Tarlac");
           System.out.println("Part of this group");
           System.out.println("\n");       
     }

     //Part of Byron L. Miranda
     public void member5(){
        int b;
        System.out.println("I'm Byron L. Miranda");
        System.out.println("No Address yet");
           System.out.println("Part of this group");
           System.out.println("\n");       
     } 
      public void endpro(){
        int b;
        System.out.println("Proceed to the next program");
      }
  
  public static void main(String[] args) {
     CaseStudy objint = new CaseStudy();
        objint.intro();
        objint.Leader();
           System.out.println("\n");
           objint.groupmember();
           objint.member1();
           objint.member2();
           objint.member3();
           objint.member4();
           objint.member5();

        objint.integers();
        objint.Reverseorder();
        System.out.println("\n");
      
 //Part of Brenden Aguilar II
         Scanner sc = new Scanner(System.in);
         objint.endpro();
        System.out.println("Input two digit or more to see DIAMON:");
        
        int row = sc.nextInt();
        sc.close();
        CaseStudy d = new CaseStudy();
        d.upperDiamond(row);
        d.lowerDiamond(row - 2);
    }
    public void upperDiamond(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = a - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < 2 * i - 1; k++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    public void lowerDiamond(int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int k = 0; k < 2 * (b - i) - 1; k++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.println("Task Complete!");
        System.out.println("End of the program. Thank you :)");      
    }
}
