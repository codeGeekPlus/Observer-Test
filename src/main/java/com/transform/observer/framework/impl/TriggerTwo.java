/**
 * 
 */
package com.transform.observer.framework.impl;

import com.transform.observer.framework.Trigger;

/**
 * @author praveen.gajula
 *
 */
public class TriggerTwo implements Trigger<ActionTwo> {

	public void getTrigger(ActionTwo action) {
		 System.out.println("Action Event has been called for "+action.getActionType());
		
	}

}
