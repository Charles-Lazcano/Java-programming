//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <009>
// Semester: <Spring 2024>
// Assignment #: <10>
// Due Date: <2/28/2024>
//------------------------------

         // import class needed for this
         // program to read in
import javax.swing.*;
import java.util.Random;

public class FunWithArrays{
         
         public static void main(String[] args){
               // declare a constant and other
               // variables to be used in program
         final int MAX_COUNT = 50;
         int[] numbers = new int [MAX_COUNT];
         int i, rangeRandomNumbers, index;
         String rangeRandomNumbersText;
         
             // instantiate objects for number generating
         Random gen = new Random();
             
             
               // prompt the user for a number that will be
               // used as a range of numbers to be generated
               // randomly, then read it in and convert it
               // to an 'int'
         rangeRandomNumbersText = 
         JOptionPane.showInputDialog(null,
                  "Please enter a range of numbers " +
                  "to be generated:");
         
         rangeRandomNumbers =
                   Integer.parseInt(rangeRandomNumbersText);
                   
         JOptionPane.showMessageDialog(null,
               "Thank you for you number. Your " + 
               "range of valuables will between " +
               "0 and " +
               (rangeRandomNumbers - 1),
               "Your range of numbers",
               JOptionPane.INFORMATION_MESSAGE);
               
               // generate random numbers and insert
               // them into each element of the array
               // 'numbers'
          for (i = 0; i < numbers.length; i++)
          {
               numbers[i] = gen.nextInt(rangeRandomNumbers);
               
          }// end for loop
          
               // invoke method 'displayArray' to display
               // all the numbers in the array 'numbers'
          displayArray(numbers,     
                     "Your array with the generated numbers");
                     
               // invoke the method 'findLargest' to
               // find the index of the largest number
               // in the array 'numbers'; then displa
               // that number and its index
          index = findLargest(numbers);
          JOptionPane.showMessageDialog(null,
           "The largest number in the array is " +
           numbers[index] + " at location " +
           index,
           "Largest number ",
           JOptionPane.INFORMATION_MESSAGE);
               
               // invoke the method 'findSmallest' to
               // find the index of the smallest number
               // in the array 'numbers'; then display
               // that number and its index
            index = findSmallest(numbers);       
              JOptionPane.showMessageDialog(null,
           "The smallest number in the array is " +
           numbers[index] + " at location " +
           index,
           "Smallest number",
           JOptionPane.INFORMATION_MESSAGE);  
                 
               // invoke method 'displayArray' to display
               // all the numbers in the array 'numbers'
           displayArray(numbers,     
                 "Your array with the generated numbers");
     
               // invoke the method 'modifyEvens' to modify
               // only those numbers whose indices are even
            modifyEvens(numbers);   
            
               // invoke method 'displayArray' to display
               // all the numbers in the array 'numbers'
                 displayArray(numbers,     
                 "Your array with the modified numbers");
                 
            JOptionPane.showMessageDialog(null,
                        "This program was written by Charles Lazcano. " +
                        "\nEnd of program.",
                        "Good bye!",
                        JOptionPane.INFORMATION_MESSAGE);
                 
  } //end method main
  
  public static void modifyEvens(int[] numbers)
  {
      int i;
      
            // iterate through the array 'numbers'
            // and update (add 1,000) to each
            // number that has an even numbered
            // index
      for (i = 0; i < numbers.length; i = i + 2)
      {
            numbers[i] = numbers[i] + 1000;
      }  //end for loop
      
      
  }   //end method modifyEvens
  
    public static int findSmallest(int[] nums)
  {
      int i, min, location;
      
               // first number will temporarily
                // be the smallest number
      location = 0;
      min = nums[location];
      
                // iterate through all the numbers
                // in the array to see which is
                // the smallest number
      for (i = 1; i < nums.length; i++ )
      {
                //smaller than min?
         if (nums[i] < min)
         {
            min = nums[i];
            location = i;
         }
      }     //end for loop
      
                 // return index of smallest number in array
       return location;
      
  }   //end method findSmallest
  
  public static int findLargest(int[] nums)
  {
      int i, max, location;
      
               // first number will temporarily
                // be the largest number
      location = 0;
      max = nums[location];
      
                // iterate through all the numbers
                // in the array to see which is
                // the largest number
      for (i = 1; i < nums.length; i++ )
      {
                //larger than max?
         if (nums[i] > max)
         {
            max = nums[i];
            location = i;
         }
      }     //end for loop
      
                 // return index of largest number in array
       return location;
      
  }   //end method findLargest
  
  public static void displayArray(int[] numbers,
                                    String header)
  {
    int i;
    String output = "";
         
         // build up string to display
         // numbers of array 'numbers'
    for (i = 0; i < numbers.length; i++)
    {
    
         // even number element, display
         // on beginning of new line and
         // separate next display by
         // three blank spaces
     if(i % 2 == 0)
     {
      output += "element" + i + " has: " +
                  numbers[i] + "  ";
                 
     }   
         // odd number element, display on
         // same line but then advance to
         // new line at end
     else
     {
               output += "element" + i + " has: " +
                  numbers[i] + "\n";
     }
     
  }      //end for loop    
         // display the numbers from
         // the array 'numbers'
     JOptionPane.showMessageDialog(null,
                        output ,
                        header,
                        JOptionPane.INFORMATION_MESSAGE);  
                        
                        
  }  //end method display                                
  
} //end class FunWithArrays