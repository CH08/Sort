
package gravitycalculator;
/**
 *
 * @author harde
 */
public class GravityCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gravity = -9.81; //Earth's gravity in m/s^2
        double initialVelocity = 0.0; //starting velocity of the object
        double fallingTime = 10.0; //time in seconds that the object falls
        double initialPosition = 1000.0; //Starting position in meters, the 
        //calculation will determine the ending postion in meters
        double finalPosition = (0.5 * gravity * fallingTime + initialVelocity * fallingTime + initialPosition);
        
        System.out.println("The objects position after " + fallingTime + " seconds is " + finalPosition + " m.");
        
    }
    
}
