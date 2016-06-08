/**
 * 
 */
package com.transform.observer.framework;

/**
 * @author praveen.gajula
 * An action is analog for an Event and each Event has a specified type which is used to associate with a handler,
 * We created a generic Action that be can be defined for any kind of actions
 */
public interface Action {
public Class<? extends Action> getActionType();
}
