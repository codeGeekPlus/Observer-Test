/**
 * 
 */
package com.transform.observer.framework.impl;

import java.util.logging.Logger;

import com.transform.observer.framework.Action;

/**
 * @author praveen.gajula
 * Actions are simple and we can define action as a subclass of Action 
 * Each class of an Action is simple a new Type of action, consequently, the type of action is denoted by its
 * class
 */
public class ActionOne implements Action {

	/* (non-Javadoc)
	 * @see com.transform.observer.service.Action#getActionType()
	 */
	
	private static final Logger LOGGER = Logger.getLogger(ActionOne.class.getName());
	public Class<? extends Action> getActionType() {
		LOGGER.info("Logger Name :"+LOGGER.getName().getClass());
		return getClass();
	}

}
