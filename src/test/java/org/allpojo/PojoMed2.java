package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMed2 extends PojoMed1 {

	public PojoMed2() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	@FindBy(linkText="Blood, Heart and Circulation")
	private WebElement blood;


	public WebElement getBlood() {
		return blood;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
