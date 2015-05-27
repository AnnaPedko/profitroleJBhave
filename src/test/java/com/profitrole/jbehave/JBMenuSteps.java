package com.profitrole.jbehave;

import com.profitrole.steps.MenuSteps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Анютка on 27.05.2015.
 */
public class JBMenuSteps {
    @Steps
    MenuSteps menuSteps;

    @Given("the user open profitrole menu page")
    public void user_is_on_profitrole_menu_page(){menuSteps.user_is_on_profitrole_menu_page();}

    @When("the user selects for '$menu' the '$cuisine' cuisine")
    public void user_select_cuisine(String menu,String cuisine){
        menuSteps.user_select_day_and_cuisine(cuisine, menu);}
    @When("the user move to the '$menu' menu dish '$dish'")
        public void user_moves_dishes_to_the_own_menu(String menu,String dish){
            menuSteps.user_move_dishes(dish,menu);

        }
    @Then("the user see at '$menu' menu dish '$dish'")
    public void user_should_see_dish_in_own_menu(String menu,String dish){
        menuSteps.user_should_see_match(menu,dish);
    }

}


