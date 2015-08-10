package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaInput {

	private String version;
	private AlexaSession session;
	private AlexaRequest request;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public AlexaSession getSession() {
		return session;
	}

	public void setSession(AlexaSession session) {
		this.session = session;
	}

	public AlexaRequest getRequest() {
		return request;
	}

	public void setRequest(AlexaRequest request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "AlexaInput [version=" + version + ", session=" + session
				+ ", request=" + request + "]";
	}
	
	
}
