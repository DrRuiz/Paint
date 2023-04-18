/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import tools.BasicTool;
import tools.Line;

/**
 * @author Derek Jagger Ruiz Garcia
 * @version 12/8/2022
 */
public class DoodlePanel extends JPanel implements PropertyChangeListener {
    
    /** The UW purple color. */
    public static final Color UW_PURPLE = new Color(51, 0, 111);
    
    /** The UW gold color. */
    public static final Color UW_GOLD = new Color(232, 211, 162);
    
    /** The default thickness of the program. */
    public static final int DEFAULT_THICKNESS = 3;  
    
    /** A point outside of the panel. */
    private static final Point NO_POINT = new Point(-15, -15);
    
    /** A serialization ID. */
    private static final long serialVersionUID = 1282742682051621286L;
    
    /** Allows to fire property change events from this class. */
    private final PropertyChangeSupport myPCS = new PropertyChangeSupport(this);

    /** The current tool that is being used to draw. */
    private BasicTool myCurrentTool;
    
    /** The new tool chosen to draw. */
    private BasicTool myNewTool;
    
    /** The old shapes that have being drawn so far. */
    private final List<PaintShape> myOldShapes;
    
    /** A new color chosen for the outline of the shape. */
    private Color myNewColor;
    
    /** A color chosen to fill the inside of the shape. */
    private Color myNewInnerColor;
    
    /** The current thickness that is being used to draw.*/
    private int myNewThickness;
    
    /** Tells the panel whether or not the thickness is zero. */
    private boolean myThicknessIsNotZero;
    
    /** Whether or not the full button is enabled. */
    private boolean myFillButtonIsSelected;
    
    /** A constructor for the doodle panel. */
    public DoodlePanel() {
        super();
        myOldShapes = new ArrayList<>();
        setUpGUI();
    }
    
