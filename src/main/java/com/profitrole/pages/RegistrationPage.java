package com.profitrole.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Анютка on 26.05.2015.
 */

@DefaultUrl("http://gioia-profiterole.rhcloud.com/registration")
public class RegistrationPage extends PageObject {
 @FindBy(id="login")
 private WebElementFacade loginField;
 @FindBy(id="password")
 private WebElementFacade passwordField;
 @FindBy(id="confirmPassword")
 private WebElementFacade confirmPassword;
 @FindBy(id="email")
 private WebElementFacade emailField;
 @FindBy(id="datepicker")
 private WebElementFacade birthday;
 @FindBy(xpath=".//*[@id='maleOrFemale0']")
 private WebElementFacade maleRadio;
 @FindBy(xpath=".//*[@id='maleOrFemale1']")
 private WebElementFacade femaleRadio;

 @FindBy(xpath=".//*[@id='iAmAgree']")
 private WebElementFacade agreeCheckBox;

 @FindBy(xpath="//button[text()='Зарегистрироваться']")
 private WebElementFacade registerButton;
 //Success registration
 @FindBy(xpath="//div[@class='alert alert-success']")
 private WebElementFacade successRegistration;
 //Errors
 @FindBy(id="loginError")
 private WebElementFacade loginError;

 @FindBy(id="passwordError")
 private WebElementFacade passwordError;

 @FindBy(id="emailError")
 private WebElementFacade emailError;

 @FindBy(id="iAmAgreeError")
 private WebElementFacade iAmAgreeError;



 public void clickOnRegisterButton(){
  registerButton.click();

 }
 public String getLoginError(){
  return loginError.getText();
  }

 public String getPasswordError(){
  return passwordError.getText();
 }
 public String getEmailError(){
  return emailError.getText();
 }

 public String getiAmAgreeError(){
  return iAmAgreeError.getText();
 }

 public String getSuccessRegistration(){
 return successRegistration.getText();
 }

 public void fillField(String parameters,String field){


  switch(field.toUpperCase()){
   case"LOGIN":loginField.sendKeys(parameters);break;
   case"PASSWORD": passwordField.sendKeys(parameters);break;
   case"CONFIRM":confirmPassword.sendKeys(parameters);break;
   case"EMAIL": emailField.sendKeys(parameters);break;
   case"BIRTHDAY":birthday.sendKeys(parameters);break;
   case"COUNTRY":{new Select(getDriver().findElement(By.id("country")))
                            .selectByValue(parameters);}break;

  }

 }

 public void checkAgree(){
     agreeCheckBox.click();
 }










}
