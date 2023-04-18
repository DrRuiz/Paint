/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package tools;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Creates an ellipse.
 * @author Derek Jagger Ruiz Garcia
 * @version 11/26/2022
 */
public class Ellipse extends AbstractBasicTool {

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(getEllipseX(), getEllipseY(),
                getEllipseWidth(), getEllipseHeight());
    }

    /**
     * Returns the quadratic width of the ellipse.
     * @return double the quadratic width of the ellipse.
     */
    private double getEllipseWidth() {
        return Math.abs(getStartPoint().getX() - getEndPoint().getX());
        
    }
    
    /**
     * Returns the quadratic height of the ellipse.
     * @return double the quadratic height of the ellipse.
     */
    private double getEllipseHeight() {
        return Math.abs(getStartPoint().getY() - getEndPoint().getY());
        
    }
    
    /**
     * Returns the quadratic upper x location of the ellipse.
     * @return double the quadratic upper x location of the ellipse.
     */
    private double getEllipseX() {
        double upperLeftX = getStartPoint().getX();
        if (getStartPoint().getX() > getEndPoint().getX()) {
            upperLeftX = getEndPoint().getX();
        }
        return upperLeftX;
    }
    
    /**
     * Returns the quadratic upper y location of the ellipse.
     * @return double the quadratic upper y location of the ellipse.
     */
    private double getEllipseY() {
        double upperLeftY = getStartPoint().getY();
        if (getStartPoint().getY() > getEndPoint().getY()) {
            upperLeftY = getEndPoint().getY();
        }
        return upperLeftY;
        
    }
}
