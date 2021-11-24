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
    public void sheSearchForAvailableOffersOfJava(String keyWord) {
        theActorInTheSpotlight().attemptsTo(Search.theUser(keyWord));

    }

    @Then("^print the offers$")
    public void printTheOffers() {
        theActorInTheSpotlight().should(seeThat(Answer.toThe()));
    }



}
