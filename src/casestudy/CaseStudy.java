
package casestudy;

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
    public void member1(){
        int b;
        System.out.println("I'm Angelica Guitierrez");
        System.out.println("From San Miguel Tarlac City");
           System.out.println("Part of this group");
           System.out.println("\n");
           System.out.println("This is our simple program");
        
    
    }
     public void member2(){
        int j;
        
        System.out.println("End of our Program");
    
    }
    public static void main(String[] args) {
         CaseStudy objint = new CaseStudy();
        
        objint.Leader();
           System.out.println("\n");
        objint.member1();
           System.out.println("\n");
        objint.integers();
        objint.Reverseorder();
   
        
        System.out.println("Task i complete!");
        System.out.println("\n");
        objint.member2();
        
    }
    
}
