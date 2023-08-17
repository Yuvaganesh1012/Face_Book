package com.loctor;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Loctor extends Baseclass {
    public Loctor(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Create new account']")
    private WebElement singupfb;
	public WebElement getSingupfb() {
		return singupfb;
	}
	@FindBy(name="firstname")
	private WebElement Firstname;
	public WebElement getFirstname() {
		return Firstname;
	}
	@FindBy(name="lastname")
	private WebElement Lastname;
	public WebElement getLastname() {
		return Lastname;
	}
	@FindBy(name="reg_email__")
	public WebElement mobilenum;
	@FindBy(id="password_step_input")
	public WebElement password;
	@FindBy(id="day")
	public WebElement day;
	@FindBy (id="month")
	public WebElement month;
	@FindBy(name="birthday_year")
	public WebElement year;
	@FindBy(xpath="//label[text()='Male']")
	public WebElement gender;
	@FindBy (name="websubmit")
	public WebElement singin;
	
	
	
	@FindBy(id="email")
    public WebElement usename;
	@FindBy(id="pass")
	public WebElement password1;
	@FindBy(id="pass")
	public WebElement pass;
	@FindBy(xpath = "//a[@aria-label='Home']")
	public WebElement Home;
	@FindBy(xpath = "//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']")
	public WebElement postclick;
	@FindBy(xpath = "//p[contains(@class,'xdj266r')]")
	public WebElement postenter;
	@FindBy(xpath = "//div[@aria-label='Post']")
    public WebElement enter;	
    @FindBy(id="email")
    public WebElement use1;
    @FindBy(id="pass")
    public WebElement use2;
    @FindBy(name = "login")
    public WebElement login;
    
}
