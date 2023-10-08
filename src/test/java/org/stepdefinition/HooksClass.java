package org.stepdefinition;

import java.io.IOException;

import org.utilities.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LibGlobal {

	@Before(order = 1)

	public void beforeScenario() {

		OpenEdge();
		launchUrl("https://medlineplus.gov/");
	}

	@Before(order = 2)

	public void beforeSec1() {

		maxWindow();
	}

	@Before(order = 3)

	public void beforeSec2() {

		System.out.println("Last Before Executed");
	}

	
	@After(order = 4)

	public void afterSec() {

		System.out.println("third after order");
	}

	@After(order = 3)

	public void afterSec1() throws IOException {

		System.out.println("sec after order");
	}

	
	@After(order=2)
	
	public void afterSec2(Scenario s) throws IOException {

		String name = s.getName();
		String fileName = name.replace(" ", "_");
		takeSnap(fileName);
		closeBrowser();
	}
	
	
	
	
	
	
	
	
	
	
}
