/**
 * 
 */
package com.transform.observer.framework;

/**
 * @author praveen.gajula
 * Any Event driven system will have listers and we created a generic DynamicLister.
 * DynamicLister is responsible selecting the associated Trigger for the given Action
 * When initialising, a listener will register a action with and associated trigger
 * Later, all actions should automatically match with its associated trigger. 
 */
public interface DynamicListener<E extends Action> {
	public void registerTrigger(Class<? extends E> triggerType, Trigger<? extends E> trigger);
	public abstract void dispatch(E keyword);

}
