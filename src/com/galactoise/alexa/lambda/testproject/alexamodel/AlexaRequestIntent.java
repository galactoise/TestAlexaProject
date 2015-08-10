package com.galactoise.alexa.lambda.testproject.alexamodel;

import java.util.HashMap;

public class AlexaRequestIntent {

	private String name;
	private HashMap<String, Object> slots;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Object> getSlots() {
		return slots;
	}
	public void setSlots(HashMap<String, Object> slots) {
		this.slots = slots;
	}
	@Override
	public String toString() {
		return "AlexaRequestIntent [name=" + name + ", slots=" + slots + "]";
	}
	
	
}
