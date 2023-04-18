/*
 * TCSS 305 Autumn 2022
 * Assignment 5
 */
package tools;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JMenuItem;

/**
 * A class that enables and disables the clear button depending on 
 * the signals it receives from property change events.
 * @author Derek Jagger Ruiz Garcia
 * @version 12/8/2022
 */
public class ChangeableClearButton implements PropertyChangeListener {
    
    /**
     * A menu item.
     */
    private final JMenuItem myClearItem;
    
    /**
     * Creates a changeable clear button by storing the passed JMenuItem.
     * @param theItem the item that we would like enable or disable in the future.
     */
    public ChangeableClearButton(final JMenuItem theItem) {
        myClearItem = theItem;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if ("contains shapes".equals(theEvent.getPropertyName())) {
            myClearItem.setEnabled(true);
        } else if ("clear panel".equals(theEvent.getPropertyName())) {
            myClearItem.setEnabled(false);
        }
    }
}
