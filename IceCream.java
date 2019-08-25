/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;
/**
 *
 * @author harde
 */
public class IceCream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
              TextIO.readFile("icecream.txt");
           }
           catch (IllegalArgumentException e) {
              System.out.println("Cannot open the file \"icecream.dat\"!");
           }
         
         int totalNumberCones = 0;
         int numberStrawberries = 0;

         while (!TextIO.eof()) {
             String readData = TextIO.getln();
             totalNumberCones++;
             
             if (readData.equals("Strawberry")) {
                 numberStrawberries++;
             }
         }
         System.out.println("The total number of sold cones is: " + totalNumberCones);
         System.out.println("The total number of sold Strawberry flavoured cones is: " 
         + numberStrawberries);
         System.out.print("The percentage of Strawberry flavoured cones is: ");
         System.out.printf("%.2f", numberStrawberries * 100.0/totalNumberCones);// TODO code application logic here
         
    }
    
}
