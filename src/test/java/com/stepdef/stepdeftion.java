package com.stepdef;

import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;
import com.pom.pageobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdeftion extends Baseclass {

	pageobjectmanager obj = new pageobjectmanager(driver);
	

@Given("User Launch Browser")
public void user_launch_browser() {
	Browser_Launch();
   
}

@Given("User Lanuch Url Link")
public void user_lanuch_url_link() {
	url("https://www.facebook.com");
	//url("https://twitter.com");
}
@Given("User Click On Singup Of Fbaccount")
public void user_click_on_singup_of_fbaccount() throws Throwable {
	elementselect(obj.getLoctor().getSingupfb());
}


@Given("User Enter First Name")
public void user_enter_first_name() throws Throwable {
	ThreadSleepForSecond(5);
   elementSendKeys(obj.getLoctor().getFirstname(), "Java");
   
}
@When("User Enter Last Name")
public void user_enter_last_name() throws Throwable {
	ThreadSleepForSecond(5);
	elementSendKeys(obj.getLoctor().getLastname(), "Selenium");
   
}
@When("User Enter Mobilenumber")
public void user_enter_mobilenumber() throws Throwable {
	ThreadSleepForSecond(5);
	elementSendKeys(obj.getLoctor().mobilenum, "9025948267");
   
}
@When("User Enter New password")
public void user_enter_new_password() throws Throwable {
	ThreadSleepForSecond(5);
	elementSendKeys(obj.getLoctor().password, "Java@1234");
   
}
@When("User Enter Data DOB")
public void user_enter_data_dob() throws Throwable {
	ThreadSleepForSecond(5);
	SelectDropdown(obj.getLoctor().day,"value","10");
   
}
@When("User Enter Month DOB")
public void user_enter_month_dob() throws Throwable {
	ThreadSleepForSecond(5);
   SelectDropdown(obj.getLoctor().month, "value", "12");
   
}
@When("User Enter Year DOB")
public void user_enter_year_dob() throws Throwable {
	ThreadSleepForSecond(5);
	SelectDropdown(obj.getLoctor().year, "value", "1996");
   
}
@When("User Enter Gender")
public void user_enter_gender() throws Throwable {
	ThreadSleepForSecond(5);
	elementselect(obj.getLoctor().gender);
   
}
@Then("User Enter Singup")
public void user_enter_singup() throws Throwable {
	ThreadSleepForSecond(5);
	elementselect(obj.getLoctor().singin);
   
}





}
