//--------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: 04
// Due Date: 2/7/2024
//---------------------------------
   // import the Scanner class to enable
   // reading in from the keyboard
import java.util.Scanner;

public class NumberOperations {
   
   
   
   
   public static void main(String[] args) {
            // declare variables to be used
           int number1, number2;
           int answer1, selection;
           double answer2;
           boolean done, invalidChoice;
      
                   // assign the following variables
               answer1= -1;
               answer2 = 1.0;
               selection = 0;
               done = false;
               invalidChoice = false;
               
                   // instantiate an object from the
                   // Scanner class to enable reading
                   // in from the keyboard
            Scanner keyboard = new Scanner(System.in);
   
                   // prompt the user to enter the first number,
                  // then read it in; do the same for the
                  // second number
            System.out.println("Enter first number:");
            number1 = keyboard.nextInt();
            
            System.out.println("Enter second number:");
            number2 = keyboard.nextInt();
            
            
            // iterate through while loop until
            // user wants to exit the program
            // for your condition use the expression
            // (done not equal to true 
          while (done !=true)
          {
                   // print out menu for the user
                   // to select from
                   System.out.println("\nPlease select operation " +
                                        "type for " +
                                        number1 + " and " +
                                        number2 + "\n");
                    System.out.println("1 - add these two numbers");
                     System.out.println("2 - subtract second number " + 
                                          "from first number");
                      System.out.println("3 - multiply both numbers");
                       System.out.println("4 - integer division " + 
                                             "(first number / second number)");
                        System.out.println("5 - floating point division " + 
                                             "(first number / second number)");
                         System.out.println("6 - Exit\n");
                         
                               // read in from the keyboard what
                              // the user has entered
                        selection = keyboard.nextInt();
                        
                              // using nested if statements, determine what
                             // operation the user has selected (add, subtract,
                            // multiply, etc.)
                        if(selection == 1) // add
                        {
                           answer1 = number1 + number2;
                           invalidChoice = false;
                        }
                        else if (selection == 2)   //subtract
                        {
                            answer1 = number1 * number2;
                            invalidChoice = false; 
                        }
                        else if (selection == 3) //multiply
                        {
                           answer1 = number1 / number2;
                           invalidChoice = false;
                        }
                        else if (selection == 4) // integer division
                        {
                           answer1 = number1 / number2;
                           invalidChoice = false;
                        }
                        else if (selection == 5) // floating point
                        {                         // division
                           answer2 = (double) number1 / number2;
                           invalidChoice = false;
                        }
                        else if (selection == 6)   // exit program
                        {
                           done = true;
                           invalidChoice = false;
                        }
                        else  //invalid choice
                        {
                           invalidChoice = true;
                           System.out.println("\n***ERROR*** " +
                                                " is not a valid selection. " + 
                                                "Please try again!"); 
                        }
                        
                              // using nested if statements, determine
                              // the type of output to produce
                        if(selection == 5 && invalidChoice == false)
                        {
                           System.out.println("\nCalculated answer is: " + 
                                                answer2);
                        }
                        else if (selection != 6 && invalidChoice == false)
                        {
                           System.out.println("\nCalculated answer is: " + 
                                                answer1);
                        }
                        else
                        {
                           System.out.println("\nNo calculation done.");
                        }
          } //end while loop  
            
            System.out.println("\nThis program was written by Charles Lazcano");
            System.out.println("End of program.");
            
   } //end main method
   
}   //end class NumberOperation