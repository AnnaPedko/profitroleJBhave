package com.profitrole.jbehave;
import com.profitrole.steps.LoginPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;



public class JBLoginSteps {

    @Steps
    LoginPageSteps loginSteps;

    @Given("the user is on Profitrole page")
    public void givenTheUserIsOnProfitrolePage() {
        loginSteps.is_the_home_page();
    }

    @When("the user enters Login button with empty fields")
    public void theUserEntersLoginButtonWithEmptyFields() {
        loginSteps.starts_login();
    }
    @When("the user enters Login button with userName '$userName' and password '$password' fields")
    public void theUserEntersLoginButtonWithUuserNameAndPassword(String userName,String password){
        loginSteps.fill_fields_and_login(userName, password);
    }
    @When("the user enters Login button with existed userName '$userName' only")
    public void theUserEntersLoginButtonWithUserNameOnly(String userName){
        loginSteps.fill_fields_and_login(userName);}

    @When("the user enters Login button with existed password '$password' only")
    public void theUserEntersLoginButtonWithPassword(String password){
        loginSteps.fill_pass_and_login(password);}

    @When("click on link '$link'")
    public void user_click_on_link(String link){
        loginSteps.click_on_link(link);

    }





    @Then("they should see the error '$error'")
    public void theyShouldSeeTheError(String error) {
        loginSteps.should_see_error(error);
    }

    @Then ("they should see the success enter and find profile wich contains name '$name' and email '$email' and birthday '$birthday' and country '$country'")
    public void theyThouldSeeTheSuccessEenter(String name,String email,String birthday,String country){
        loginSteps.should_see_success_enter(name, email, birthday, country);

    }

}
