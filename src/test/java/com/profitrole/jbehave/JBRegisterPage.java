package com.profitrole.jbehave;

import com.profitrole.steps.RegisterPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анютка on 28.05.2015.
 */
public class JBRegisterPage {

    @Steps
    RegisterPageSteps registerSteps;
   @Given("the user opens profitrole register page")
    public void the_user_open_profitrole_register_page(){
       registerSteps.user_present_on_register_page();
   }
    @When("the user registers with empty fields")
    public void the_user_registers_with_empty_fields(){
        registerSteps.fill_empty_fields();
    }

    @When ("the user enters '$parameter' in '$field' field")
    public void the_user_enters_login(String parameter,String field){
        registerSteps.user_fills_fields(parameter,field);
    }

    @When("enters '$password' password in '$field' field and enters confirm password '$confirm' in '$confirmfield' field")
    public void the_user_enters_password_and_confirn_it(String password,String field,String confirm,String confirmfield){
        registerSteps.user_fills_fields(password,field);
        registerSteps.user_fills_fields(confirm,confirmfield);
    }


    @When("enters email'$email' in '$emailfield' field and birthday '$birthday' in '$birthdayfield' field and agrees with Rules checks on agree checkbox")
    public void the_user_enters_email_birthday_and_checkbox(String email,String emailfield,String birthday,String birthdayfield){
        registerSteps.user_fills_fields(email,emailfield);
        registerSteps.user_fills_fields(birthday,birthdayfield);
        registerSteps.user_agrees_with_rules();
        registerSteps.start_registration();


    }

    @Then("the user see all errors loginError'$loginError' and '$loginErrorSecondSentence'")
    public void the_user_see_errors_loginError(String loginError,String loginErrorSecondSentence){
        registerSteps.user_should_see_login_error(loginError,loginErrorSecondSentence);
    }
    @Then ("the user see all errors passwordError'$passwordError' and '$passwordErrorSecondSentence'")
    public void see_passwordError(String passwordError,String passwordErrorSecondSentence){
        registerSteps.user_should_see_password_error(passwordError,passwordErrorSecondSentence);

    }
    @Then("see emailError '$emailError'")
    public void seeEmailError(String emailError ){
        registerSteps.user_should_see_email_error(emailError);
    }


    @Then ("see agreeError'$agreeError'")
    public void seeAgreeError(String agreeError ){
        registerSteps.user_should_see_agree_error(agreeError);
    }

    @Then ("the users should see success registratrion '$message'")
    public void user_should_see_success_registration(String message){
        registerSteps.user_should_see_success_registration(message);

    }




}
