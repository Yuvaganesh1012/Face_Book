package com.pom;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.loctor.Loctor;

public class pageobjectmanager extends Baseclass {
    public pageobjectmanager(WebDriver driver) {
    	this.driver=driver;
    }
	private Loctor Loctor;

	public Loctor getLoctor() {
		
		if(Loctor==null) {
			Loctor=new Loctor(driver);
		}
		return Loctor;
	}

	
	
		
	
		
	
}
