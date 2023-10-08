package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMed1 extends PojoMed {

	public PojoMed1() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(linkText="Blood, Heart and Circulation")
	private WebElement blood;


	public WebElement getBlood() {
		return blood;
	}
	
	
	@FindBy(linkText="Bones, Joints and Muscles")
	private WebElement bones;


	public WebElement getBones() {
		return bones;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
