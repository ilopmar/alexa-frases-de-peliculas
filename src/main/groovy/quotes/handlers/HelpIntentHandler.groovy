package quotes.handlers

import static com.amazon.ask.request.Predicates.intentName

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import groovy.transform.CompileStatic
import quotes.QuotesStreamHandler

@CompileStatic
class HelpIntentHandler implements RequestHandler {

    @Override
    boolean canHandle(HandlerInput input) {
        input.matches(intentName("AMAZON.HelpIntent"))
    }

    @Override
    Optional<Response> handle(HandlerInput input) {
        String speechText = "Me puedes preguntar una frase famosa de una película.";
        return input.getResponseBuilder()
            .withSpeech(speechText)
            .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
            .withReprompt(speechText)
            .build();
    }
}
