package quotes.handlers

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.request.Predicates
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import quotes.QuoteService
import quotes.QuotesStreamHandler
import quotes.Quote

@Slf4j
@CompileStatic
class QuoteRequestHandler implements RequestHandler {

    @Override
    boolean canHandle(HandlerInput input) {
        input.matches(Predicates.intentName("QuoteIntent"))
    }

    @Override
    Optional<Response> handle(HandlerInput input) {
        Quote q = QuoteService.randomQuote()
        log.debug "Quote: $q"

        String speechText = "Aquí tienes una frase famosa de la película \"${q.movie}\": \"${q.text}\""
        return input.getResponseBuilder()
            .withSpeech(speechText)
            .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
            .withShouldEndSession(false)
            .withReprompt('Pregúntame si quieres más frases')
            .build();
    }
}
