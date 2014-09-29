////////////////////////////////////
// Priyokti Rana
// lab05
// BoolaBoola
// September 26, 2014
// CSE02 with Professor Brain Chen
// This program prompts 

// statement needed for a scanner to be functional
import java.util.Scanner;
//statement needed for generate random boolean values
import java.util.Random;

// define a class
public class BoolaBoola {
    
// add main methods
    public static void main(String [] args) {

    Random random = new Random(); //statement needed for allowing random selection of booleans (true/false)
    
    //defining variables
    boolean a = true;
    boolean b = false;
    boolean c = false;
    boolean userInput = true;
    
    boolean number1;
    boolean number2;
    
    //statements for assigning random boolean values
    a = random.nextBoolean();
    b = random.nextBoolean();
    c = random.nextBoolean();
    
    number1 = random.nextBoolean();
    number2 = random.nextBoolean();
    
    //string definition (For the number1 and number2 above since they are booleans)
    String first;
    String second;
    
    //if/else statements for generating the random && or ||
        if(number1){
            first = "&&";
        }//end if
            else{
                first = "||";
            }//end else
        if(number2){
            second = "&&";
        }//end if
            else{
                second = "||";
            }//end else
    
    
   System.out.println("Does "+a + first + b + second + c +" have the value true (T/t) or flase (F/f)?"); //statement printed where user answer question
   
    Scanner reader; //declaring scanner as variable
    reader = new Scanner ( System.in ); //statement calling the scanner constructor
    String answer = reader.nextLine(); //Asks for user input
    
    switch(answer){//switch statement that evaluates the users input
        case "T": userInput = true;break;
        case "t": userInput = true;break;
        case "F": userInput = false;break;
        case "f": userInput =false;break;
    }//end of switch statement
    
    boolean answer1 = true; //boolean for answer (depending on first two variables)
    boolean answer2; //boolean for answer(depending on second two variables)
    
    if(number1){ //if statement regarding answer
        answer1 = a || b;
    }//end if
        else{
            answer1 = a && b;
        }//end else
        
    if(number2){//if statement regarding answer2 
        answer2 = a || c;
    }//end if
        else{
            answer2 = a && c;
        }//end else
        
         if(userInput==answer2){//checking whether answer entered matches real answer
        System.out.println("Correct");
    }//end if statement
        else{
            System.out.println("Wrong; try again");
        }//end else statement
    
   
    
   
}//end of main method
} //end of class