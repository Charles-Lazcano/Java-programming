//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: <08>
// Due Date: <2/21/2024>
//------------------------------

      // for GUIs using swing
import javax.swing.*;

      // import the Random class to enable
      // generating a random number
import java.util.Random;

public class Username {

   public static void main(String[] args) {
      // declare variables to be used
   int strLen, number, n;
   int singleNumber, copyNumber;
   String title, firstName, lastName;
   String fullName, userName, output;
   
      // instantiate an object from the Random
      // class to generate a random number
   Random rand = new Random();
   
         // invoke the method 'readInName' to read
          // in the user's first name and last name,
         // respectively, via JOptionPane then have
         // those names returned. Three actual parameters
         // are sent: string as a title, salutation, and
         // the keyboard object. Note: salutation must be
         // either "Dr. ", "Mr. ", "Sir ", or "Ms. "
   title = "Please enter your first name:";
   firstName = readInName(title, " ");
   
   title = "Please enter your last name:";
   lastName = readInName(title, "");   
   
         // generate a random number between 1 and 100
         // then display that number by sending it
         // the method 'displayString'
      n = rand.nextInt(100) + 1;
      output = "Your Number will be: " + n;
      displayString(output, "Display number");
      
         // if the number generated is larger
         // than 70, the invoke the method
         // 'displayString'
     if(n > 70)
     {
         output = "You will have a large number!";
         displayString(output, "Display large number");
     } //end if statememt
     
         // invoke the method 'createUsername'
         // to create a user name for the user. Three
         // actual parameters are sent: first name,
         // last name, and the random number that
         // was generated
    userName = createUsername(firstName, lastName, n);
    
         // display the userName by sending it
         // to the method 'displayString'
     output = "Your user name is: " + userName;
     displayString(output, "Display name");
     
         // determine the length of string
         // 'lastName' and assign it
         // to 'strLen'
    strLen = lastName.length();
    
         // prompt the user to enter a number that
         // has no more than 'strLen' digits by
         // invoking the 'readInNumber'.
         // Two actual parameters are sent:
         // string title and the number 10
    title = "Please enter a number that has " +
            "no more than " + strLen + " digits:";
    number = readInNumber(title, 10);
         // assign 'number' to 'copyNumber'
   copyNumber = number;
   
   output = "";
   
         // display the number backwards
         // one number per line; use a while loop
         // to invoke the methods 'getSingleNumber'
         // and 'changeNumber'
    while (copyNumber != 0)
    {
      singleNumber = getSingleNumber(copyNumber);
      output = output + singleNumber + "\n";
      copyNumber = changeNumber(copyNumber);
      
    } // end while loop
    
         // display 'output' string by
         // invoking the method 'displayString'
      displayString(output, "Your number backwards");
         // build up string for final output
      fullName = firstName + " " + lastName;
      output = "\nThis program was written by " +
         fullName + "." +
         "\nEnd of program.";
         
         // display final 'output' string by
         // invoking the method 'displayString'
      displayString(output, "Good bye!");
     
 } // end method main
 
 public static int changeNumber (int n)
 {
            // chop off (truncate) the last digit
            // of the number 'n' and then return
            // what is left of this number 'n'
         n =n / 10;
         return n;
 
 } // end changeNumber
 
  public static int getSingleNumber(int n)
  {
         // declare local variable called 'oneNumber'
       int oneNumber;
       
         // get the last digit of the number
         // 'n' and then return it
       oneNumber = n % 10;
       return oneNumber;
       
  }   // end method getSinlgeNumber
   
   public static int readInNumber (String prompt, int n)
   {
      // declare local variable called 'aNumber'
    String aNumberText;
    int aNumber;
         // prompt the user to enter a number
         // and then read it in via JOptionPane
    aNumberText = JOptionPane.showInputDialog(null,
                                              prompt);
    aNumber = Integer.parseInt(aNumberText);
    
         // if number is greater than
         // 100,000,000 then reduce it
         // by a factor of 10
    if (aNumber >  100000000)
    {
      aNumber = aNumber / n;
      JOptionPane.showMessageDialog(null,
         "Your number has been reduced to a factor of 10",
         "Number reduction",
         JOptionPane.INFORMATION_MESSAGE);
    }    // end if statement
    
         // return this number
        return aNumber;       
        
 }     //end method readInNumber
   
   public static String createUsername(String first,
                                       String last, int n)
   {
         // declare local variable called 'newName'
      String newName;
      
         // strip off salutation
      first = first.substring(4);
      
         // construct a user name with the first character
         // of the first name with three characters of last
         // name (starting with the second character)
         // and with a random number between 1 and 100
      newName = first.charAt(0) + last.substring(1, 4) + n;
      
         // convert this user name to lower case
      newName = newName.toLowerCase();
      
         // and then return it
      return newName;
   }  // end method createUsername                                    
                                       
   public static void displayString(String outString,
                                      String header)
   {
      // display the formal parameter 'outString'
     JOptionPane.showMessageDialog(null,
                      outString,
                      header,
                      JOptionPane.INFORMATION_MESSAGE);
   } // end method displayString
   
   
   public static String readInName(String prompt,
                                   String salutation)
   {
         // declare local variable
         // called 'oneString'
       String oneString;
         
         // prompt the user and then read in a
         // string via JOptionPane
       oneString = JOptionPane.showInputDialog(null,
                                               prompt);
                                               
        // add on salutation
      oneString = salutation + oneString;
        
        // return this string                                       
      return oneString;
         
   } // end method readInName
   
} // end class Username