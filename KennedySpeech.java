//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <009>
// Semester: <Spring 2024>
// Assignment #: Semester project
// Due Date: <3/6/2024>
//------------------------------

// import classes needed
import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class KennedySpeech {

    /**
     * Main method of the program.
     * 
     * @param args Command line arguments (not used).
     * @throws FileNotFoundException If the input or output file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
      
            // declare variables to be used
            // in this program
        int max;
        String output;
        File f = new File("OriginalSpeech.txt");
        File f2 = new File("FormattedSpeech.txt");
        File f3 = new File("FormattedSpeech.txt");
        Scanner keyboard = new Scanner(System.in);
        Scanner inputFile = new Scanner(f);
        Scanner inputFile2 = new Scanner(f2);
        PrintStream outputFile = new PrintStream(f3);

        
            // print out absolute path name of file
            // that holds the unformatted speech
        displayAbsolutePath(f);
      
            // invoke method 'getNumCharacters' to get
            // the number of characters from the user
      max = getNumCharacters();

            // print out title for file that will
            // hold the formatted speech
        output = "\nPresident's Kennedy's inaugural speech " +
         " with " + max + " characters per line:";
      outputFile.println(output);
      outputFile.println();
      
            // invoke method 'readFromfile' to read unformatted
            // speech and then format it
        readFromFile(inputFile, outputFile, max);
      
            //close files
      closeFile(inputFile);
      closeFile(outputFile);
        
            // print out formatted speech by invoking
            // method 'printFormattedSpeech'
      printFormattedSpeech(inputFile2);
      closeFile(inputFile2);
         
             //build up string for final output
         output = "This program was written by Charles Lazcano." +
                  "\nEnd of program.";
        
                  // print final 'output' string by
                  // invoking the method 'printString'
         printString(output);
         
    }   // end method main
    
    /**
     * This method prompts the user to input the number of characters per line
     * for the formatted speech.
     * 
     * @return The number of characters per line as entered by the user.
     */
    public static int getNumCharacters()
    {       
      String numCharactersText;
      int numCharacters;
      
      
            // Prompt the user for the number of characters
            // on each line that the formatted speech will
            //have, then read it in 
            
     numCharactersText = JOptionPane.showInputDialog(null,
      "How many characters per line would you like?");
     numCharacters = Integer.parseInt(numCharactersText);
      
            // return this number
        return numCharacters;
    }   // end method getNumCharacters
    
    /**
     * This method displays the absolute path of the input file.
     * 
     * @param f The input file whose absolute path is to be displayed.
     */
    public static void displayAbsolutePath(File f)
    {
            // print out absolute path of input file
         JOptionPane.showMessageDialog(null,
            "The absolute path of original " +
            "file is: \n" +
            f.getAbsolutePath(),
            "Absolute path of original file",
            JOptionPane.INFORMATION_MESSAGE);
            
    }   // end method printAbsolutePath
    
    /**
     * This method reads from the input file, formats the speech, and writes
     * the formatted speech to the output file.
     * 
     * @param inputFile  The scanner object for reading from the input file.
     * @param outputFile The print stream object for writing to the output file.
     * @param max        The maximum number of characters per line for formatting.
     */
    public static void readFromFile(Scanner inputFile,
                      PrintStream outputFile,
                      int max)
    {
         String word;
         int wordCount, lineCount = 0;
         boolean answer;
         
            // using a while loop, go through each 'word' 
            // of the unformatted speech and place it in its
            // appropriate place in the formatted file
           while (inputFile.hasNext())
         {
               word = inputFile.next();
               wordCount = word.length();
               
               //invoke the method 'checkIfParagraghNumber'
               //to see if this current 'word' is a 
               //paragraph number
               answer = checkIfParagraphNumber(word);
                     // it is a paragraph number
                   if (answer)
                   {
                        //advance two lines for new
                        //paragraph and change value of 
                        // 'lineCount' to start again
                        // at zero
                      outputFile.println();
                      outputFile.println();
                      lineCount = 0;
                      
                   } // end outer if statement
                     
                     //not a paragraph
                   if (answer == false)
                   {
                        //we will go beyond the number of
                        // characters on this curremt line
                     if   ((lineCount + wordCount + 1) >= max)
                     {
                           // start new 'lineCount'
                         lineCount = 0;
                         
                           //update new value of 'lineCount'
                           //that includes thwe length of this
                           // word plus one (for a space)
                         lineCount = lineCount + wordCount + 1;
                         
                                 //print out this word to
                                 //the formatted file
                              outputFile.println();
                              outputFile.println(word + " ");
                       }     //end if statement 
                       else      //can safely continue printing this
                       {         //fits on this line without
                                 //exceeding 'max' characters)
                                 
                             outputFile.print(word + " ");
                             
                                 // update new value of 'lineCount
                                 // that includes the length of this
                                 // word plus one (for a space)
                             lineCount = lineCount + wordCount + 1;
                       
                       }// end else statement 
                   
                   }  // end outer if statment
               
         }  //end while loop
    
    }   // end method readFromFile
   
    
    /**
     * This method checks if a given word is a paragraph number.
     * 
     * @param word The word to be checked.
     * @return True if the word is a paragraph number, otherwise false.
     */
    public static boolean checkIfParagraphNumber(String word)
    {
      char aChar;
      int i, n;
      boolean answer;
              
            // get the length of this current 'word'
        n = word.length();
      i = 0;
      
            // using a while loop, scan through each
            // character of 'word' to see if it is a number
        while (i < n)
      {
            aChar = word.charAt(i);
            
            switch(aChar)
            {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': answer = true; break;
            default: answer = false; //not a number
            }  //end switch statement
            
            i++;
      }  //end while loop
      
            // get last character in this string to test
            // to see if it is a paragraph number
        aChar = word.charAt(n - 1);
      
            // check to see if this is really
            // a paragraph number
        if (aChar == '#') //yes it is
      {
         answer = true;
      }
      else //not a paragraph number
      {
          answer = false;
      
      }
      
        return answer;
    }   // end method checkIfParagraphNumber
    
    /**
     * This method prints the formatted speech to the console.
     * 
     * @param inputFile2 The scanner object for reading from the formatted speech file.
     */
    public static void printFormattedSpeech(Scanner inputFile2)
    {       
      String line;
      
            // using a while loop, read each line from
            // the newly created file that holds the
            // formatted speech and print it to the screen
        while (inputFile2.hasNext())
      {
         line = inputFile2.nextLine();
         System.out.println(line);
      }     //end while loop
      
    }   // end printOutFormattedSpeech
    
    /**
     * This method closes the input file.
     * 
     * @param fileName The scanner object for the input file.
     */
    public static void closeFile(Scanner fileName)
    {
               // close file
         fileName.close();
    }   // end closeFile
    
    /**
     * This method closes the output file.
     * 
     * @param fileName The print stream object for the output file.
     */
    public static void closeFile(PrintStream fileName)
    {
            // close file
       fileName.close();
    }   // end closeFile (overloaded)

    /**
     * This method displays a message to the user.
     * 
     * @param outString The message to be displayed.
     */
    public static void printString(String outString)
    {
               // print out the formal parameter 'outString'
         JOptionPane.showMessageDialog(null,
            outString,
            "Good Bye!",
            JOptionPane.INFORMATION_MESSAGE);
            
    }   // end method printString

}   // end class KennedySpeech
