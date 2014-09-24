////////////////////////////////////
// Priyokti Rana
// hw04
// Time Padding
// September 20, 2014
// CSE02 with Professor Brain Chen


// statement needed for a scanner to be functional
import java.util.Scanner; 

// define a class
public class TimePadding {
    
// add main methods
    public static void main(String [] args) {

    int hours=0;
    
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor

    
    System.out.print("Enter the time in seconds:"); //prompting the user for the number of the month
    
     if(myScanner.hasNextInt()){ // checking whether an integer was entered by the user
        int seconds = myScanner.nextInt();
        
        if(seconds>3600){ //defining hours and seconds (so that all times can be included)
                hours = (seconds/3600);
                seconds = (seconds-(hours*3600));
            
        }
                
                int minutes = seconds/60;
                seconds=(seconds-(minutes)*60);
                
                System.out.print("The time is "+hours+":");
                if(minutes<10){
                    System.out.print("0"+minutes+":"); //calculating minutes if less than 10 minutes
                }//end else if
                else if(minutes>9){ //minutes if more than 9 minutes
                    System.out.print(minutes+":");
                }//end else if
                if(seconds<10){
                    System.out.print("0"+seconds+":");//calc seconds if less than 10
                }//end else if
                else if(seconds>9){
                    System.out.print(seconds); //seconds f less than 9
                        
                }//end else if
                

        
           
            else if(seconds<0){
                System.out.println("You did not enter an int greater than 0.");
            //end of if statement
            }
     } //end if statement
        else{
            System.out.println("You did not enter an int.");
    }//end of else statement
    
}//end class
}//end main method