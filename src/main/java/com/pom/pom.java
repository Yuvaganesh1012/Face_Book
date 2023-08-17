package com.pom;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.loctor.Loctor;

public class pom extends Baseclass {
	  public pom(WebDriver driver) {
	    	this.driver=driver;
	    }
	  
	  private Loctor pomlot;

	public Loctor getPomlot() {
		if(pomlot==null) {
			pomlot=new Loctor(driver);
		}
		
		return pomlot;
	}
	 
	  
}

