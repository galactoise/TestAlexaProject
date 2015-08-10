package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaSessionUser {

	private String userId;

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "AlexaSessionUser [userId=" + userId + "]";
	}
	
	
}
