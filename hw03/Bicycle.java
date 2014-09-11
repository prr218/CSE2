//////////////////////////////////
//Priyokti Rana
//Hw 03 Bicycle
//September 17, 2014
//CSE02 with Professor Brain Chen
//WRITE This program...

// statement needed for a scanner to be functional
    import java.util.Scanner;
    
//  define a class
public class Bicycle{
    
//  add main methods
    public static void main(String[] args) {
        
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    System.out.print("Enter the number of seconds: "); //prompting user to enter number of seconds
    double secsTrip = myScanner.nextDouble ( ); //statement accepting user input
    
    System.out.print("Enter the number of counts: "); //prompting user to enter number of counts
    int countsTrip = myScanner.nextInt ( ); //statement accepting user input
    
    double wheelDiameter=27.0; //defining diameter of wheel
    double PI=3.14159; //shows value of pi
    double distanceTrip; //defining distance for later calculation
    double feetPerMile=5280; //conversion factor from feet to miles
    double inchesPerFoot=12; //conversion factor from inches to feet
    
    
    distanceTrip=countsTrip*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculation for distance of the trip
    
    double secondsPerMinute=60; //conversion from seconds to minutes
    
    System.out.println("The distance was " + (int)(distanceTrip*100)/100.0 + " miles and took " +(secsTrip/secondsPerMinute) +" minutes.");
    // statement that shows distance and time
    
    double minutesPerHour=60; //conversion from minutes to hour
    
    double averagemph = (distanceTrip)/((secsTrip/secondsPerMinute)/minutesPerHour); //calulation of average mph
    
    System.out.println("The average mph was "+(int)(averagemph*100)/100.0);
    
    } //end of main method
} //end of class