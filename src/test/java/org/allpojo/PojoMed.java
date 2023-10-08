package org.allpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.LibGlobal;

public class PojoMed extends LibGlobal{

	public PojoMed() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Health Topics")
	private WebElement healthtopics;


	public WebElement getHealthtopics() {
		return healthtopics;
	}
	
	
	
	@FindBy(name="query")
	private WebElement txtbox;
	
	
	
	@FindBy(xpath="(//button[@alt='Search MedlinePlus'])[1]")
	private WebElement txtsearch;


	public WebElement getTxtbox() {
		return txtbox;
	}



	public WebElement getTxtsearch() {
		return txtsearch;
	}
	
	
	
	
	
	
	
	
	
	
	
}
