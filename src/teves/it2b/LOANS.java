package teves.it2b;

public class LOANS {
  String id , name; 
  int min, cs,el; 
  
   
  public void addloan(String lid,String lname, int lmin, int lcs, int lel){
      this.id = lid;
      this.name = lname;
      this.min = lmin;
      this.cs = lcs;
      this.el = lel;
      
  }
  public void viewloan(){
      
      
      System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s |",
      "ID", "NAME" , "MONTHLY" , "CREDITS" , "EXISTING" ) ;    
      System.out.printf("\n| %-10s | %-10s | %-10d | %-10d | %-10d |",
      this.id , this.name , this.min , this.cs , el ) ;
  
  }
  
 
}
