package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaOutputSpeech {

	public static final String PLAIN_TEXT_TYPE = "PlainText";
	
	private String type = PLAIN_TEXT_TYPE;
	private String text;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "AlexaOutputSpeech [type=" + type + ", text=" + text + "]";
	}
}
