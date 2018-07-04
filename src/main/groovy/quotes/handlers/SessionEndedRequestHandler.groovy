package quotes.handlers

import static com.amazon.ask.request.Predicates.requestType

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.Response
import com.amazon.ask.model.SessionEndedRequest
import groovy.transform.CompileStatic

@CompileStatic
class SessionEndedRequestHandler implements RequestHandler {

    @Override
    boolean canHandle(HandlerInput input) {
        return input.matches(requestType(SessionEndedRequest.class))
    }

    @Override
    Optional<Response> handle(HandlerInput input) {
        // any cleanup logic goes here
        return input.getResponseBuilder().build();
    }
}
