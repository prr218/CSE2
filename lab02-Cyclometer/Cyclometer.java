//Priyokti Rana
//Lab 02
//Cyclometer
//September 3, 2014
// This program measures speed, distance, etc. It records two kinds of data, the time elapsed in seconds, and the number of rotations of the front wheel during that time. 

//  define a class
public class Cyclometer{
    
//  add main method
    public static void main(String [] args) {
    
//statement with boxes around them
    int secsTrip1=480; // length of time of Trip 1 (in seconds)
    int secsTrip2=3220; // length of time of Trip 2 (in seconds)
    int countsTrip1=1561; // distance of Trip 1 (in feet)
    int countsTrip2=9037; // distance of Trip 2 (in feet)
    double wheelDiameter=27.0; //shows diameter of wheel
    double PI=3.14159; //shows value of pi
    double feetPerMile=5280; // conversion factor from feet to miles
    double inchesPerFoot=12; // conversion from inches to feet
    double secondsPerMinute=60; // conversion from seconds to minutes
    double distanceTrip1, distanceTrip2, totalDistance; // keeping track of the three distances (that will be defined later)
    
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had "+
    countsTrip1+ " counts."); 
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had "+
    countsTrip2+" counts.");
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travlels the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1 + distanceTrip2;
    
    //Print out the output data.
    System.out.println("Trip 1 was " +distanceTrip1+ " miles");
    System.out.println("Trip 2 was " +distanceTrip2+" miles");
    System.out.println("The total distance was " +totalDistance+" miles");
    
    
    
    } //end of main method
} //end of class