package quotes

import com.amazon.ask.Skill
import com.amazon.ask.SkillStreamHandler
import com.amazon.ask.Skills
import groovy.transform.CompileStatic
import quotes.handlers.CancelandStopIntentHandler
import quotes.handlers.HelpIntentHandler
import quotes.handlers.LaunchRequestHandler
import quotes.handlers.QuoteRequestHandler
import quotes.handlers.SessionEndedRequestHandler

@CompileStatic
class QuotesStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Frases famosas"

    private static Skill getSkill() {
        Skills
            .standard()
            .addRequestHandlers(
                new QuoteRequestHandler(),
                new LaunchRequestHandler(),
                new CancelandStopIntentHandler(),
                new SessionEndedRequestHandler(),
                new HelpIntentHandler()
            )
            .withSkillId("amzn1.ask.skill.dd4beae0-67f1-4188-a5e4-945664207e3b")
            .build();
    }

    QuotesStreamHandler() {
        super(getSkill());
    }
}
