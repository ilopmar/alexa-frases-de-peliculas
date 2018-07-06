package quotes;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import quotes.handlers.CancelandStopIntentHandler;
import quotes.handlers.HelpIntentHandler;
import quotes.handlers.LaunchRequestHandler;
import quotes.handlers.QuoteRequestHandler;
import quotes.handlers.SessionEndedRequestHandler;

public class QuotesStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Frases famosas";

    private static Skill getSkill() {
        return Skills
                .standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new CancelandStopIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new QuoteRequestHandler()
                )
                // .withSkillId("your-skill-id")
                .build();
    }

    public QuotesStreamHandler() {
        super(getSkill());
    }
}
