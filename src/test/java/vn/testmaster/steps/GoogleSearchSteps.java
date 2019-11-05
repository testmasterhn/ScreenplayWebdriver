package vn.testmaster.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import vn.testmaster.questions.TheResults;
import vn.testmaster.tasks.SearchAKeyword;
import vn.testmaster.tasks.Start;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class GoogleSearchSteps {
    @Before
    public void set_the_stage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The google home page is showed$")
    public void theGoogleHomePageIsShowed() throws Throwable {
        theActorCalled("Anna").wasAbleTo(Start.Open());
    }

    @When("^The User enter the keyword into search box then press Enter$")
    public void theUserEnterTheKeywordIntoSearchBoxThenPressEnter() throws Throwable {
        theActorInTheSpotlight().attemptsTo(SearchAKeyword.called("Testmaster"));
    }

    @Then("^The list of result is showed$")
    public void theListOfResultIsShowed() throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheResults.resultOnTheLeftPanel(), equalTo("Đào tạo Tester tại Hà Nội")));
    }

}
