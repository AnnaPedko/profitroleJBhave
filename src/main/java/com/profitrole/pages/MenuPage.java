package com.profitrole.pages;
import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.server.handler.FindElement;

import javax.swing.*;
import java.util.List;

import static ch.lambdaj.Lambda.convert;

/**
 * Created by Анютка on 27.05.2015.
 */
@DefaultUrl("http://gioia-profiterole.rhcloud.com/menu")
public class MenuPage extends PageObject{

@FindBy(xpath="//button[@value=\"#breakfast\"]")
private WebElementFacade buttonBreakfast;
@FindBy (xpath="//button[@value=\"#dinner\"]")
private WebElementFacade buttonDinner;
@FindBy (xpath="//button[@value=\"#supper\"]")
private WebElementFacade buttonSupper;
@FindBy (id="breakfast")
private WebElementFacade breakfastCrteation;

    public void selectBreakfast(){
        buttonBreakfast.click();
    }
    public void selectDinner(){
        buttonDinner.click();
    }
    public void selectSupper(){
        buttonSupper.click();
    }

    public void selectCuisine(String cuisine){
        getDriver().findElement(By.xpath(".//*[@id='cuisine']//label[text()='" + cuisine + "']")).click();
    }

    public WebElement selectDishes(String dish){
        return getDriver().findElement(By.xpath("//label[text()='" + dish + "']"));

    }

    public void moveDishes(String dish,String idPanel){
        Actions mover=new Actions(getDriver());
        mover.clickAndHold(selectDishes(dish))
                .moveToElement(getDriver().findElement(By.id(idPanel)))
                .release()
                .perform();


    }


    public String getComparisonElements(String idPanel,String dish) {
        String result= (getDriver().findElement(By.xpath(".//*[@id='" + idPanel + "']//label[text()='" + dish +"']"))).getText();
        return result;
    }

    public String getTitle(String idPanel) {
        String result= (getDriver().findElement(By.xpath(".//*[@id='" + idPanel + "']//h1"))).getText();
        return result;
    }


    }














