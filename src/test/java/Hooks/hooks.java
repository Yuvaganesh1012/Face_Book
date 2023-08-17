package Hooks;



import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;



public class hooks extends Baseclass {
@io.cucumber.java.Before
 public void Befor_Hooks() {
	 System.out.println("Fb_Start");
 }
@io.cucumber.java.After
 public void After_Hooks(Scenario scro) {
	 TakesScreenshot ts =(TakesScreenshot)driver;
	 byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	 scro.attach(screenshotAs, "image/png", "ScreenShots");
	 //driver.close();
 }
}
