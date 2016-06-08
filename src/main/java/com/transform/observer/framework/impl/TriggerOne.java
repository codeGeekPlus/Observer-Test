/**
 * 
 */
package com.transform.observer.framework.impl;

import java.util.logging.Logger;

import com.transform.observer.framework.Trigger;

/**
 * @author praveen.gajula
 * 
 */
public class TriggerOne implements Trigger<ActionOne> {

	private static final Logger LOGGER = Logger.getLogger(TriggerOne.class.getName());

	public void getTrigger(ActionOne action) {
		LOGGER.info(action.getActionType().getName());

	}
}
