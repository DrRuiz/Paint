/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package tools;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.AbstractAction;

/**
 * A clear panel action.
 * @author Derek Jagger Ruiz Garcia
 * @version 12/8/2022
 */
public class ClearPanelAction extends AbstractAction {
    
    /** Support for firing property change events from this class. */
    private static final long serialVersionUID = 3604489099214155076L;
    
    /** Support for firing property change events from this class. */
    private final PropertyChangeSupport myPCS = new PropertyChangeSupport(this);

    /** A constructor that creates an action with the name "clear" and 
     *  sets it to enabled. 
     */ 
    public ClearPanelAction() {
        super("Clear");
        setEnabled(false);
    }

    /** Sends a signal saying "clear panel" to all the listeners. */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPCS.firePropertyChange("clear panel", false, true);
    }
    
    /**
     * Adds listeners to listen to the property change events from this class.
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
}
