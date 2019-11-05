package vn.testmaster.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import vn.testmaster.ui.GoogleHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAKeyword  implements Task {
    private final String keyword;
    public SearchAKeyword(String itemName) { this.keyword = itemName; }

    @Override
    @Step("{0} try to search the keyword #keyword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(keyword).into(GoogleHomePage.SEARCH_BOX).thenHit(Keys.ENTER)
        );
    }

    public static SearchAKeyword called(String keyword)
    {
        return instrumented(SearchAKeyword.class, keyword);
    }
}
