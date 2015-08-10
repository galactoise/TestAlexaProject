package com.galactoise.alexa.lambda.testproject.alexamodel;

import java.util.HashMap;

public class AlexaOutput {
	
	public static final String VERSION = "1.0";
	
	private String version = VERSION;
	private HashMap<String,Object> sessionAttributes;
	private AlexaResponse response;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public HashMap<String, Object> getSessionAttributes() {
		return sessionAttributes;
	}
	public void setSessionAttributes(HashMap<String, Object> sessionAttributes) {
		this.sessionAttributes = sessionAttributes;
	}
	public AlexaResponse getResponse() {
		return response;
	}
	public void setResponse(AlexaResponse response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "AlexaOutput [version=" + version + ", sessionAttributes="
				+ sessionAttributes + ", response=" + response + "]";
	}
	
	
}
