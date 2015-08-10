package com.galactoise.alexa.lambda.testproject;

import java.util.HashMap;
import java.util.Map;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaCard;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaInput;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaOutput;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaOutputSpeech;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaReprompt;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaRequestIntent;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaResponse;

public class LambdaFunctionHandler implements RequestHandler<AlexaInput, Object> {

    @Override
    public AlexaOutput handleRequest(AlexaInput input, Context context) {
        context.getLogger().log("Input: " + input);
        
        AlexaRequestIntent intent = new AlexaRequestIntent();
        intent.setName(input.getRequest().getIntent().getName());
        
       /* intent = input.getRequest().getIntent();*/
        
        AlexaOutput output;
        
        if(intent.getName().equals("GetTurnt")){
        	output = generateGetTurntResponse(input);
        }else if(intent.getName().equals("HowTurnt")){
        	output = generateHowTurntResponse(input);
        }else if(intent.getName().equals("Yeah")){
        	output = generateYeahResponse(input);
        }else if(intent.getName().equals("Okay")){
        	output = generateOkayResponse(input);
        }else if(intent.getName().equals("What")){
        	output = generateWhatResponse(input);
        }else if(intent.getName().equals("Dance")){
        	output = generateDanceResponse(input);
        }else if(intent.getName().equals("Continuation")){
        	HashMap<String, Object> sessionAttributes = input.getSession().getAttributes();
        	if(sessionAttributes != null && sessionAttributes.containsKey("danceMoves")){
            	output = generateDanceResponse(input);
        	}else{
            	output = generateUnknownIntentResponse(input);
        	}
        }else{
        	context.getLogger().log("Intent name: " + intent.getName());
        	output = generateUnknownIntentResponse(input);
        }
        context.getLogger().log("Output: " + output);
        return output;
    }

    private AlexaOutput generateGetTurntResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("GET TURNT UP");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("GET TURNT UP");
    	card.setTitle("TURN UP!");
    	response.setCard(card);
    	
    	AlexaReprompt reprompt = new AlexaReprompt();
    	AlexaOutputSpeech repromptOutputSpeech = new AlexaOutputSpeech();
    	repromptOutputSpeech.setText("I said, GET TURNT UP");
    	reprompt.setOutputSpeech(repromptOutputSpeech);
    	response.setReprompt(reprompt);
    	
    	response.setShouldEndSession(false);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    private AlexaOutput generateHowTurntResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("GET TURNT UP TO DEATH");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("GET TURNT UP TO DEATH");
    	card.setTitle("TURN UP!");
    	response.setCard(card);
    	
    	response.setShouldEndSession(true);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    private AlexaOutput generateYeahResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("YAY UH");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("YEAH!");
    	card.setTitle("YEAH!");
    	response.setCard(card);
    	
    	response.setShouldEndSession(true);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    private AlexaOutput generateOkayResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("HO KAY");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("OKAY!");
    	card.setTitle("OKAY!");
    	response.setCard(card);
    	
    	response.setShouldEndSession(true);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    private AlexaOutput generateWhatResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("H'WUT");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("WHAT?");
    	card.setTitle("WHAT?");
    	response.setCard(card);
    	
    	response.setShouldEndSession(true);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    @SuppressWarnings("unchecked")
	private AlexaOutput generateDanceResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	HashMap<String,Object> sessionAttributes = input.getSession().getAttributes();
    	if(sessionAttributes == null){
    		sessionAttributes = new HashMap<String,Object>();
    	}
    	sessionAttributes.put("danceMoves", true);
    	Map<String, Void> danceMovesUsed;
    	if(sessionAttributes.containsKey("danceMovesUsed")){
    		danceMovesUsed = (Map<String, Void>) sessionAttributes.get("danceMovesUsed");
    	}else{
    		danceMovesUsed = new HashMap<String, Void>();
    		sessionAttributes.put("danceMovesUsed", danceMovesUsed);
    	}
    	
    	output.setSessionAttributes(sessionAttributes);
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	
    	if(danceMovesUsed.size() >= DanceMoves.values().length){
    		outputSpeech.setText("I'm all outta moves, bro.");
        	response.setOutputSpeech(outputSpeech);
        	
        	AlexaCard card = new AlexaCard();
        	card.setContent("No mo moves!");
        	card.setTitle("I'm all outta moves, bro.");
        	response.setCard(card);
        	response.setShouldEndSession(true);
        	
        	output.setResponse(response);
        	
        	return output;
    	}
    	
    	DanceMoves move;
    	do{
    		move = DanceMoves.generateRandomDanceMove();
    	}while(danceMovesUsed.containsKey(move.name()));
    	danceMovesUsed.put(move.name(), null);
    	outputSpeech.setText(move.toString());
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("THEM MOVES, THO!");
    	card.setTitle(move.toString());
    	response.setCard(card);
    	
    	response.setShouldEndSession(false);
    	
    	output.setResponse(response);
    	
    	return output;
    }

    private AlexaOutput generateUnknownIntentResponse(AlexaInput input){
    	AlexaOutput output = new AlexaOutput();
    	output.setSessionAttributes(input.getSession().getAttributes());
    	
    	AlexaResponse response = new AlexaResponse();
    	
    	AlexaOutputSpeech outputSpeech = new AlexaOutputSpeech();
    	outputSpeech.setText("I can't understand you, go back to your couuntry");
    	response.setOutputSpeech(outputSpeech);
    	
    	AlexaCard card = new AlexaCard();
    	card.setContent("I can't understand you, go back to your country...");
    	card.setTitle("TURN DOWN?");
    	response.setCard(card);
    	
    	response.setShouldEndSession(true);
    	
    	output.setResponse(response);
    	
    	return output;
    }
    
}
