
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
public class CHART
 {
    public static void main(String[] args){
      
        Scanner Keyboard = new Scanner ( System.in );
        double sales=0;
        double storesales1;
        double storesales2;
        double storesales3;
        double storesales4;
        double storesales5;
        System.out.println("Enter the sales for today in 1");
        storesales1 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in 2");
        storesales2 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in  3");
        storesales3 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in 4");
        storesales4 = Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.println("Enter the sales for today in 5");
        storesales5 = Keyboard.nextDouble();
        Keyboard.nextLine();
      /*  if(sales >=100 || sales <=200)
        {
            System.out.println("asterix");
        }*/
        for( int i=1;i<=storesales1/100;i++ )
     {
         
     System.out.print("*");
     }
        System.out.println();
        for( int i=1;i<=storesales2/100;i++ )
        {
            System.out.print("*");
        }
        System.out.println();
        for ( int i=1;i<=storesales3/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=storesales4/100;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for( int i=1;i<=storesales5/100;i++)
        {
            System.out.print("*");
        }
        }
        
            
        }    

