//-------------------------------
// Programmer: <Charles Lazcano>
// Course: COSC 1437 Section <005>
// Semester: <Spring 2024>
// Assignment #: <07>
// Due Date: <2/21/2024>
//------------------------------

      // for GUIs using swing
import javax.swing.*;

public class Distance {

   public static void main(String[] args) {
         // declare variables to be used
      String x1Text, y1Text, x2Text, y2Text;
      int x1, y1,x2,y2;
      double distance;
      String output;
      
            // prompt the user for the first point x,y coordinates
           // then read them in via JOptionPane
      
      x1Text = JOptionPane.showInputDialog(null,
               "Enter the x coordinate for the first point");
      x1 = Integer.parseInt(x1Text);
      
      y1Text = JOptionPane.showInputDialog(null,
               "Enter the x coordinate for the first point");
      y1 = Integer.parseInt(y1Text);
      
           // prompt the user for the Second point x,y coordinates
           // then read them in via JOptionPane
      
      x2Text = JOptionPane.showInputDialog(null,
               "Enter the x coordinate for the first point");
      x2 = Integer.parseInt(x2Text);
      
      y2Text = JOptionPane.showInputDialog(null,
               "Enter the x coordinate for the first point");
      y2 = Integer.parseInt(y2Text);
      
      
         // calculate the distance between the two points
         // that were entered at the keyboard; do this
         // by invoking the method 'calculate' and
         // sending the actual parameters
         // x1,y1,x2, and y2 to it
      distance = calculate(x1,y1,x2,y2);
      
      
      // build up a string for displaying
      // info about the two points and the
      // distance between them
      
      output = "\nFirst point:" + 
               "\nx1: " + x1 +
               "\ny1: " + y1 +
               "\n\nSecond point: " +
               "\nx2: " + x2 + 
               "\ny2: " + y2 +
               "\n\nDistance: " + distance;
               
               // invoke the method 'displayString' to
               // display the built string 'output'
       displayString(output, "Current coordinates in 'main'");
       
            // invoke the method 'changePoints' and
            // send the actual parameters
            // x1, y1, x2, and y2 to it
      changePoints(x1 ,y1 ,x2 , y2);
      
         // calculate the distance between the two points
         // that were entered at the keyboard; do this
         // by invoking the method 'calculate' and
         // sending the actual parameters
         // x1,y1,x2, and y2 to it
      distance = calculate(x1,y1,x2,y2);
         // build up a string for displaying
         // info about the two points and the
         // distance between them; will there be any change?
      output = "\nfirst point:" + 
               "\nx1: " + x1 +
               "\ny1: " + y1 +
               "\n\nSecond point: " +
               "\nx2: " + x2 + 
               "\ny2: " + y2 +
               "\n\nDistance: " + distance;

               // invoke the method 'displayString' to
               // display the built string 'output'
       displayString(output, "Current coordinates in 'main'");
       
         
            // build string for final output
       output = "\nThis program was written by Charles Lazcano." +
                "\nEnd of program.";
            // display final output             
       displayString(output, "Good Bye!");       
              
    }  //end method main
   
   public static double calculate(int a1, int b1, int a2, int b2)
   {
          // declare a local variable called 'answer'
      double answer;
      
            // calculate distance between two points
            // using static methods 'sqrt' and 'pow'
            // within the class 'Math'
      answer = Math.sqrt(Math.pow(a2 - a1, 2.0) +
                          Math.pow(b2 - b1, 2.0));
            // return the answer              
      return answer;
      
   } // end method calculate
   
   public static void displayString(String outString,
                                    String header)
   {
         // display the string 'outString'
         // via JOptionPane
       JOptionPane.showMessageDialog(null,
                                    outString,
                                    header,
                                    JOptionPane.INFORMATION_MESSAGE);
   }      // end method display string
   
   public static void changePoints(int a1, int b1,
                                    int a2, int b2)
   {
            // declare a local variable called 'tempString'
         String tempString;
            
            // modify the x and y points for both points
            // Note: a1,b1 are aliases for the first
            // point (x1,y1) while a2,b2 are aliases for
            // the second point (x2,y2)
            
            a1 = a1 * 2;
            b1 = b1 * 2;
            a2 = a2 * 3;
            b2 = b2 * 3;
            
            
            // build a string for displaying points
         tempString = "First point:"  +
                     "\na1: " + a1 +
                     "\nb1: " + b1 + 
                     "\n\nSecond point:" +
                     "\na2: " + a2 + 
                     "\nb2: " + b2;
                     
            // display points via JOptionPane
          JOptionPane.showMessageDialog(null,
                                       tempString,
                                       "Inside method 'changePoints '",
                                       JOptionPane.INFORMATION_MESSAGE);
                                       
            
            
   } // end method changePoints
     
   
} // end class Distance