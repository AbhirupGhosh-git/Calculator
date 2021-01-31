package com.epam.calculator;
import java.util.*;
import java.lang.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        while(true) {
            Scanner sc = new Scanner(System.in);
            Scanner st = new Scanner(System.in);

            try {
                System.out.print("Enter the first number: ");
                Double a = sc.nextDouble();
            }
            
            catch(NumberFormatException nfe){
                System.out.println("Please enter a number");
			}

            try {
                System.out.print("Enter the second number: ");
                Double b = sc.nextDouble();
            }
            
            catch(NumberFormatException nfe){
                System.out.println("Please enter a number");
			}


            System.out.println("Enter '+' for Addition \nEnter '-' for Subtraction \nEnter '*' for Multiplication \nEnter '/' for Division \nEnter '!' to Exit");

            System.out.print("Enter your choice: ");
            String choice = st.nextLine();

            //System.out.println(a+", "+b+", "+choice);

            Double cal=0.0;
            int check = 0;

            switch(choice) {
                case "+": {
                    cal = a+b; check = 1; break;
                }

                case "-": {
                    cal = a-b; check = 1; break;
                }

                case "*": {
                    cal = a*b; check = 1; break;
                }

                case "/": {
                    cal = a/b; check = 1; break;
                }

                case "!": {
                    System.exit(0); check = 1; break;
                }

                default: System.out.println("Invalid Choice");
            }

            if(check == 1) {
                System.out.println("Result: " + cal);
            }
        }
    }
}
