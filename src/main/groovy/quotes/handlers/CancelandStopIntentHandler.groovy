package quotes.handlers

import static com.amazon.ask.request.Predicates.intentName

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import groovy.transform.CompileStatic
import quotes.QuotesStreamHandler

@CompileStatic
class CancelandStopIntentHandler implements RequestHandler {

    @Override
    boolean canHandle(HandlerInput input) {
        input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    @Override
    Optional<Response> handle(HandlerInput input) {
        return input.getResponseBuilder()
                .withSpeech("Adiós")
                .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, "Adiós")
                .build();
    }
}
