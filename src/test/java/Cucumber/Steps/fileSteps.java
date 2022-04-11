package Cucumber.Steps;
//import io.cucumber.java.en.*;
import cucumber.api.java.en.*;

import java.util.logging.Logger;

public class fileSteps {
    Logger log= Logger.getLogger("Creating Logs");
   @Given("^new profile$")
    public void newProfile() {
        System.out.println("1"); log.info("inside given step");
    }

    @When("^same Profile$")
    public void sameProfile() {
        System.out.println("2");
        System.out.println("Making changes twice"); log.info("inside when step");
    }

    @Then("^Difference$")
    public void difference() {
        System.out.println("3");
        log.info("inside Then step");
    }
}
