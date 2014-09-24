////////////////////////////////////
// Priyokti Rana
// hw04
// Month
// September 23, 2014
// CSE02 with Professor Brain Chen
// This program prompts the user for an integer between 1-12 and if neccesary, the year, and as a result, outputs the number of days in the corresponding month.

// statement needed for a scanner to be functional
import java.util.Scanner; 

// define a class
public class Month {
    
// add main methods
    public static void main(String [] args) {

    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor

    
    System.out.print("Enter an int giving the number of the month (1-12) - "); //prompting the user for the number of the month
    
        if(myScanner.hasNextInt()){ // checking whether an integer was entered by the user
        int month = myScanner.nextInt(); //prompting the user to enter the number corresponding to a month
        
        if((month>12)||(month<1)){ //if statement checking whether month number lies in between the range
            System.out.print("You did not enter an int in between 1-12"); //statement if number does not fall within range
        } //end of if statement regarding the range of month
        
        
        switch (month){ //beginning of switch statement that checks number of month and corresponds it to the number of days in said month

        case 1: System.out.println("This month has 31 days.");break; //statement for number of days in Jan
        case 3: System.out.println("This month has 31 days.");break;//statement for number of days in March
        case 4: System.out.println("This month has 30 days.");break;//statement for number of days in April
        case 5: System.out.println("This month has 31 days.");break;//statement for number of days in May
        case 6: System.out.println("This month has 30 days.");break;//statement for number of days in June
        case 7: System.out.println("This month has 31 days.");break;//statement for number of days in July
        case 8: System.out.println("This month has 31 days.");break;//statement for number of days in August
        case 9: System.out.println("This month has 30 days.");break;//statement for number of days in Sept.
        case 10: System.out.println("This month has 31 days.");break;//statement for number of days in Oct.
        case 11: System.out.println("This month has 30 days.");break;//statement for number of days in Nov.
        case 12: System.out.println("This month has 31 days.");break;//statement for number of days in Dec.
        } //end of switch statement
        
        if(month==2){ //if statement that corresponds to the problem child (aka the month of February)
            System.out.print("Enter an int giving the year - "); //statement prompting user to enter the year (for the purpose of determining whether the year is a leap year)
            int year = myScanner.nextInt(); //prompting user to enter year
                if( (year % 4 ==0) && (year % 100 !=0)||(year % 400==0)){ //checks whether year is a leap year
                System.out.println("This month has 29 days."); // statement printed if there is a leap year
                }//end of if statement
                
                else if (year%4==0){
                    System.out.println("This month has 29 days."); //statement if there is a leap year
             
                }//end of else if statement
                }//end of if statement
                
                else{
                    System.out.println("This month has 28 days."); //if not leap year, statement that is printed
                }//end of else statement
                
            
        }//end of second if statement
        
        
        
         //end of first if statement
} //end of main method
} //end of class