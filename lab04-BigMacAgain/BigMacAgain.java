////////////////////////////////////
// Priyokti Rana
// lab03
// BigMac
// September 17, 2014
// CSE02 with Professor Brain Chen
// This program asks the user about an order for Big Macs and fries. This program also uses selection statements and depends on various conditional statements. 

// statement needed for a scanner to be functional
import java.util.Scanner; 

// define a class
public class BigMacAgain {
    
// add main methods
    public static void main(String [] args) {

    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor

    
    System.out.print("Enter the number of Big Macs: "); //prompting the user for the number of tickets

    if(myScanner.hasNextInt()){ // checking whether an integer was entered by the user
        int nBigMacs = myScanner.nextInt(); // defining the variable for big macs
        double cost$ = nBigMacs*2.22; // defining the cost of bigmacs
        double costfries = 2.15; //defining the cost of fries
        char y; // defining the character y
        char Y; // defining the character Y
        
        if (nBigMacs>0) { // checking whether the number entered is bigger than 0
                System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of " + nBigMacs +" x $2.22"+ " = $"+(int)(cost$)*100/(100.00));
                //printing the statement that shows the number of Big Macs ordered and the cost of the BigMacs
            }//end of if statement that was within if statement
            
                else{ //beginning of the else statement related to the number entered-- runs conditionally
                System.out.println("You did not enter an int > 0 "); //statement showing that integer was not entered
                return; //return statement (happens conditionally)
                    }// end of else statement (within if statment)
                
        System.out.print("Do you want fries (Y/y/N/n?)"); // statement asking whether the user wants fries
                
        
        String answer=myScanner.next(); // scanner enabling the ability to check whether a certain character was entered by the user 
                
            
                if ((answer.equals("y")) || (answer.equals("Y"))){ // checking whether the user enetered "y" or "Y"
                    System.out.println("You ordered fries at a cost of $2.15."); //statement printed if the if statement above is true
                    System.out.println("The total cost of the meal is $" + (int)((cost$+costfries)*100)/(100.00)); // statement printing the total cost of the meal
                }//end of if statement within 2 if statements
                
                else{ // beginning of else statement relating to the answer entered for the question about fries
                     if((answer.equals("n")) || (answer.equals("N"))){ // if statement within else statement asking about fries
                    return; // conditional return, ends program if if statement above is true
                     } //end of if statement within else statement
                    else{ // beginning of else statement that relates to question about fries and the specific character entered
                    System.out.println("You did not enter one of 'Y', 'y', 'n' or 'N'"); //statement that is displayed if user enters character outside of the options
                    return;
                    } //end of else statement within the else statement
            
                }// end of else statement relating to the answer entered for the question about fries
                
            
                }//end of if statement 
        else{ //beginning of the else statement related to the first prompt
            System.out.print("You did not enter an int"); //statement printed conditionally (relates to the first if statement)
            return; // return statement (happens conditionally)
            }//end of second else statement
        
    
        
            
    
    
    
} // end of main method

} // end of class