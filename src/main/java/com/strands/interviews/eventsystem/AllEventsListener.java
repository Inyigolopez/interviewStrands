package com.strands.interviews.eventsystem;

public class AllEventsListener implements InterviewEventListener{

	private int count = 0;
	
	public void handleEvent(InterviewEvent event) {
		count ++;
		
	}

	public Class[] getHandledEventClasses() {
		return new Class[0];
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
