package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMed3 extends PojoMed2 {

	public PojoMed3() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText="Aortic Aneurysm")
	private WebElement aortic;


	public WebElement getAortic() {
		return aortic;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
