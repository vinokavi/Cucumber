package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonPath) {

		File f = new File(System.getProperty("user.div")+"HealthcareCucumber\\target\\Reports");
		
		Configuration con = new Configuration(f,"Healthcare Project");
		
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "116");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Sprint", "101");		
        con.addClassifications("Time Zone", "IST");
        
        
        
        List<String> li = new ArrayList<String>();
        
        ReportBuilder r = new ReportBuilder(li,con);
        r.generateReports();
        
        
        
        
        
        
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
