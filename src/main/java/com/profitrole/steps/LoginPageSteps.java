package com.profitrole.steps;
import com.profitrole.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginPageSteps extends ScenarioSteps {

    LoginPage loginPage;
    @Step
    public void is_the_home_page() {
        loginPage.open();

    }
    @Step
    public void enters_username(String username) {
        loginPage.fillUserNameOnly(username);
    }

    @Step
    public void enters_password(String password) {
        loginPage.fillPasswordOnly(password);
    }

    @Step
    public void starts_login() {
        loginPage.login();
    }

    @Step
    public void should_see_error(String error) {
        assertThat(loginPage.getLoginError(),is(error));

    }

    @Step
    public void should_see_success_enter(String login,String email, String birthday,String country){
        assertThat(loginPage.getProfile(),hasItems(login,email,birthday,country));
    }

    @Step
    public void click_on_link(String parameter){
        loginPage.clickOnLink(parameter);
    }

    @Step
    public void fill_fields_and_login(String username,String password) {
        enters_username(username);
        enters_password(password);
        starts_login();
    }

    @Step

    public void fill_fields_and_login(String username){
        enters_username(username);
        starts_login();
    }

    @Step
    public void fill_pass_and_login(String password){
        enters_password(password);
        starts_login();

    }






}
