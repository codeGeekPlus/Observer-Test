/**
 * 
 */
package com.transform.observer.framework.impl.listener;

import java.util.HashMap;
import java.util.Map;

import com.transform.observer.framework.DynamicListener;
import com.transform.observer.framework.Trigger;
import com.transform.observer.framework.impl.ActionOne;
import com.transform.observer.framework.impl.TriggerOne;

/**
 * @author praveen.gajula
 *
 */
public class FileListener implements DynamicListener<ActionOne> {
	
	private Map<Class<? extends ActionOne>, TriggerOne> handlers;
	
	public FileListener() {
		handlers = new HashMap<Class<? extends ActionOne>, TriggerOne>();
	}

	public void registerTrigger(Class<? extends ActionOne> triggerType, Trigger<? extends ActionOne> trigger) {
		handlers.put(triggerType, (TriggerOne) trigger);
		
	}

	public void dispatch(ActionOne keyword) {
		handlers.get(keyword.getActionType()).getTrigger(keyword);
		
	}
}
