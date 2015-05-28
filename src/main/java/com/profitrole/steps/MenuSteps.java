package com.profitrole.steps;

import com.profitrole.pages.MenuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Анютка on 27.05.2015.
 */
public class MenuSteps extends ScenarioSteps {

    MenuPage menuPage;

   @Step
   public void user_select_breakfast_button(){
       menuPage.selectBreakfast();}

    @Step
    public void user_select_supper_button(){
        menuPage.selectSupper();}
    @Step
    public void user_select_dinner_button(){
        menuPage.selectDinner();
        }
    @Step
    public void user_select_cuisine(String cuisine){
        menuPage.selectCuisine(cuisine);

    }

    @Step
    public void user_select_day(String day){
        switch (day){
            case "breakfast":user_select_breakfast_button();break;
            case "dinner":user_select_dinner_button();break;
            case "supper":user_select_supper_button();break;
        }


    }

  @Step
  public void user_is_on_profitrole_menu_page(){
      menuPage.open();

  }

  @Step
    public void user_select_day_and_cuisine(String cuisine,String day){
      user_select_day(day);
      user_select_cuisine(cuisine);

  }

  @Step
    public void user_move_dishes(String dish,String day){
    menuPage.moveDishes(dish,day);

  }

  @Step
    public void user_should_see_match_dishes(String day,String dish){
    assertThat(menuPage.getComparisonElements(day, dish),is(dish.trim()));
  }

  @Step
  public void user_should_see_title(String idPanel,String title){
   assertThat(menuPage.getTitle(idPanel),is(title));
  }



}











