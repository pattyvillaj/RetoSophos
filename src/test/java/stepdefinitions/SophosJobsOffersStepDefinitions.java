package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUpPage;
import tasks.Search;
import tasks.WorkWithUsButton;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SophosJobsOffersStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast()); }

    @Given("^Maria wants to know about the job offers on the Sophos page$")
    public void mariaWantsToKnowAboutTheJobOffersOnTheSophosPage() {
        theActorCalled("Maria").wasAbleTo(OpenUpPage.thePage(), WorkWithUsButton.onThePage());

    }

    @When("^she search for available offers of (.*)$")
    public void sheSearchForAvailableOffersOfJava(String type) {
        theActorInTheSpotlight().attemptsTo(Search.theUser(type));
    }

    @Then("^print the offers available$")
    public void printTheOffersAvailable() {
        theActorInTheSpotlight().should(seeThat(Answer.toThe()));
    }
}
