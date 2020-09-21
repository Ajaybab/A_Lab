
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
public class Grades
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        float scoreone;
        double scoretwo;
        double scorethree;
        double Avg;
        
        
        
        
        
        
        System.out.println("Enter the score 1 : ");
        scoreone = scanner.nextFloat();
        
        
        System.out.println("Enter the score 2: ");
        scoretwo = scanner.nextDouble();
        
        
        System.out.println("Enter the score 3: ");
        scorethree = scanner.nextDouble(); 
        
        Avg = ( scoreone + scoretwo + scorethree )/3;
        if(Avg < 60)
        {
            System.out.println("GRADE F: "+Avg);

        }
        else if (Avg <70 && Avg>=60)
        {
            System.out.println("GRADE D: "+Avg);
        }  
        else if (Avg <80 && Avg>=70)
        {
            System.out.println("GRADE C: "+ Avg);

        }else if (Avg <90 && Avg>=80)
        {
            System.out.println("GRADE B: "+ Avg);
        }else if (Avg<100 && Avg>=90)
        {
            System.out.println("GRADE A: "+ Avg);
        }else  
        {
        System.out.println( " not a valid number");
}
}
}