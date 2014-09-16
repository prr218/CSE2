///////////////////
// Priyokti Rana
// hw03
// Four Digits
// September 10, 2014
// CSE02 with Professor Brian Chen
// WRITE THIS This program...

//statement needed for a scanner to be functional
import java.util.Scanner;

// define a class
public class FourDigits{
    
// add main method 
    public static void main(String[] args) {
    
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    //statement prompting user for the double
    System.out.println("Enter a double, and I will display the four digits to the right of the decimal point-"); // statement promtping user to enter number
    double x = myScanner.nextDouble(); // enables user to enter number
    System.out.print("The four digits are " + ((int)(((double)(x)%((int)(x)))*10))); // extracts digit from 10s place
    System.out.print(((int)(((double)(x)%((int)(x)))*100))%10); // extracts digit from 100s place
    System.out.print((((int)(((double)(x)%((int)(x)))*1000)))%10); // extracts digit from 1000s place
    System.out.print((((int)(((double)(x)%((int)(x)))*10000)))%10); //extracts digit from 10000s place
    
// 
    } //end main method
} //end of class