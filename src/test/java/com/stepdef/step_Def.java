package com.stepdef;

import com.baseclass.Baseclass;
import com.pom.pageobjectmanager;
import com.pom.pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class step_Def extends Baseclass {
	pageobjectmanager obj = new pageobjectmanager(driver);

@Given("User Enter User Name")
public void user_enter_user_name() {
  elementSendKeys(obj.getLoctor().usename, "9025948267");
}
@Given("User Enter Password")
public void user_enter_password() {
 elementSendKeys(obj.getLoctor().password1, "Java@1234 \n");
}

@Given("User Renter your password")
public void user_renter_your_password() {
   elementSendKeys(obj.getLoctor().pass, "Java@1234\n");
}

@Given("Click on Home button")
public void click_on_home_button() throws Throwable {
	ThreadSleepForSecond(6);
    elementselect(obj.getLoctor().Home);
  
}
@Given("Click on Post Filed")
public void click_on_post_filed() throws Throwable {
	ThreadSleepForSecond(5);
   elementselect(obj.getLoctor().postclick);
  
}
@Given("User Enter Fb Post Filed")
public void user_enter_fb_post_filed() throws Throwable {
	ThreadSleepForSecond(5);
   elementSendKeys(obj.getLoctor().postenter, "Hello  World");
}
@Then("User Finally Post")
public void user_finally_post() throws Throwable {
	ThreadSleepForSecond(5);
  elementselect(obj.getLoctor().enter);
  
}


@Given("User Enter  Name {string}")
public void user_enter_name(String string) {
   elementSendKeys(obj.getLoctor().use1, string);
}
@Given("User Enter  pass {string}")
public void user_enter_pass(String string) {
    elementSendKeys(obj.getLoctor().use2, string);
}
@Given("Enter Click Button")
public void enter_click_button() throws Throwable {
	ThreadSleepForSecond(2);
    elementselect(obj.getLoctor().login);
}

}
