package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.models.DataUser;
import co.com.choucair.certification.utest.questions.ValidateMens;
import co.com.choucair.certification.utest.tasks.CreateUser;
import co.com.choucair.certification.utest.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

public class CreateUserSteps {

    @Given("^I want open the web page$")
    public void iWantOpenTheWebPage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Monik");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage("https://utest.com/")));
    }

    @When("^Create a user in the Utest page$")
    public void createAUserInTheUtestPage(List<DataUser> data) throws InterruptedException {
        Thread.sleep(10000);
        theActorInTheSpotlight().attemptsTo(CreateUser.create(data));
        Thread.sleep(5000);
    }

    @Then("^I validate creation successfully$")
    public void iValidateCreationSuccessfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMens.valMens()));
    }

}
