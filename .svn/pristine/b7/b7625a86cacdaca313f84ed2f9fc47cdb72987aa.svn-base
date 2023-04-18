/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class SpecialToolBar extends JToolBar implements PropertyChangeListener {

    /** A serialization ID. */
    private static final long serialVersionUID = -2966107841693808728L;
    
    /** A list containing all the toggle buttons added to this menu bar. */
    private final List<JToggleButton> myButtons;
    
    /**
     * A button group that will contain the menu items.
     */
    private final ButtonGroup myButtonGroup;
    
    /**
     * A constructor that creates a ToolBar and a button group.
     */
    public SpecialToolBar() {
        super();
        myButtonGroup = new ButtonGroup();
        myButtons = new ArrayList<>();
    }
    
    /**
     * Creates a JToggleButton using the provided action, 
     * then adds it to a button group and then adds it to this tool bar.
     * @param theAction the action that we would like to attach to the 
     * JToggleButton when creating it.
     */
    public void createToolButton(final Action theAction) {
        final JToggleButton createdButton = new JToggleButton(theAction);

        myButtonGroup.add(createdButton);
        myButtons.add(createdButton);
        add(createdButton);
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if ("Line tool".equals(theEvent.getPropertyName())) {
            myButtons.get(0).setSelected(true);
            myButtons.get(0).setIcon((Icon) theEvent.getNewValue());
            myButtons.get(1).setIcon(PaintGUI.MY_ICONS[1]);
            myButtons.get(2).setIcon(PaintGUI.MY_ICONS[2]);
        } else if ("Rectangle tool".equals(theEvent.getPropertyName())) {
            myButtons.get(1).setSelected(true);
            myButtons.get(1).setIcon((Icon) theEvent.getNewValue());
            myButtons.get(0).setIcon(PaintGUI.MY_ICONS[0]);
            myButtons.get(2).setIcon(PaintGUI.MY_ICONS[2]);
        } else if ("Ellipse tool".equals(theEvent.getPropertyName())) {
            myButtons.get(2).setSelected(true);
            myButtons.get(2).setIcon((Icon) theEvent.getNewValue());
            myButtons.get(0).setIcon(PaintGUI.MY_ICONS[0]);
            myButtons.get(1).setIcon(PaintGUI.MY_ICONS[1]);
        } 
        
    }
}
