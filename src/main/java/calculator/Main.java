package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); // created a scanner system for everything to run through
        int sel; //created a variable to select the options inside of the loop
       do { // this will test the condition at least once even if the condition fails
           //while-loop you have to initialize with a random number,
           // do while you don't have to and it will run through at least one time
           System.out.println(" 1) Press 1 to add \n 2) Press 2 to subtract  " +
                   "\n 3) Press 3 to multiply \n 4) Press 4 to divide \n 5) Press 0 to cancel " );
           //gave the user menu options to choose from
           System.out.println("-----------------------------------------------");
           System.out.println("You're selecting: ");
           sel = input.nextInt();
           //nextInt == reads in a string of digits and converts them into an Int, Scanner created will read through it
           //then convert it into a numeric value, overall the scanner class will be able to read through this
           //scans the next token of the input as an int
           if(sel == 1){
               System.out.println("Enter the first number you want to add: ");
               int add1 = input.nextInt();
               System.out.println("Enter the second number you want to add: ");
               int add2 = input.nextInt();
               int sum = add1 + add2;
               System.out.println("Sum of the numbers is : " + sum);
               //this option adds the numbers
           } else if (sel == 2) {
               System.out.println("Enter the first number you want to subtract: ");
               int sub1 = input.nextInt();
               System.out.println("Enter the second number you want to subtract:  ");
               int sub2 = input.nextInt();
               int sub = sub1 - sub2;
               System.out.println("Subtracting the numbers together gives you:  " + sub);
               //this option subtracts the numbers
           } else if (sel == 3) {
               System.out.println("Enter the first number you want to multiply: ");
               int multiply1 = input.nextInt();
               System.out.println("Enter the second number you want to multiply: ");
               int multiply2 = input.nextInt();
               int multiply = multiply1 * multiply2;
               System.out.println("Multiplying the numbers together gives you: " + multiply);
               //this option multiplies the number
           } else if (sel == 4){
               System.out.println("Enter the first number you want to divide: ");
               double div1 = input.nextInt();
               System.out.println("Enter the second number you want to divide: ");
               double div2 = input.nextInt();
               double divide = div1 / div2;
               System.out.println("Dividing the numbers together gives you " + divide);
               //this option divides the number
           }
           else if( sel  == 0){
               System.out.println(" bye :( ");
               //if the user selects 0 it cancels the whole operation
           }
           else {
               System.out.println("-----------Invalid option! >:O---------------");
               // if the user puts in an invalid selection for example 6 it prints this message and returns
               //them to the main menu
           }
       } while(sel != 0); // it will come to the end and if a user presses any number other than 0 it will
        //continue to the loop, if its 0 then leaves the loop
        }
}
