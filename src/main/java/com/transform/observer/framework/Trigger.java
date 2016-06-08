/**
 * 
 */
package com.transform.observer.framework;

/**
 * @author praveen.gajula
 * Triggers are called when an action is performed, we created a generic Trigger
 * that be can be defined for any kind of Triggers for the associated Actions
 * 
  */
public interface Trigger <E extends Action>{
	 public void getTrigger(E action);
}