    /** Sets up the panel. */
    private void setUpGUI() {
        myCurrentTool = new Line();
        myNewTool = myCurrentTool;
        final MouseLineListener ml = new MouseLineListener();
        addMouseListener(ml);
        addMouseMotionListener(ml);
        setBackground(Color.WHITE);
        myNewColor = UW_PURPLE;
        myNewInnerColor = UW_GOLD;
        myNewThickness = DEFAULT_THICKNESS;
        myThicknessIsNotZero = true;
        myFillButtonIsSelected = false;
    } 
    
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        //put this in a iterator.
        for (final PaintShape s: myOldShapes) {
            if (s.isShapeFilled()) {
                g2d.setPaint(s.getInnerColor());
                g2d.fill(s.getShape());
            }
            g2d.setPaint(s.getOuterColor());
            g2d.setStroke(new BasicStroke(s.getThickness()));
            g2d.draw(s.getShape());
        }
        if (myCurrentTool.isShapeFilled()) {
            g2d.setPaint(myCurrentTool.getInnerColor());
            g2d.fill(myCurrentTool.getShape());
        }
        g2d.setPaint(myCurrentTool.getColor());
        g2d.setStroke(new BasicStroke(myCurrentTool.getThickness()));
        g2d.draw(myCurrentTool.getShape()); 
    }
    
    /**
     * Sets the current tool to the passed tool.
     * @param theTool the new tool the program is going to use to draw.
     */
    public void setTool(final BasicTool theTool) {
        myNewTool = theTool;
    }
    
    /**
     * Sets the current thickness to the passed thickness value.
     * @param theThickness the new thickness the program is going to use to draw.
     */
    public void setCurrentThickness(final int theThickness) {
        myNewThickness = theThickness;
    }
    
    /**
     * Tells the panel whether or not it is allowed to draw new shapes.
     * @param theDrawingPermit a boolean value that will tell 
     * the panel to draw or not.
     */
    public void canDraw(final boolean theDrawingPermit) {
        myThicknessIsNotZero = theDrawingPermit;
    }
    
    /**
     * Sets the current color being used by the panel.
     * @param theColor the new color the panel is going to use to draw.
     */
    public void setCurrentColor(final Color theColor) {
        myNewColor = theColor;
    }
    
    /**
     * Returns the color that the panel is currently using to draw.
     * @return Color the current color being used by the panel.
     */
    public Color getCurrentColor() {
        return myNewColor;
    }
    
    /**
     * Sets the current color being used by the panel.
     * @param theColor the new color the panel is going to use to draw.
     */
    public void setCurrentInnerColor(final Color theInnerColor) {
        myNewInnerColor = theInnerColor;
    }
    
    /**
     * Returns the color that the panel is currently using to draw.
     * @return Color the current color being used by the panel.
     */
    public Color getCurrentInnerColor() {
        return myNewInnerColor;
    }
    
    /**
     * Sets the fill value in the panel to the passed boolean value.
     * @param theFillState a boolean value of whether or not the 
     * fill button is selected.
     */
    public void setFillButton(final boolean theFillState) {
        myFillButtonIsSelected = theFillState;
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if ("clear panel".equals(theEvent.getPropertyName())) {
            myOldShapes.clear();
            myCurrentTool.setStartPoint(NO_POINT);
            myCurrentTool.setEndPoint(NO_POINT);
            repaint();
        }
    }

    /**
     * Adds a listener for property change events from this class.
     * @param theListener a PropertyChangeListener to add.
     */
    public void addPropertyChangeListener(final PropertyChangeListener theListener) {
        myPCS.addPropertyChangeListener(theListener);
    }
    
    /**
     * Removes a listener for property change events from this class.
     * @param theListener a PropertyChangeListener to remove.
     */
    public void removePropertyChangeListener(final PropertyChangeListener theListener) {
        myPCS.removePropertyChangeListener(theListener);
    }
    
    /**
     * A mouse listener class.
     * @author Derek Jagger Ruiz Garcia
     * @version 11/29/2022
     */
    public class MouseLineListener extends MouseInputAdapter {

        /**
         * If we are allowed to draw, sets the start point, the endPoint, 
         * the color and the thickness of the tool.
         */
        @Override
        public void mousePressed(final MouseEvent theEvent) {
            if (myThicknessIsNotZero) {
                if (!myNewTool.equals(myCurrentTool)) {
                    myCurrentTool = myNewTool;
                }
                myCurrentTool.setStartPoint(theEvent.getPoint());
                myCurrentTool.setEndPoint(theEvent.getPoint());
                
                if (!myNewColor.equals(myCurrentTool.getColor())) {
                    myCurrentTool.setColor(myNewColor);
                }
                if (!myNewInnerColor.equals(myCurrentTool.getInnerColor())) {
                    myCurrentTool.setInnerColor(myNewInnerColor);
                }
                if (myNewThickness != myCurrentTool.getThickness()) {
                    myCurrentTool.setThickness(myNewThickness);
                }
                if (myFillButtonIsSelected != myCurrentTool.isShapeFilled()) {
                    myCurrentTool.fillShape(myFillButtonIsSelected);
                }
                repaint();
            }
        }

        /** If we are allowed to draw it sets the end point of the current 
         * tool equal to the point where the mouse is located. 
         */
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            if (myThicknessIsNotZero) {
                myCurrentTool.setEndPoint(theEvent.getPoint());
                repaint();
            }
        }
        
        /**
         * If we are allowed to draw, adds all the components stored in the current 
         * tool to a paint shape and then stores it into an array containing all 
         * the paint tools.
         */
        @Override
        public void mouseReleased(final MouseEvent theEvent) {   
            if (myThicknessIsNotZero) {
                final boolean oldNumOfShapesIsZero = myOldShapes.isEmpty();
                myOldShapes.add(new PaintShape(myCurrentTool.getShape(),
                    myCurrentTool.getThickness(), myCurrentTool.getColor(), 
                    myCurrentTool.getInnerColor(), myCurrentTool.isShapeFilled()));
                final boolean newNumOfShapesIsZero = myOldShapes.isEmpty();
                //since we have drawn something the clear button should activate.
                myPCS.firePropertyChange("contains shapes", 
                        oldNumOfShapesIsZero, newNumOfShapesIsZero);
            }
        }
    }
}
