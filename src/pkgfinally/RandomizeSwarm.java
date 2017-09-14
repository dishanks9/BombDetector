/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinally;

import java.util.Random;

/**
 *
 * @author Disha
 */
public class RandomizeSwarm {

    public static int xMin = -50;
    public static int xMax = 100;
    public static int yMin = -100;
    public static int yMax = -50;
    private double vMin = 0;
    private double vMax = 0.005;

    
    Random random = new Random();
    
    public void initPos(int totalParticles) {
        Implementation imp=new Implementation();
        
        BombDetectorBots bd;
        for (int i = 0; i < totalParticles; i++) {
            bd = new BombDetectorBots();
            bd.setLocation(setRandomLocation());
            bd.setVelocity(setRandomVelocity());
            imp.bots.add(bd);
        }
    }
    
    public Location setRandomLocation(){
        double[] loc = new double[2];
        loc[0] = xMin + random.nextDouble() * (xMax - xMin);
        loc[1] = yMin + random.nextDouble() * (yMax - yMin);
        Location location = new Location(loc[0],loc[1]);
        return location;
    }
    
    public Velocity setRandomVelocity(){
        double[] vel = new double[2];
        vel[0] = vMin + random.nextDouble() * (vMax - vMin);
        vel[1] = vMin + random.nextDouble() * (vMax - vMin);
        Velocity velocity = new Velocity(vel);
        return velocity;
    }
}
