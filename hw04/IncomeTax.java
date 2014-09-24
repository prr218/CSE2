///////////////////////////////////
//Priyokti Rana
//hw04-IncomeTax
//September 19, 2014
//CSE02 with Professor Brian Chen
// This program calculates income and income tax. It asks the user to enter their income and according to their answer, the program computes a corresponding tax for that specific income.

//statement needed for a scanner to be functional
import java.util.Scanner;

//define a class
public class IncomeTax {
    
//add main methods
    public static void main(String[] args) {
        
    Scanner myScanner; //declaring scanner as variable
    
    myScanner = new Scanner ( System.in ); //statement calling the scanner constructor
    
    System.out.println("Enter an int giving the number of thousands - "); // prompting the user for an input of the number of thousands
    
    if(myScanner.hasNextInt()){ //checking whether an integer was entered by the user
        
        int income = myScanner.nextInt(); //defining the variable for the income (as an int)
        
                if((income>0)&&(income<20)){ //if statement for income greater than 0 but less than 20
                double taxrate = 0.05; //tax rate at this income
                System.out.println("The tax rate on $" + income*1000 + " is " +"5.0%"+ ", and the tax is $" + taxrate*1000.000*income); // printing statement that shows the tax rate at this income
               } //end of this if statement (regarding income greater than 0 and less than 20)
               
               else{ //beginning of else statement within if statement
             
                if((income >=20) && (income<40)){ //if staement for income greater than or equal to 20 and less than 40
                double taxrate2 = 0.07; //tax rate for corresponding income
                System.out.println("The tax rate on $" + income*1000 + " is " +"7.0%"+ ", and the tax is $" + taxrate2*1000*income); // printing statement that shows the tax for corresponding income
               } //end of if statement about income>=20 and <40)
               
               
                else{ //beginning of else statement within else statement
               
                    if((income >=40) && (income<78)){ //if statement for income greater then or equal to 40 and less than 78
                    double taxrate3 = 0.12; //tax rate for corresponding income
                    System.out.println("The tax rate on $" + income*1000 + " is " +"12.0%"+ ", and the tax is $" + taxrate3*1000*income); // printing statement that shows the tax for corresponding income
                    } //end of if statement within this else statement
               
               
                    else{ //beginning of third else statement (embedded in two else statements)
               
                        if((income >=78)){ //if statement for income greater than or equal to 78
                        double taxrate4 = 0.14; //tax rate for corresponding income
                        System.out.println("The tax rate on $" + income*1000 + " is " +"14.0%"+ ", and the tax is $" + taxrate4*1000*income); // printing statement that shows the tax for the corresponding income
                        } //end of if statement within this else statement
               
               
                        else{ //beginning of fourth else statement (embedded in three else statements)
                            if(income<0){ //checking whether income entered is a positive number
                            System.out.print("You did not enter a positive int."); // statement printed if user enters a negative integer
                            return; //return if follows this conditional
            
                } //end of last if statement
                } //end of else staement
                } //end of else staement
                }//end of else staement
                }//end of outermost else statement
    }//end of first if statement
                
            else{ //beginning of last else statement
                System.out.print("You did not enter an integer."); //statement printed if user does not enter an integer 
                return; //return if follows this else statement
                
            }//end of else statement about not entering an integer
        
        

    } //end of main method
} // end of class
