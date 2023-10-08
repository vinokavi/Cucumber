package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.allpojo.PojoMed3;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class DataTableStepDefinition extends PojoMed3 {

	
	
	
	
	@When("User should Search the correct drug in the seach box")
	public void userShouldSearchTheCorrectDrugInTheSeachBox(io.cucumber.datatable.DataTable d) {
	    
		PojoMed3 l =new PojoMed3();
		
		WebElement txtBox = l.getTxtbox();
		String s1 = d.asLists().get(1).get(1);
		fillTextBox(txtBox, s1);
		
		
		
		
	}

	@When("User should searcH the correct drug in the seach box")
	public void userShouldSearcHTheCorrectDrugInTheSeachBox(io.cucumber.datatable.DataTable d) {
	  
		
           PojoMed3 l =new PojoMed3();
		
		WebElement txtBox = l.getTxtbox();
		List<Map<String, String>> mp = d.asMaps();
		String s1 = mp.get(1).get("Scans");
		
		fillTextBox(txtBox, s1);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
