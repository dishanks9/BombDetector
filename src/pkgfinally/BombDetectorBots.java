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
public class BombDetectorBots {
    
    private double fitness;
    private Location location;
    private Velocity velocity;
    
    public BombDetectorBots(){
        
    }
    
    public BombDetectorBots(double fitness, Velocity velocity, Location location) {	
        this.fitness = fitness;
        this.velocity = velocity;
        this.location = location;
    }
    
    public double getFitness() {
        fitness = CalculateFitness.evaluate(location);
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Velocity getVelocity() {
        return velocity;
    }

    public void setVelocity(Velocity velocity) {
        this.velocity = velocity;
    }
    
}
