/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinally;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Disha
 */
public class Implementation {
    int totalParticles = 30;
    double accelerationCo_1 = 0.5;
    double accelerationCo_2 = 0.5;
    double wmax = 1.0;
    double wmin = 0.0;

    public static final double ERR_TOLERANCE = 1E-40; // the smaller the tolerance, the more accurate the result, 

    public static Vector<BombDetectorBots> bots = new Vector<BombDetectorBots>();
    private double[] botsBest = new double[totalParticles];
    private Vector<Location> botsBestLocation = new Vector<Location>();
    private double globalBest;
    private Location globalBestLocation;
    private double[] fitnessValueList = new double[totalParticles];
    public static ArrayList<ArrayList<double[]>> allLocations=new ArrayList<>();

    CalculateFitness cf=new CalculateFitness();


    public void start() {
        RandomizeSwarm sw=new RandomizeSwarm();
        sw.initPos(totalParticles);
        changeFitness();
        System.out.println("    *    ");
        System.out.println("    |    ");
        System.out.println("  ------");
        System.out.println(" (      )");
        System.out.println("(        )    bomb has been planted at the co-ordinates: "+CalculateFitness.targetX+", "+CalculateFitness.targetY);
        System.out.println(" (      )");
        System.out.println("  ------");
            initPBest();

            Random random = new Random();
            int iteration_count = 0;
            double w;
            double errFitness = 9999;

            while(iteration_count < 100 && errFitness > ERR_TOLERANCE) {
                // step 1 - update pBest
                for(int i=0; i<totalParticles; i++) {
                    updateBotBest(i);
                }

                // step 2 - update gBest
                updateGbest(iteration_count);

                w = wmax - (((double) iteration_count) / 100) * (wmax - wmin);

                for(int i=0; i<totalParticles; i++) {
                    double random1 = random.nextDouble();
                    double random2 = random.nextDouble();

                    BombDetectorBots p = bots.get(i);

                    // step 3 - update velocity

                    Velocity vel = calculateVelocity(w, random1, random2, i, p);  
                    p.setVelocity(vel);

                    // step 4 - update location

                    Location loc = calculateLocation(p, vel);
                    p.setLocation(loc);
                    double newLocation[]={loc.getBotXCoordinate(),loc.getBotYCoordinate()};
                    allLocations.get(i).add(newLocation);                               
                }

                errFitness = cf.evaluate(globalBestLocation); // minimizing the functions means it's getting closer to 0

                
                System.out.println("The location of robot for the iteration: "+iteration_count+"closest to bomb is: x-location="+globalBestLocation.getBotXCoordinate());
                System.out.println("                                          y-location="+globalBestLocation.getBotYCoordinate());
                System.out.println("The fitness value of best robot location is: " + cf.evaluate(globalBestLocation));

                iteration_count++;
                changeFitness();
            }

    }

    public void changeFitness() {
        for(int i=0; i<totalParticles; i++) {
            fitnessValueList[i] = bots.get(i).getFitness();
        }
    }

    public static int getNearestBot(double[] list) {
        int index = 0;
        double bestValue = list[0];

        for(int i=0; i<list.length; i++) {
            if(list[i] < bestValue) {
                index = i;
                bestValue = list[i];
            }
        }

        return index;
    }

    public void initPBest(){
        for(int i=0; i<totalParticles; i++) {
            ArrayList<double[]> part=new ArrayList<>();
            allLocations.add(part);
            botsBest[i] = fitnessValueList[i];
            botsBestLocation.add(bots.get(i).getLocation());
        }
    }

    public void updateBotBest(int i){
        if(fitnessValueList[i] < botsBest[i]) {
            botsBest[i] = fitnessValueList[i];
            botsBestLocation.set(i, bots.get(i).getLocation());
        }
    }

    public void updateGbest(int iteration_count){
        int bestParticleIndex = getNearestBot(fitnessValueList);
        if(iteration_count == 0 || fitnessValueList[bestParticleIndex] < globalBest) {
            globalBest = fitnessValueList[bestParticleIndex];
            globalBestLocation = bots.get(bestParticleIndex).getLocation();
        }
    }

    public Velocity calculateVelocity(double w,double random1, double random2, int particleNumber, BombDetectorBots p){
        double[] newVel = new double[2];
            newVel[0] = (w * p.getVelocity().getVelocityArray()[0]) + 
                (random1 * accelerationCo_1) * (botsBestLocation.get(particleNumber).getBotXCoordinate() - p.getLocation().getBotXCoordinate()) +
                (random2 * accelerationCo_2) * (globalBestLocation.getBotXCoordinate() - p.getLocation().getBotXCoordinate());
            newVel[1] = (w * p.getVelocity().getVelocityArray()[1]) + 
                (random1 * accelerationCo_1) * (botsBestLocation.get(particleNumber).getBotYCoordinate() - p.getLocation().getBotYCoordinate()) +
                (random2 * accelerationCo_2) * (globalBestLocation.getBotYCoordinate() - p.getLocation().getBotYCoordinate());
            Velocity velocity = new Velocity(newVel);
        return velocity;
    } 

    public Location calculateLocation(BombDetectorBots p,Velocity vel){
        double[] newLoc = new double[2];
        newLoc[0] = p.getLocation().getBotXCoordinate() + vel.getVelocityArray()[0];
        newLoc[1] = p.getLocation().getBotYCoordinate() + vel.getVelocityArray()[1];
        Location location = new Location(newLoc[0],newLoc[1]);
        return location;
    }
}
