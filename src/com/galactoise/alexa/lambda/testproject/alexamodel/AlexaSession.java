package com.galactoise.alexa.lambda.testproject.alexamodel;

import java.util.HashMap;

public class AlexaSession {
	
	private Boolean isNew;
	private String sessionId;
	private AlexaSessionApplication application;
	private HashMap<String,Object> attributes;
	private AlexaSessionUser user;
	
	public Boolean isNew() {
		return isNew;
	}
	public void setNew(Boolean isNew) {
		this.isNew = isNew;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public AlexaSessionApplication getApplication() {
		return application;
	}
	public void setApplication(AlexaSessionApplication application) {
		this.application = application;
	}
	public HashMap<String,Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(HashMap<String, Object> attributes) {
		this.attributes = attributes;
	}
	public AlexaSessionUser getUser() {
		return user;
	}
	public void setUser(AlexaSessionUser user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "AlexaSession [isNew=" + isNew + ", sessionId=" + sessionId
				+ ", application=" + application + ", attributes=" + attributes
				+ ", user=" + user + "]";
	}
}
