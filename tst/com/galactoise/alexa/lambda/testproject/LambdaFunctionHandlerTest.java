package com.galactoise.alexa.lambda.testproject;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.galactoise.alexa.lambda.testproject.alexamodel.AlexaInput;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static AlexaInput input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();

        Object output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        if (output != null) {
            System.out.println(output.toString());
        }
    }
    
    @Test
    public void testGenerateRandomDanceMove(){
    	Set<DanceMoves> generatedDanceMoves = new HashSet<DanceMoves>();
    	
    	for(int i = 0; i < 50; i++){
    		generatedDanceMoves.add(DanceMoves.generateRandomDanceMove());
    	}
    	
    	assertTrue(generatedDanceMoves.contains(DanceMoves.GET_LOW));
    	assertTrue(generatedDanceMoves.contains(DanceMoves.WIGGLE));
    	assertTrue(generatedDanceMoves.contains(DanceMoves.YOGA_BALL));
    	assertTrue(generatedDanceMoves.contains(DanceMoves.BEND_OVER));
    	assertTrue(generatedDanceMoves.contains(DanceMoves.SNAP_YO_FINGAS));
    }
}
