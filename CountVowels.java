//--------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: 05
// Due Date: 2/14/2024
//---------------------------------
      // import the Scanner class to enable
      // reading in from the keyboard
import java.util.Scanner;

public class CountVowels{

   public static void main(String[] args){
      // declare variables to be used
   int acount, ecount, icount;
   int ocount, ucount, ycount;
   int consonant, index;
   String oneString, output, answer;
   char charAnswer;
   boolean keepGoing = true;
   
       // instantiate an object from the
       // Scanner class to enable reading
       // in from the keyboard
   Scanner keyboard = new Scanner(System.in);
   
         // construct a do-while loop to control
        // whether a user wants to continue entering
       // a string (this will be an outer
      // do-while loop that will have an inner
     // for loop)
    do
    {
            // assign the following variables
            acount = 0;
            ecount = 0;
            icount = 0;
            ocount = 0;
            ucount = 0;
            ycount = 0;
            consonant = 0;
            
            
               // prompt the user to enter a string,
               // then read it in
             System.out.println("\nEnter a string: ");
             oneString = keyboard.nextLine();
             
                  // convert the entire string to lower case
             oneString = oneString.toLowerCase();
             System.out.println("Lower caser string is now: " +
                                 oneString);
                                 
                  // construct a for loop to iterate character by
                  // character in the string; use the built in
                  // string method length() to accomplish this
            for (index = 0; index < oneString.length(); index++)
            {
                  // using a switch statement, determine
                  // what vowel the current character
                  // is (or consonant) and update its
                  // proper counter
               switch (oneString.charAt(index))
               {
                case 'a' :acount++; break;
                case 'e' :ecount++; break;
                case 'i' :icount++; break;
                case 'o' :ocount++; break;
                case 'u' :ucount++; break;
                case 'y' :ycount++; break;
                default: consonant++;
               }  //end switch statement
           }  //end for loop
                        // outside the for loop, build up a string
                        // for printing out info about the
                        // occurrences of each vowel and consonant
               output = "\nNumberof each vowel is in the string: " +
                        "\na: " + acount +
                        "\ne: " + ecount +
                        "\ni: " + icount +
                        "\no: " + ocount +
                        "\nu: " + ucount +
                        "\ny: " + ycount +
                        "\nconsonant: " + consonant;
                      
                      // print out this newly constructed string
               System.out.println(output);
               
               
                     // prompt the user whether they want to
                     // continue to enter another word
                     // then read it in
               System.out.println("\n\nWould you like to continue " +
                                    "with another word? (y/n)");
                answer = keyboard.nextLine();
                
                // extract out the first character of
               // the user’s response
              charAnswer = answer.charAt(0);
              if(charAnswer == 'y' || charAnswer == 'Y')
              {
               keepGoing = true;
              }
              else
              {
               keepGoing = false;
              } 
                       
    } while (keepGoing == true);
     
     
     System.out.println("\nThis program was written by Charles Lazcano");
System.out.println("End of program.");
   
   } //end method main
   
} //end class CountVowels