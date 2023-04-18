/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * An abstract tool action class.
 * @author Derek Jagger Ruiz Garcia
 * @version 12/8/2022
 */
public abstract class AbstractToolAction extends AbstractAction {

    /** A serialization ID. */
    private static final long serialVersionUID = -5836118900782557378L;
    
    /** Support for firing property change events from this class. */
    protected final PropertyChangeSupport myPCS = new PropertyChangeSupport(this);

    /**
     * A constructor for the Abstract tool action that creates 
     * an action with the given string and icon and synchronizes it with the 
     * other buttons that listen to this action.
     * @param theName the name for the button that will have this action.
     * @param theIcon the icon that the button will contain.
     */
    public AbstractToolAction(final String theName, final ImageIcon theIcon) {
        super(theName, theIcon);
        putValue(Action.SELECTED_KEY, true);
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
