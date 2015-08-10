package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaCard {

	public static final String SIMPLE_TYPE = "Simple";
	
	private String type = SIMPLE_TYPE;
	private String title;
	private String content;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "AlexaCard [type=" + type + ", title=" + title + ", content="
				+ content + "]";
	}
}
