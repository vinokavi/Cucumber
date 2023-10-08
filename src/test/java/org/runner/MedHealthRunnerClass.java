package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",
strict=false,monochrome=true,snippets=SnippetType.CAMELCASE,tags= {"@Smoke or @Sanity"},
plugin= {"html:target\\Reports",
		"junit:target\\Reports\\healthcare.xml",
	    "json:target\\Reports\\hcare.json"})



public  class MedHealthRunnerClass extends JVMReport  {

	@AfterClass
	
	public static void callReport() {

		generateJVMReport(System.getProperty("user.dir")+"target\\\\Reports\\\\hcare.json");
		
	}
	
	
	
}
