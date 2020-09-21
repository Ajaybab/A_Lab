
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class ADDINGNUMBERS {
  public static void main(String[ ] args ) {
        Scanner sc= new Scanner(System.in);
        int NUMBER1;
        NUMBER1=sc.nextInt();
        
        int  NUMBER2;
        int NUMBER3=0;
        System.out.println("GIVE THE NUMBER AS YOU WANT:-");
       for(NUMBER2=1;NUMBER2<=NUMBER1;NUMBER2++)
       {
            NUMBER3=NUMBER3+NUMBER2;
           
           
          }  
      
       System.out.println("ADDING THE GIVEN NUMBERS OF THE VALUE:"+NUMBER3);
            
      
             
        }    
}
