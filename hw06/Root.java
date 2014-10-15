////////////////////////////////////
// Priyokti Rana
// hw06
// Roulette
// October 13, 2014
// CSE02 with Professor Brain Chen
//This program finds the root of a number using the bisection method.


//importing scanner
import java.util.Scanner;

// define a class
public class Root {
    
// add main methods
    public static void main(String [] args) {
        
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
   //This method does the general work of the bisection algorithm with the specified
      //starting and ending points.  
  
  System.out.println("Enter a number to find the root:"); 
        int x = myScanner.nextInt(); //prompting user to enter a number
  


    if(x<0){ //if statement for when integer is not greater than 0
        System.out.println("You did not enter an integer greater than 0.");
    }
    
    
        else{ //statement that runs if 
            
      double low=0; //always the low for the number
      double high = 1+x;  //high for the number
      double mid = (high+low)/2.00; //the midpoint
      // to print numbers with 7 digits behind the decimal point 
      
            while ((high-low)>(0.0000001*(1+x))){ //program runs until this statement is true
            
                if(((mid)*(mid))>x){//changes mid to high if square of middle is greater than x
                high = mid;
            }
                else if(((mid)*(mid)<x)){ //changes middle to low if square of middle is less than x
                low = mid;
            }
            
            mid = ((high+low)/2.00); //resetting the middle (since high and lows were changed to middle)
        } //end while statement
         System.out.println("The root of this number is " +mid); //statement that is printed (with the root value)  
        } //end of else statement
            
            
        
} //end 
} // end class


        