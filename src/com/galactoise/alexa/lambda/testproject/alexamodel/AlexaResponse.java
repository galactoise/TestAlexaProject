package com.galactoise.alexa.lambda.testproject.alexamodel;

public class AlexaResponse {

	private AlexaOutputSpeech outputSpeech;
	private AlexaCard card;
	private AlexaReprompt reprompt;
	private Boolean shouldEndSession;
	public AlexaOutputSpeech getOutputSpeech() {
		return outputSpeech;
	}
	public void setOutputSpeech(AlexaOutputSpeech outputSpeech) {
		this.outputSpeech = outputSpeech;
	}
	public AlexaCard getCard() {
		return card;
	}
	public void setCard(AlexaCard card) {
		this.card = card;
	}
	public AlexaReprompt getReprompt() {
		return reprompt;
	}
	public void setReprompt(AlexaReprompt reprompt) {
		this.reprompt = reprompt;
	}
	public Boolean getShouldEndSession() {
		return shouldEndSession;
	}
	public void setShouldEndSession(Boolean shouldEndSession) {
		this.shouldEndSession = shouldEndSession;
	}
	@Override
	public String toString() {
		return "AlexaResponse [outputSpeech=" + outputSpeech + ", card="
				+ card + ", reprompt=" + reprompt + ", shouldEndSession="
				+ shouldEndSession + "]";
	}
}
