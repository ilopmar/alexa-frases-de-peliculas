package quotes.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import quotes.Quote;
import quotes.QuoteService;
import quotes.QuotesStreamHandler;

import java.util.Optional;

public class QuoteRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("QuoteIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Quote q = QuoteService.randomQuote();
        System.out.println("Quoute -> " + q);

        String speechText = "Aquí tienes una frase famosa de la película \"" + q.getMovie() + "\": \"" + q.getText() + "\".";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
                .withShouldEndSession(false)
                .withReprompt("Pídeme si quieres otra frase.")
                .build();
    }
}
