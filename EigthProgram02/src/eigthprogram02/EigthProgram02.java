/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigthprogram02;

/**
 *
 * @author Tatha
 */import java.util.Scanner;

public class EigthProgram02 {
public static void displaySortedNumbers(double num1, double num2,double num3)
{
    if((num1<=num2)&&(num2<=num3)){
        System.out.printf("%f,%f,%f",num1,num2,num3);
    }
    else if((num2<=num3)&&(num3<=num1)){
        System.out.printf("%f,%f,%f",num2,num3,num1);
    }
    else{
         System.out.printf("%f,%f,%f",num3,num1,num2);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("Enter three number to be sorted");
        num1=input.nextDouble();
        num2=input.nextDouble();
        num3=input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
       
    }
    
}
