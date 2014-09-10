////////////////////////////////////
// Priyokti Rana
// lab03
// BigMac
// September 10, 2014
// CSE02 with Professor Brain Chen
// This program computes the cost of buying some Big Macs, both with and without sales tax.

// statement needed for a scanner to be functional
import java.util.Scanner;

// define a class
public class BigMac {
    
// add main methods
    public static void main(String [] args) {

    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    System.out.print("Enter the number of Big Macs (an integer > 0):"); //prompting the user for the number of tickets
    int nBigMacs = myScanner.nextInt ( ) ; //statement accepting user input 
    
    //statement prompting the user for the cost of Big Mac
    
    System.out.print("Enter the cost per Big Mac as" + " a double (in form xx.xx): " );
    double bigMac$ = myScanner.nextDouble( );
    //statement prompting the user for the percent sales tax
    System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble( );
    taxRate/=100; //user enters percent, but I want proportion
    
    //print the output
    double cost$;
    int dollars, //whole dollar amount of cost 
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$
    cost$=nBigMacs*bigMac$*(1+taxRate) ; //get the whole amount, dropping decimal fraction
    dollars=(int)cost$; //get dimes amount where the % operator returns the remainder after the division
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" +" sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    
    
    

} //end of main method

}//end of class