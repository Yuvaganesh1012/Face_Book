package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
  public static WebDriver driver;
public static void Browser_Launch() {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications"); 
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	WebDriverManager.chromedriver().setup();
	
}
public static void url(String url) {
  driver.get(url); 
}
public void elementselect(WebElement element) {
	  element.click();
}
public static void ThreadSleepForSecond(int Sec) throws InterruptedException {
	TimeUnit.SECONDS.sleep(Sec);
}
public static void elementSendKeys(WebElement element,String value) {

		element.sendKeys(value);
	
	
}
public static void SelectDropdown(WebElement element, String option, String value) {
	Select sc=new Select(element);
	if (option.equals("value")) {
		sc.selectByValue(value);
	}else if (option.equals("text")) {
		sc.selectByVisibleText(value);
	}else if (option.equals("index")) {
		sc.selectByIndex(Integer.parseInt(value));
	}
	}
}
