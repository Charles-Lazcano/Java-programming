//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <009>
// Semester: <Spring 2024>
// Assignment #: <09>
// Due Date: <2/28/2024>
//------------------------------

      // import classes or packages
      // needed for this program
import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;

public class Stats {
   
   public static void main(String[] args) {
           // declare a constant and other local
          // variables to be used in solving
         // this program
         final int MAX_COUNT = 50; // size of array
         int[] numbers = new int[MAX_COUNT];
         int i, rangeRandomNumbers;
         double mean, std;
         String rangeRandomNumbersText, output = "";
         
               // instantiate objects for number generating
              // and also for formatting numbers, respectively
         Random gen = new Random();
         DecimalFormat fmt = new DecimalFormat("0.##");
         
            // prompt the user for a number that will be used
           // as a range of numbers to be generated randomly,
          // then read it in and convert it to an 'int'
         rangeRandomNumbersText =
            JOptionPane.showInputDialog(null,
               "Please enter a range of numbers " +
               "to be generated:");
         rangeRandomNumbers = 
         Integer.parseInt(rangeRandomNumbersText);
      
         JOptionPane.showMessageDialog(null,
            "Thank you for your number. Your range " + 
            "of values will be between 0 and " +
            (rangeRandomNumbers - 1),
            "Your range of numbers" ,
            JOptionPane.INFORMATION_MESSAGE);
      
          // generate 'MAX_COUNT' numbers whose values will be
           // between 0 and 'rangeRandomNumbers - 1' and insert
           // them into the elements of the array 'numbers'
           for (i = 0; i < MAX_COUNT; i++)
           {
               numbers[i] = gen.nextInt(rangeRandomNumbers);
           }   //end for loop
           
           // build up string to display
           // numbers of array 'numbers'
           for (i = 0; i < numbers.length; i++)
           {
               //format nicely!
               if(i % 2 == 0) //even number element
              {               //display on beginning of
                              // new line and seperate
                              //next display by three
                              // blank spaces
               output += "Element " + i + 
                          " has : " + numbers[i] +
                          "  ";           
              
              }   //end if statement
              else   // oddd number element, display
              {      //on the same line but then advance
                     // to new line at end
                    output += "Element " + i +
                              " has : " + numbers[i] + 
                              "\n";
              }   //end if else statment
              
              
           }   //end for loop
           
           
           // display the numbers from
           // the array 'numbers'
         JOptionPane.showMessageDialog(null,
               output,
               "Your array with generated numbers",
               JOptionPane.INFORMATION_MESSAGE);
               
               // invoke the static method 'calculateMean'
               // to obtain the mean of the numbers
          mean = calculateMean(numbers);
               
               // invoke the static method 'standardDeviation'
               // to obtain the standard deviation of the numbers
          std = standardDeviation(numbers);     
          
               // display the mean and standard deviation
               // with the nice formatting
          JOptionPane.showMessageDialog(null,
            "Mean: " + fmt.format(mean) + 
            "\nStandard deviation: " + 
            fmt.format(std),
            "The mean and standard devitation",
            JOptionPane.INFORMATION_MESSAGE);
            
          JOptionPane.showMessageDialog(null,    
            "This program was written by Charles Lazcano. " + 
            "\nEnd of program," ,
            "Good Bye!",
            JOptionPane.INFORMATION_MESSAGE);
              
   } // end method main
   
   public static double standardDeviation(int[] numbers)
   {
         // declare local variables to be used in
         // calculating the standard deviation
       double result, mean, std;
       int i;
       
       result = 0.0;
       
         // obtain the mean using our existing
         // method 'calculateMean'
       mean = calculateMean(numbers);
         
         // traverse the array 'numbers' and
         // sum up all of the intermediate values
         // of each element in the calculation of
         // the standard deviation
      for (i = 0; i < numbers.length; i++)
      {
         result = result + Math.pow(numbers[i] - mean, 2.0);
      } //end for loop   
      
         // calculate the remaining part
         // of the standard deviation
       std = Math.sqrt(result) / (numbers.length - 1);
         
         // return this standard deviation
       return std;
      
   }  //end method standardDeviation
   
   public static double calculateMean(int[] nums)
   {
               // declare local variables to be
               // used in calculating the mean
      double sum, average;
      int i;
      
      sum = 0.0;   
               // traverse the array 'numbers' and
               // sum up all of the values of each
               // element
      for(i = 0; i < nums.length; i++)
      {
         sum = sum + nums[i];
      }  //end for loop       
               
               // calculate the average for these numbers
         average = sum / nums.length;      
               
               // return this average
        return average;
   }  //end method calculateMea
   
}  //end class Stats