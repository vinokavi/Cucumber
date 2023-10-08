package org.stepdefinition;

import org.allpojo.PojoMed;
import org.allpojo.PojoMed3;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class MedHealthStepDefinition extends PojoMed3 {

	@Given("User should launch the browser and load the browser")
	public void user_should_launch_the_browser_and_load_the_browser() {

		//OpenEdge();
		//launchUrl("https://medlineplus.gov/");
		//maxWindow();
	}

	@When("User should click the Health Topics")
	public void user_should_click_the_Health_Topics() {

		PojoMed l = new PojoMed();
		WebElement healthclick = l.getHealthtopics();
		toClick(healthclick);

	}

	@When("User should click blood,heart and Circulation")
	public void user_should_click_blood_heart_and_Circulation() {

		PojoMed3 l = new PojoMed3();
		WebElement blood = l.getBlood();
		toClick(blood);
	}

	@When("User should click  Aortic Aneurysm")
	public void user_should_click_Aortic_Aneurysm() {

		PojoMed3 l = new PojoMed3();
		WebElement aortic2 = l.getAortic();
		toClick(aortic2);

	}

	@Then("User should navigate to the given issue")
	public void user_should_navigate_to_the_given_issue() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User should search incorrect problem in the seach box")
	public void user_should_search_incorrect_problem_in_the_seach_box() {

		PojoMed3 l = new PojoMed3();
		WebElement txtbox2 = l.getTxtbox();
		fillTextBox(txtbox2, "jhdhhvdmh");

	}

	@When("User should click the GO button")
	public void user_should_click_the_GO_button() {

		PojoMed3 l = new PojoMed3();
		WebElement searchgo = l.getTxtsearch();
		toClick(searchgo);

	}

	@Then("User should navigate to the credential page")
	public void user_should_navigate_to_the_credential_page() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the case", currentUrl.contains("Asources"));
		System.out.println("Test case passed");
	}

	@When("User should print title")
	public void userShouldPrintTitle() {
	    String title = driver.getTitle();
		System.out.println(title);
	}


	
	@When("User should search the correct drug in the seach box {string}")
	public void userShouldSearchTheCorrectDrugInTheSeachBox(String s1) {
	 
		PojoMed3 l = new PojoMed3();
		
		WebElement txtBox = l.getTxtbox();
		fillTextBox(txtBox, s1);
		
		
	}


	
	
	
	
}
