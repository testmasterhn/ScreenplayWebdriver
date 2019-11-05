package vn.testmaster.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.testmaster.ui.GoogleHomePage;

public class DisplayedItems implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(GoogleHomePage.RESULT_ITEM)
                .viewedBy(actor)
                .asString();

    }
}
