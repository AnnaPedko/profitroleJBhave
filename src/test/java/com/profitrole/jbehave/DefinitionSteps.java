package com.profitrole.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.profitrole.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on Profitrole page")
    public void givenTheUserIsOnProfitrolePage() {
        endUser.is_the_home_page();
    }

    @When("the user enters Login button with empty fields")
    public void theUserEntersLoginButtonWithEmptyFields() {
        endUser.starts_login();
    }
    @When("the user enters Login button with userName '$userName' and password '$password' fields")
    public void theUserEntersLoginButtonWithUuserNameAndPassword(String userName,String password){
    endUser.fill_fields_and_login(userName,password);
    }
    @When("the user enters Login button with existed userName '$userName' only")
    public void theUserEntersLoginButtonWithUserNameOnly(String userName){
        endUser.fill_fields_and_login(userName);}

    @When("the user enters Login button with existed password '$password' only")
    public void theUserEntersLoginButtonWithPassword(String password){
        endUser.fill_pass_and_login(password);}

    @Then("they should see the error '$error'")
    public void theyShouldSeeTheError(String error) {
        endUser.should_see_error(error);
    }

}
