package quotes.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import quotes.QuotesStreamHandler;

import java.util.Optional;

public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Me puedes pedir una frase famosa de una película.";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
                .withReprompt(speechText)
                .build();
    }
}
