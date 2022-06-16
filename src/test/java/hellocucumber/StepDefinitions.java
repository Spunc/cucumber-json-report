package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }

}

public class StepDefinitions {

    private String today;

    private String actualAnswer;

    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @When("I ask when it's Friday yet")
    public void iAskWhenItSFriday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
