package com.transform.observer.framework.test;

import com.transform.observer.framework.impl.ActionOne;
import com.transform.observer.framework.impl.TriggerOne;
import com.transform.observer.framework.impl.listener.FileListener;

public class TestFramework {

	public static void main(String[] args) {
		 FileListener listener = new FileListener();
		 listener.registerTrigger(ActionOne.class, new TriggerOne());
		 listener.dispatch(new ActionOne());

	}
}
