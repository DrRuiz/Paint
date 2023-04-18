/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package tools;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;

/**
 * A basic tool interface.
 * @author Derek Jagger Ruiz Garcia
 * @version 11/22/2022
 */
public interface BasicTool {

    /**
     * Returns the shape.
     * @return a Shape that is drawn using the internal initial point
     * and the final point.
     */
    Shape getShape();
    
    /**
     * Sets the color the tool is going to use to draw the 
     * outline of the shape.
     * @param theColor the color that is going to be used to draw 
     * the outline of the shape.
     */
    void setColor(Color theColor);
    
    /**
     * Returns the color is being used to draw the outline of 
     * the shape.
     * @return the Color that the tool is using to draw the outline 
     * of the shape.
     */
    Color getColor();
    
    /**
     * Sets the color the tool is going to use to fill the 
     * inside of the shape.
     * @param theInnerColor the color that the tool is going to use 
     * to fill the shape.
     */
    void setInnerColor(Color theInnerColor);
    
    /**
     * Returns the color the tool is currently using to fill 
     * the inside of the shape.
     * @return the Color that the tool is using to fill the inside 
     * of the shape.
     */
    Color getInnerColor();
    
    /**
     * Sets the thickness of the tool.
     * @param theThickness the thickness that the tool is going to 
     * be assigned to.
     */
    void setThickness(int theThickness);
    
    /**
     * Returns the thickness that the tools is currently assigned to.
     * @return int the thickness that the currently tool is assigned to. 
     */
    int getThickness();
    
    /**
     * Sets the start point of the tool.
     * @param theStartPoint the initial point where the shape should start
     * to be drawn.
     */
    void setStartPoint(Point theStartPoint);
    
    /**
     * Returns the start point where the tool is going to start.
     * @return Point the point where the tools should start drawing.
     */
    Point getStartPoint();
    
    /**
     * Set the end point of the tool.  
     * @param theEndPoint the end point where the shape should finish 
     * being drawn.
     */
    void setEndPoint(Point theEndPoint);
    
    /**
     * Returns the end point of the tool.
     * @return Point the point where the tools should finish drawing.
     */
    Point getEndPoint();
    
    /**
     * Sets the tool to fill the shape.
     * @param theShapeIsFilled whether or not the tool should fill the shape.
     */
    void fillShape(boolean theShapeIsFilled);
    
    /**
     * Returns whether or not the current tool is filling the shape.
     * @return a boolean value of whether or not the tool is filling the shape.
     */
    boolean isShapeFilled();
}
