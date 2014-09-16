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
    double guess = x/3;
    System.out.println("The cube root is " + guess + ":");
    System.out.println((guess*guess*guess+x)/(3*guess*guess));
    System.out.println((2*guess*guess*guess+x)/(3*guess*guess));
    System.out.println((3*guess*guess*guess+x)/(3*guess*guess));
    System.out.println((4*guess*guess*guess+x)/(3*guess*guess));
    
} //end main method
        
}//end of class