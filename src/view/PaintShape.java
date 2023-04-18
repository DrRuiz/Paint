/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;

import java.awt.Color;
import java.awt.Shape;

/**
 * A class that stores drawn shapes .
 * @author Derek Jagger Ruiz Garcia
 * @version 12/8/2022
 */
public class PaintShape {
    
    /** The Shape that needs to be stored. */
    private final Shape myShape;
    
    /** The thickness of the shape stored. */
    private final int myThickness;
    
    /** The color of the outline of the shape stored. */
    private final Color myOuterColor;
    
    /** The color of the inside of the shape stored. */
    private final Color myInnerColor;
    
    /** Whether or not the shape stored needs to be filled. */
    private final boolean myShapeIsFilled;
    
    /**
     * A constructor that stores the shape, the thickness, the outline color,
     * the inside color and whether or not the stored shape needs to be filled.
     * @param theShape the shape that needs to be stored.
     * @param theThickness the thickness of the shape stored.
     * @param theOuterColor the outline color of the shape stored.
     * @param theInnerColor the inner color of the shape stored.
     * @param theShapeIsFilled whether or not the shape stored needs to be filled.
     */
    public PaintShape(final Shape theShape, final int theThickness, 
            final Color theOuterColor, final Color theInnerColor, 
            final boolean theShapeIsFilled) {
        myShape = theShape;
        myThickness = theThickness;
        myOuterColor = theOuterColor;
        myInnerColor = theInnerColor;
        myShapeIsFilled = theShapeIsFilled;
    }
    
    /**
     * Returns the stored shape.
     * @return Shape the shape that was previously stored.
     */
    public Shape getShape() {
        return myShape;
    }
    
    /**
     * Returns the thickness of the shape stored.
     * @return int the thickness of the shape that was previously stored.
     */
    public int getThickness() {
        return myThickness;
    }

    /**
     * Returns the Color of the inside of the shape stored.
     * @return Color the inner color that was previously stored.
     */
    public Color getInnerColor() {
        return myInnerColor;
    }
    
    /**
     * Returns the Color of the outline of the shape stored.
     * @return Color the color of the outline that was previously stored.
     */
    public Color getOuterColor() {
        return myOuterColor;
    }
    
    /**
     * Returns whether or not the stored shape needs to be filled.
     * @return true if the shape stored needs to be filled and false otherwise.
     */
    public boolean isShapeFilled() {
        return myShapeIsFilled;
    }
}
