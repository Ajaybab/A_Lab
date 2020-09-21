/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
import java.util.Scanner;
public class BankService {
    

    
    
     int value;
    
     
 public static void main(String[ ] args ){
      Scanner scanner = new Scanner(System.in);
      Double bankcharges;
      
      
      System.out.println("please enter the number of checks :");
        int value = scanner.nextInt();
        
        if(value< 20) {
            
         bankcharges =  (value*0.10) + 10;
         System.out.println("banks service fees for the month : "+bankcharges);
            
        }else if(value >=20 && value <39){
         bankcharges =  (value*0.08 + 10);
         System.out.printf("banks service fees for the month :"+bankcharges);
        
        }else if(value >=40 && value <59){
         bankcharges =  (value*0.06 + 10);
         System.out.printf("banks service fees for the month :"+bankcharges);
        
        }else if(value >=60){
         bankcharges =  (value*0.08 + 10);
         System.out.printf("banks service fees for the month :"+bankcharges);
        }else{
        System.out.println(" CHECKS ARE INVALID ");
        }
   
        
        
    }
}
        
    
    
    
 
 
 
    
}
