
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statcalc;

 /*
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */
 
public class StatCalc {
 
   private int count;   // Number of numbers that have been entered.
   private double sum;  // The sum of all the items that have been entered.
   private double squareSum;  // The sum of the squares of all the items.
   private double mean;
   private double StandardDeviation;
 
   /**
    * Add a number to the dataset.  The statistics will be computed for all
    * the numbers that have been added to the dataset using this method.
    */
   public void enter(double[] num) {
        count++;
        count=num.length;
        for(double numbers : num){
        sum += numbers;
        squareSum += numbers*numbers;
        mean=sum/count;
        StandardDeviation=Math.sqrt(squareSum/count-mean*mean);
        }
   }
 
   /**
    * Return the number of items that have been entered into the dataset.
    */
   public int getCount() {
          return count;
   }
 
   /**
    * Return the sum of all the numbers that have been entered.
    */
   public double getSum() {
          return sum;
   }
 
   /**
    * Return the average of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
   */
   public double getMean() {
          return sum / count;
   }
 
   /**
    * Return the standard deviation of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
    */
   public double getStandardDeviation() {
          double mean = getMean();
          return Math.sqrt( squareSum/count - mean*mean );
   }
   
   public static void main(String[] args){
       double [] num={5,7,12,23,3,2,8,14,10,5,9,13};
       StatCalc myStatCalc;
       myStatCalc=new StatCalc();
       myStatCalc.enter(num);
       System.out.println("The total number of numbers is "+myStatCalc.count);
       System.out.println("The mean of the numbers is "+myStatCalc.mean);
       System.out.println("The statndard deviation of the numbers is "+myStatCalc.StandardDeviation);
   }
}  // end class StatCalc