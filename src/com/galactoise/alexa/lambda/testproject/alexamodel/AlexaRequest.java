package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaRequest {

	private AlexaRequestIntent intent;
	private AlexaRequestType type;
	private String requestId;
	
	public AlexaRequestIntent getIntent() {
		return intent;
	}
	public void setIntent(AlexaRequestIntent intent) {
		this.intent = intent;
	}
	public AlexaRequestType getType() {
		return type;
	}
	public void setType(AlexaRequestType type) {
		this.type = type;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@Override
	public String toString() {
		return "AlexaRequest [intent=" + intent + ", type=" + type
				+ ", requestId=" + requestId + "]";
	}
	
	
}
