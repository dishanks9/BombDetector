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
public class Enemy {
    
    public static int[] plotBomb(){
        int xMin=RandomizeSwarm.xMin;
        int yMin=RandomizeSwarm.yMin;
        int xMax=RandomizeSwarm.xMax;
        int yMax=RandomizeSwarm.yMax;
        int coordinates[]=new int[2];
        Random random=new Random();
        coordinates[0]=random.nextInt(xMax-xMin)+xMin;
        coordinates[1]=random.nextInt(yMax-yMin)+yMin;
        return coordinates;
    }
}
