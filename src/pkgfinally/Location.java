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
public class Location {
    private double botXCoordinate;

    public double getBotXCoordinate() {
        return botXCoordinate;
    }

    public void setBotXCoordinate(double botXCoordinate) {
        this.botXCoordinate = botXCoordinate;
    }

    public double getBotYCoordinate() {
        return botYCoordinate;
    }

    public void setBotYCoordinate(double botYCoordinate) {
        this.botYCoordinate = botYCoordinate;
    }
    private double botYCoordinate;
    
    public Location(double botXCoordinate, double botYCoordinate) {		
	this.botXCoordinate = botXCoordinate;
        this.botYCoordinate= botYCoordinate;
    }

    
    
    
}
