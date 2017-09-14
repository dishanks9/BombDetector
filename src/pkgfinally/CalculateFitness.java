/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinally;

/**
 *
 * @author Disha
 */
public class CalculateFitness {
    
    Enemy enemy=new Enemy();
    static int coordinates[]=Enemy.plotBomb();
    static int targetX=380;
    static int targetY=280;
    public static double evaluate(Location location) {
        double fitness = 0;
        double x = location.getBotXCoordinate(); // the "x" part of the location
        double y = location.getBotYCoordinate(); // the "y" part of the location
        
        fitness =  Math.sqrt(Math.pow(380-x, 2)+Math.pow(280-y, 2));

        return fitness;
    }
    
    
}
