///////////////////////////////////
//Priyokti Rana
//hw04-CourseNumber
//September 21, 2014
//CSE02 with Professor Brian Chen
//This program displays the course season and year.

//statement needed for a scanner to be functional
import java.util.Scanner;

//define a class
public class CourseNumber {
    
//add main methods
    public static void main(String[] args) {
        
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    System.out.println("Enter a six digit number giving the course semester-"); // prompting the user for an input for the six digits
        if(myScanner.hasNextInt()){
        int sixdigits = myScanner.nextInt();

    
            if((sixdigits>201440)||(186510>sixdigits)){
                System.out.println("The number was outside of the range [186510,201440]");
                }//end first if
                else{
                
                    if(((sixdigits)-((sixdigits/100)*100))==10){
                    System.out.println("The course was offerred spring semester of "+(sixdigits/100));//for spring
                    }
                    else if(((sixdigits)-((sixdigits/100)*100))==20){
                    System.out.println("The course was offerred summer 1 semester of "+(sixdigits/100));//for summer 1
                    }
                    else if(((sixdigits)-((sixdigits/100)*100))==30){
                    System.out.println("The course was offerred summer 2 semester of "+(sixdigits/100));//for summer 2
                    }//end else if
                    else if(((sixdigits)-((sixdigits/100)*100))==40){
                    System.out.println("The course was offerred fall semester of "+(sixdigits/100)); //for fall
                    }//end else if
                }//end of else
                }//end of if
            
            else{
                System.out.println("You did not enter an integer.");
            } //end of else
        
        
            
            
} //end main method
}//end class