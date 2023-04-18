/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package tools;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * Creates a Rectangle.
 * @author Derek Jagger Ruiz Garcia
 * @version 11/23/2022
 */
public class Rectangle extends AbstractBasicTool {

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(getRectangleX(), getRectangleY(),
                getRectangleWidth(), getRectangleHeight());
    }
    
    /**
     * Returns the quadratic width of the rectangle.
     * @return double the quadratic width of the rectangle.
     */
    private double getRectangleWidth() {
        return Math.abs(getStartPoint().getX() - getEndPoint().getX());
        
    }
    
    /**
     * Returns the quadratic height of the rectangle.
     * @return double the quadratic height of the rectangle.
     */
    private double getRectangleHeight() {
        return Math.abs(getStartPoint().getY() - getEndPoint().getY());
        
    }
    
    /**
     * Returns the quadratic upper x location of the rectangle.
     * @return double the quadratic upper x location of the rectangle.
     */
    private double getRectangleX() {
        double upperLeftX = getStartPoint().getX();
        if (getStartPoint().getX() > getEndPoint().getX()) {
            upperLeftX = getEndPoint().getX();
        }
        return upperLeftX;
    }
    
    /**
     * Returns the quadratic upper y location of the rectangle.
     * @return double the quadratic upper y location of the rectangle.
     */
    private double getRectangleY() {
        double upperLeftY = getStartPoint().getY();
        if (getStartPoint().getY() > getEndPoint().getY()) {
            upperLeftY = getEndPoint().getY();
        }
        return upperLeftY;
        
    }

}
