/**
 * 
 */
package com.transform.observer.framework.impl;

import com.transform.observer.framework.Action;

/**
 * @author praveen.gajula
 *
 */
public class ActionTwo implements Action {

	/* (non-Javadoc)
	 * @see com.transform.observer.service.Action#getActionType()
	 */
	public Class<? extends Action> getActionType() {
		return getClass();
	}

}
