//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: <06>
// Due Date: <2/14/2024>
//-------------------------

   // import the Scanner class to enable
   // reading in from the keyboard
import java.util.Scanner;

public class HiLow {

   public static void main(String[] args) {
   
   // declare variables and
   // constants to be used
  final int MAX = 100;
  int target, currentCount, guess;
  int overallGuessCount, totalTargetCount;
  String again, stringOutput;
  double average;
  
      // assign the following variables
   currentCount = 0;
   overallGuessCount = 0;
   totalTargetCount = 0;
   
      // instantiate an object from the
      // Scanner class to enable reading
      // in from the keyboard
   Scanner keyboard = new Scanner(System.in);
   
      // construct a do-while loop to control
      // whether a user wants to continue playing
      // (this will be an outer do-while loop that will
      // have an inner do-while)
      // the condition of this outer do-while loop
      // will be as follows
      // while (again.equalsIgnoreCase ("y"));
     do
     {
         // tell the user what they have to do
         // “Guess a number between 1 and 100”
        System.out.println("Guess a number 1 and " +
                           MAX);
          // using the static Math class, call the
         // random method to randomly generate a
        // number between 1 and 100 inclusive
       // on both ends               
      target = (int) (Math.random() * MAX) + 1;   
      
      // increment how many times a new
      // number is generated
      // (i.e. totalTargetCount)
     totalTargetCount = totalTargetCount + 1;
     
         // initialize currentCount to be zero
       currentCount = 0;
       
       
               // construct an inner do-while loop to control
              // the amount of times a user needs
             // to successfully guess the target
            // number. The condition of this do-while
           // loop will be as follows
          // while (guess != target && guess > 0);
     do
     {
            // prompt the user to now enter
           // their guess; then read it in
      System.out.println("Enter your guess (0 to quit)");
      
      // read in the user's guess
      // and parse it into an integer
         guess = Integer.parseInt(keyboard.nextLine());
         
         // increment appropriate variables
         // (i.e. currentCount and overallGuessCount)
     currentCount = currentCount + 1;
     overallGuessCount++;
     
          // using an if statement, determine
          // whether the user entered a number
          // greater than zero; if this is true, then
         // test to see if the user’s guess is less
          // than the target number, or if it is
         // greater than the target number, or if it
        // is equal to the target number; print out
        // appropriate messages for each scenario
       // Note: this will be the end of the inner
      // do-while loop
     if (guess > 0) //user made a guess
     {
         if (guess < target) //too low
         {
            System.out.println("Your guess was too LOW.");
         }
         else if (guess > target) // too high
         {
            System.out.println("Your guess was too High.");
         }
         else
         {
            System.out.println("Correct! Amount of " + 
                                 "guesses " + currentCount);
         }
         
     }   //end outer if statment
         
         // end inner do-while loop
    } while (guess != target && guess > 0);        
    
          // prompt the user whether they
          // want to continue playing or not;
         // then read in their response
         // Note: this will be the end of the outer
         // do-while loop    
       System.out.println("\nPlay again (y/n)?");
       again = keyboard.nextLine(); 
             
          // end outer do-while loop     
 }while (again.equalsIgnoreCase("y"));
 
         // calculate the overall average for the
         // amount of guesses by the user
     average = (double) overallGuessCount / totalTargetCount;
     
             // using a conditional operator, determine
            // if the user is a good guesser or not!
           // Assign this to the string stringOutput
     stringOutput = (average > 10.0)
         ? "need a new strategy!"
         : "are a great guesser!";
     
            // print out appropriate message for average
            // guesses, number of target numbers, and
            // overall guesses
      System.out.print(" \nYou " + stringOutput);
      System.out.print(" \nYou averaged " + average +
                        " guesses for " + totalTargetCount +
                        " targets.");
      System.out.print("\nOverall guess count: " + 
                        overallGuessCount);
      
      System.out.println("\nThis program was written by Charles Lazcano");
      System.out.println("End of program.");
   
   } // end method main
   
} // end class HiLow