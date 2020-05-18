/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplecalculations;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class SimpleCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        String input;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the first floating number");
        input = sc.next();
        float num1 = Float.valueOf(input);
        
        System.out.println("Please enter the second floating number");
        input = sc.next();
        float num2 = Float.valueOf(input);
        
        System.out.println("Please enter the operand");
        input = sc.next();
        char operand = input.charAt(0);

        System.out.println(calculate(num1,num2,operand));
    }
    

    private static String calculate(float num1, float num2, char operand){
        if(operand == '+'){
            return Float.toString(num1 + num2);
        }
        else if(operand == '-'){
            return Float.toString(num1 - num2);
        }
        else{
            return "Wrong operand provided";
        }
    }

}
