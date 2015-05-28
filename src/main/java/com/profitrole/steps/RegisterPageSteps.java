package com.profitrole.steps;

import jline.internal.TestAccessible;
import net.thucydides.core.steps.ScenarioSteps;

import com.profitrole.pages.RegistrationPage;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


import net.thucydides.core.annotations.Step;

/**
 * Created by Анютка on 28.05.2015.
 */
public class RegisterPageSteps extends ScenarioSteps {
    RegistrationPage registration;

    @Step
    public void user_present_on_register_page(){
    registration.open();
    }
    @Step
    public void fill_empty_fields(){
        registration.clickOnRegisterButton();
    }

    @Step
    public void user_should_see_login_error(String loginError,String loginErrorSecondSentence){
    assertThat(registration.getLoginError(),containsString(loginError));
    assertThat(registration.getLoginError(),containsString(loginErrorSecondSentence));
    }

    @Step
    public void user_should_see_email_error(String emailError){
        assertThat(registration.getEmailError(),containsString(emailError));
    }

    @Step
    public void user_should_see_password_error(String passwordError,String passwordErrorPasswordSentence ){
        assertThat(registration.getPasswordError(),containsString(passwordError));
        assertThat(registration.getPasswordError(),containsString(passwordErrorPasswordSentence));

    }

    @Step
    public void user_should_see_agree_error(String agreeError){
        assertThat(registration.getiAmAgreeError(),is(agreeError));

    }

    @Step
    public void user_fills_fields(String parameter,String field){

        registration.fillField(parameter,field);
    }

     @Step
    public void user_agrees_with_rules(){
         registration.checkAgree();
     }

    @Step
    public void user_should_see_success_registration(String successMessage){
        assertThat(registration.getSuccessRegistration(),containsString(successMessage));
    }

    @Step
    public void start_registration(){
        registration.clickOnRegisterButton();
    }
}


