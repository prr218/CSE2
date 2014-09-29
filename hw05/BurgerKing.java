////////////////////////////////////
// Priyokti Rana
// lab05
// BurgerKing
// September 26, 2014
// CSE02 with Professor Brain Chen
// This program prompts the user to enter their order, and subsequently, assesses what question to ask the user next in order to generate their order as the output.

// statement needed for a scanner to be functional
import java.util.Scanner; 

// define a class
public class BurgerKing {
    
// add main methods
    public static void main(String [] args) {
        
    Scanner reader; //declaring scanner as variable
    reader = new Scanner ( System.in ); //statement calling the scanner constructor
    
    System.out.println("Enter a letter to indicate a choice of: ");//statement for order
    System.out.println("Burger (B or b)");
    System.out.println("Soda (S or s)");
    System.out.println("Fries (F or f)");
        String order = reader.nextLine(); //scanner for order
        
        //defining all variables
        String B;
        String b;
        String s;
        String S;
        String F;
        String f;
        String A;
        String a;
        String C;
        String c;
        String n;
        String N;
        String m;
        String M;
        String l;
        String L;
        
   
            if(("b".equals(order))||("B".equals(order))||("S".equals(order))||("s".equals(order))||("F".equals(order))||("f".equals(order))){//making sure user entered one of the prompted characters
                
                switch(order){ //switch for order
                    case"B": //for case of uppercase B
                        System.out.println("Enter A or a for all the fixins ");
                        System.out.println("C or c for cheese");
                        System.out.println("N or n for none of the above");
                            String fixins = reader.nextLine();
                                
                        System.out.print("You ordered a burger"); //statement for burger
                        
                        if(("C".equals(fixins))||("c".equals(fixins))||("n".equals(fixins))||("N".equals(fixins))||("a".equals(fixins))||("A".equals(fixins))){ //making sure user entered one of the given characters
                        switch(fixins){ //switch for fixins
                            case "A":System.out.print(" with all of the fixins");break;
                            case "a":System.out.print(" with all of the fixins");break;
                            case "C":System.out.print(" with cheese.");break;
                            case "c":System.out.print(" with cheese.");break;
                            case "n":System.out.print(".");break;
                            case "N":System.out.print(".");break;
                            }//end switch
                            }//end of if
                            else{
                                System.out.println("You did not enter C,c,n,N,a or A.");
                            }//end of else
                            break;
                            
                    case "b"://for lowercase b, burgers
                        
                        System.out.println("Enter A or a for all the fixins");
                        System.out.println("C or c for cheese");
                        System.out.println("N or n for none of the above");
                            String fixins2 = reader.nextLine();
                            
                        System.out.print("You ordered a burger");   
                        
                        if(("C".equals(fixins2))||("c".equals(fixins2))||("n".equals(fixins2))||("N".equals(fixins2))||("a".equals(fixins2))||("A".equals(fixins2))){
                        switch(fixins2){
                            case "A":System.out.print(" with all of the fixins."); break;
                            case "a":System.out.print(" with all of the fixins.");break;
                            case "C":System.out.print(" with cheese.");break;
                            case "c":System.out.print(" with cheese.");break;
                            case "n":System.out.print(".");break;
                            case "N":System.out.print(".");break;
                            } //end end switch
                            }//end if
                            else{
                                System.out.println("You did not enter C,c,n,N,a or A.");
                            }//end else
                            break;
                                
                    case "S":System.out.println("Do you want Pepsi(p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m) - ");//switch for uppercase S
                            String soda = reader.nextLine();
                        
                        if(("S".equals(soda))|| ("s".equals(soda))||("p".equals(soda))||("P".equals(soda))||("m".equals(soda))||("M".equals(soda))||("c".equals(soda))||("C".equals(soda))){   
                        switch(soda){
                            case "P": System.out.println("You ordered a Pepsi.");break;
                            case "p": System.out.println("You ordered a Pepsi.");break;
                            case "c": System.out.println("You ordered a Coke.");break;
                            case "C": System.out.println("You ordered a Coke.");break;
                            case "s": System.out.println("You ordered a Sprite.");break;
                            case "S": System.out.println("You ordered a Sprite.");break;
                            case "m": System.out.println("You ordered a Mountain Dew.");break;
                            case "M": System.out.println("You ordered a Mountain Dew.");break;
                        }//end switch
                        }//end if
                            else{
                                System.out.println("You did not enter S,s,p,m,M,C,c.");
                            }//end else
                        break;
                        
                    case "s":System.out.println("Do you want Pepsi(p or P), Coke (c or C), Sprite (s or S), or Mountain Dew (M or m) - "); //switch for lower case s (for soda)
                            String soda2 = reader.nextLine();
                            
                        if(("S".equals(soda2))|| ("s".equals(soda2))||("p".equals(soda2))||("P".equals(soda2))||("m".equals(soda2))||("M".equals(soda2))||("c".equals(soda2))||("C".equals(soda2))){
                        switch(soda2){//switch for type of soda
                            case "P": System.out.println("You ordered a Pepsi.");break;
                            case "p": System.out.println("You ordered a Pepsi.");break;
                            case "c": System.out.println("You ordered a Coke.");break;
                            case "C": System.out.println("You ordered a Coke.");break;
                            case "s": System.out.println("You ordered a Sprite.");break;
                            case "S": System.out.println("You ordered a Sprite.");break;
                            case "m": System.out.println("You ordered a Mountain Dew.");break;
                            case "M": System.out.println("You ordered a Mountain Dew.");break;
                        }//end switch
                        }//end if
                         else{//else for soda options
                                System.out.println("You did not enter S,s,p,m,M,C,c.");
                            }//end else
                        break;
                        
                    case "F": System.out.println("Do you want a large or small order of fries (l,L,s or S)"); //switch for uppercase F
                             String fries = reader.nextLine();
                            
                            if(("l".equals(fries))||("l".equals(fries))||("s".equals(fries))||("S".equals(fries))){ //switch for fries
                            switch(fries){
                                case "l": System.out.println("You ordered a large fries."); break;
                                case "L": System.out.println("You ordered a large fries."); break;
                                case "s": System.out.println("You ordered a small fries."); break;
                                case "S": System.out.println("You ordered a small fries."); break;
                            }//end of switch
                            }//end of if
                            else{//else for fries
                                    System.out.println("You did not enter l,L,s, or S.");
                            }//end of else
                            break;
                    
                    case "f": System.out.println("Do you want a large or small order of fries (l,L,s or S)"); //switch for lower case f
                             String fries2 = reader.nextLine();
                            
                            if((("l".equals(fries2))||("l".equals(fries2))||("s".equals(fries2))||("S".equals(fries2)))){
                            switch(fries2){ //switch for fries
                                case "l": System.out.println("You ordered a large fries."); break;
                                case "L": System.out.println("You ordered a large fries."); break;
                                case "s": System.out.println("You ordered a small fries."); break;
                                case "S": System.out.println("You ordered a small fries."); break;
                            }//end switch
                            }//end if
                            else{
                                    System.out.println("You did not enter l,L,s, or S.");
                            }//else
                            break;
                                
                            }//end of switch statement
                
            
                        
                        
                    
                }//end of if statement
                
                    else{//second to last else statement
                        System.out.println("You did not enter B,b,S,s,F or f.");
                        }//end else
                        
   
        
}//end of main method
}//end of class