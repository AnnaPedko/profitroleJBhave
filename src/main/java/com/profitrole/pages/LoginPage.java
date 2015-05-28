package com.profitrole.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WithDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/login")
public class LoginPage extends PageObject {


    // WebDriverWait wait = new WebDriverWait(getDriver(),10);
    @FindBy(id="j_username")
    private WebElementFacade userName;

    @FindBy(id="j_password")
    private WebElementFacade userPassword;

    @FindBy(xpath = "//button[@class='btn']")
    private WebElementFacade enterButton;
    @FindBy(xpath="a[text()=\"Профиль\"]")
    private WebElementFacade profileLink;



    public void fillPasswordOnly(String password) {

     userPassword.sendKeys(password);
    }
    public void fillUserNameOnly(String username){
        userName.sendKeys(username);

    }

    public void clickOnLink(String parameter){
        getDriver().findElement(By.xpath("//a[text()='" + parameter + "']")).click();

    }
    public void login(){
        enterButton.click();
    }


    public String getLoginError(){

         //waitFor(100);
         WebElement loginError=find(By.id("passwordOrLoginError"));
         return loginError.getText();
    }

    public List<String> getProfile(){
        List<WebElement> result=new ArrayList<>();
        result.add(getDriver().findElement(By.id("login")));
        result.add(getDriver().findElement(By.id("email")));
        result.add(getDriver().findElement(By.xpath(".//*[@id='dateOfBirth']")));
        result.add(getDriver().findElement(By.xpath(".//*[@id='country']")));
        return convert(result, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getAttribute("value");
            }
        };


}}