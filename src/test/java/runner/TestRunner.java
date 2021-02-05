package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;
import utils.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, glue = {"seleniumgluecode", "utils"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true)
public class TestRunner {
	@BeforeClass
	public static void beforeExecutionStarts(){
		BaseClass.init();
	}
	
	 @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	    
	    }
}
