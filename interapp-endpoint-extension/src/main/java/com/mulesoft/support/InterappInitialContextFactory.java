/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mulesoft.support;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import org.mule.jndi.SimpleContext;

/**
 *
 * @author juancavallotti
 */
public class InterappInitialContextFactory implements InitialContextFactory {
    
    /**
     * Instantiate the registry. 
     */
    static final SimpleContext context = new SimpleContext();
    
    public Context getInitialContext(Hashtable<?, ?> hshtbl) throws NamingException {
        return context;
    }
    
}
