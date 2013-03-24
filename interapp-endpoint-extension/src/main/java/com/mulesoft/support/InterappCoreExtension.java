package com.mulesoft.support;

import org.mule.MuleCoreExtension;
import org.mule.api.lifecycle.InitialisationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author juancavallotti
 */
public class InterappCoreExtension implements MuleCoreExtension {
    
    private static final Logger logger = LoggerFactory.getLogger(InterappCoreExtension.class);
    
    public void initialise() throws InitialisationException {
        if (logger.isDebugEnabled()) {
            logger.debug("Initializing Interapp Core Extension");
        }
        
        //use the initial context factory.
        assert InterappInitialContextFactory.context != null;
    }

    public void dispose() {
        if (logger.isDebugEnabled()) {
            logger.debug("Disposing Interapp Core Extension");
        }
    }

    public String getName() {
        return "mule-interapp-core-extension";
    }
    
}
