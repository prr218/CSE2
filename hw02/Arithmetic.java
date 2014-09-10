//Priyokti Rana
//Arithmetic 
//HW02
//September 9, 2014
//This program will calculate total cost of various items before and after tax.

//  define a class
public class Arithmetic{
    
//  add main method
    public static void main(String [] args) {
        
//statement that will make the program work...!

//Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the variable name)
    double sockCost$=2.58;
    System.out.println("I want to buy " + nSocks + " pairs of socks. " + "Each pair costs $" + sockCost$); //statement for socks
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    System.out.println("I want to buy " + nGlasses + " drinking glasses. " + "Each drinking glass costs $" + glassCost$); //statement for glasses
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    System.out.println("I want to buy " + nEnvelopes + " boxes of envelopes. " + "Each box costs $" + envelopeCost$); //statement for envelopes
    
    double totalSockCost$; //total cost of socks
    double totalGlassCost$; //total cost of glasses
    double totalEnvelopeCost$; //total cost of envelopes
    
    double taxPercent=0.06; //tax percent for the items
    double taxCostsocks$; // defining tax for socks
    double taxCostglasses$; // defining tax for glasses
    double taxCostenvelopes$; //defining tax for envelopes
    
    System.out.println("Before tax, the three pairs of socks cost $" + (sockCost$*3)); //statement for sock cost
    System.out.println("Before tax, the six glasses cost $" + (glassCost$*6)); //statement for glass cost
    System.out.println("Before tax, the envelopes cost $"+(envelopeCost$)); //statement for envelope cost
    
    taxCostsocks$=sockCost$*taxPercent*3; //tax for socks
    taxCostglasses$=glassCost$*taxPercent*6; //tax for glasses
    taxCostenvelopes$=envelopeCost$*taxPercent*1; //tax for envelopes
    
    System.out.println("The tax of the three pairs of socks totals to $"+ (int) (taxCostsocks$*100)/(100.0)); //statement for tax of socks
    System.out.println("The tax of the six glasses totals to $"+ (int) (taxCostglasses$*100)/(100.0)); //statement for tax of glasses
    System.out.println("The tax of the box of envelopes totals to $" + (int) (taxCostenvelopes$*100)/(100.0)); //statement for tax of envelopes
    
    double totalCostpurchasesnotax; //defining totalcost of purchases without tax
    
    totalCostpurchasesnotax=sockCost$*3+glassCost$*6+envelopeCost$; //total cost of purchases
    
    System.out.println("The total cost of purchases totals to $" + (totalCostpurchasesnotax)); //statement for total cost of purchases
    
    double totalCostpurchases; //defining total cost with tax
    
    totalCostpurchases=sockCost$*3+taxCostsocks$+glassCost$*6+taxCostglasses$+envelopeCost$+taxCostenvelopes$; //total cost of purchases with tax
    
    System.out.println("The total cost (including tax) of purchases totals to $" + (int) (totalCostpurchases*100)/(100.0)); //statemtn for total cost with tax
    
    
        
  
    
    }
}
