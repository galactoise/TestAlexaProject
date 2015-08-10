package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaSessionApplication {

	private String applicationId;

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	@Override
	public String toString() {
		return "AlexaSessionApplication [applicationId=" + applicationId + "]";
	}
	
	
}
