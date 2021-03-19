
package casestudy;
import static java.lang.System.out;
import java.util.Scanner;
public class CaseStudy {

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
   
    public void Leader(){
        int a;
        System.out.println("Hi, I'm Brenden Aguilar");
          System.out.println("Leader in IPT2");
            
        
    }
  public static void main(String[] args) {
     CaseStudy objint = new CaseStudy();
        
        objint.Leader();
           System.out.println("\n");
 
        objint.integers();
        objint.Reverseorder();
       
        
        System.out.println("\n");
        
        System.out.println("Task i complete!");
        
         Scanner sc = new Scanner(System.in);
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
        System.out.println("End of the Program");
    }
}
    
