package Cucumber.Steps;
//import io.cucumber.java.en.*;
import cucumber.api.java.en.*;

public class fileSteps {
   @Given("^new profile$")
    public void newProfile() {
        System.out.println("1");
    }

    @When("^same Profile$")
    public void sameProfile() {
        System.out.println("2");
        System.out.println("Making changes");
    }

    @Then("^Difference$")
    public void difference() {
        System.out.println("3");
    }
}
