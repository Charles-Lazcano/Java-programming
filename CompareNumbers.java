//------------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: <03>
// Due Date: <2/7/20>
//-------------------------------------
// import the Scanner class to enable
// reading in from the keyboard
import java.util.Scanner;

public class CompareNumbers {



public static void main(String[] args) {
   // declare variables to be used
    int number1, number2;
    
        // instantiate an object from the
        // Scanner class to enable reading
        // in from the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    // prompt the user to enter the first number,
   // then read it in; do the same for the
   // second number
   System.out.println("Enter the first number: ");
   number1 = keyboard.nextInt();
   
    System.out.println("Enter the second number: ");
   number2 = keyboard.nextInt();
   
   
   // determine if the second number is less than 20
   if(number2 < 20)
   {
      System.out.println("\nSecond number is less " +
                                 "than 20");
   }
   
   // triple the value of the first number
   // then print out this new value
   number1 = number1 * 3;
   System.out.println("number1 is now: " +
                        number1);
   
   // quadruple the value of the second number
   // then print out this new value
   //number2 = number2 * 4;
   number2 *= 4;
   System.out.println("\nnumber2 is now: " +
                           number2);
   
   // determine if the first number is an even number
   // if so print out that it is an even number;
   // otherwise, print out that it is an odd number
   if(number1 % 2 == 0)
   {
      System.out.println("\nnumber1 is an even number");
   }
      else
      {
         System.out.println("\nnumber1 is an odd number");
      }
      
   
   // determine if both numbers are over 25;
   // if so, print out that they are
   if(number1 > 25 && number2 > 25)
   {
       System.out.println("\nBoth numbers are " + 
                                 "over 25");
   }
   
   // determine if number1 is greater 50 or
   // if number2 is less than or equal to 10
   // if either are correct, then print out
   // an appropriate message
      if (number1 > 50 || number2 <= 10)
      {
            System.out.println("\nnumber1 is over 50 or " + 
                                          "number2 is less that or " +
                                          "equal to 10");
      }
      System.out.println("\nThis program was written by Charles Lazcano");
      System.out.println("End of program.");
      
   }   //end method main
   
}  // end class Compare Numbers
   
      