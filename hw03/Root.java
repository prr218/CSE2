///////////////////////////////////
// Priyokti Rana
// hw03
// Root
// September 10, 2014
// CSE02 with Professor Brian Chen
// WRITE THIS This program

//statement needed for a scanner to be functional
import java.util.Scanner;

// define a class
public class Root{
    
// add main methods
    public static void main(String[] args) {
        
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    //statement promting user for the double
    System.out.print("Enter a double, and I will print its cube root ");
    double x = myScanner.nextDouble();
    
    //statement showing the cube root
    double guess = x/3; // first crude guess
    double guess2 = (guess*guess*guess+x)/(3*guess*guess); //second guess based on first guess
    double guess3 =(2*guess2*guess2*guess2+x)/(3*guess2*guess2); //third guess for cube root based on second
    double guess4 = (3*guess3*guess3*guess3+x)/(4*guess3*guess3); //as the guesses go on, they are becoming more accurate, this one is based on the third
    double guess5 = (4*guess3*guess3*guess3+x)/(5*guess3*guess3); //fifth guess based on the fourth
    System.out.println("The cube root is " + guess5 + ": "+ guess5 +" "+guess5+" = "+(guess5*guess5*guess5)); //statement showing fifth guess and the actual cube of the guess 
    
} //end main method
        
}//end of class