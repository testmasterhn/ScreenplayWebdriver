package vn.testmaster.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import vn.testmaster.ui.GoogleHomePage;

public class Start implements Task {

    private GoogleHomePage googlePage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(googlePage)
        );
    }

    public static Start Open(){return instrumented(Start.class);}
}
