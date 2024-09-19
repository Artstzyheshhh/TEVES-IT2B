
package teves.it2b;
import java.util.Scanner;
public class LOAN {
    
   public void getloan(){
    Scanner sc = new Scanner(System.in);
    LOANS[] Ln= new LOANS[100];
       System.out.println("Enter number of applications: ");
       int numacc = sc.nextInt();
       
       for (int  i = 0; i<numacc; i++){  
        
          Ln[i] = new LOANS();
        System.out.println("Enter details of applications"+(i+1)+": ");
        System.out.print("Enter ID:");
        String id = sc.next();
        System.out.print("Enter name:");
        String name = sc.next();
        System.out.print("Enter monthly income:");
        int min = sc.nextInt();
        System.out.print("Enter credits score:");
        int cs = sc.nextInt();
        System.out.print("Enter existing loan:");
        int el = sc.nextInt();
      Ln[i].addloan(id, name, min, cs, el);
       }
       for(int i=0; i < numacc ; i++){}
       
       
       
   }
}
