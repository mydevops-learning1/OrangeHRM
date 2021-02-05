package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.*;
import pageObjects.AddEmployeePage;
import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import utils.BaseClass;

public class StepDefs extends BaseClass {

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.getInputBox_UserName().sendKeys("Admin");
		lp.getInputBox_Password().sendKeys("admin123");
		lp.getBtn_Login().click();

	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String exp_message = "Dashboard";
		String actual = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).getText();
		Assert.assertTrue("Login not successful", exp_message.equals(actual));
		// driver.quit();
	}

	@Given("^I mouseover on PIM tab$")
	public void i_mouseover_on_PIM_tab() throws Throwable {
		DashBoardPage dbp = PageFactory.initElements(driver, DashBoardPage.class);
		act.moveToElement(dbp.getPIMMenu()).build().perform();

	}

	@Given("^I click on AddEmployee option$")
	public void i_click_on_AddEmployee_option() throws Throwable {
		DashBoardPage dbp = PageFactory.initElements(driver, DashBoardPage.class);
		act.moveToElement(dbp.getPIM_AddEmployeeMenu()).click().build().perform();

	}

	@Given("^I enter FirstName (.*?)$")
	public void i_enter_FirstName_dell(String firstName) throws Throwable {
		AddEmployeePage aep = PageFactory.initElements(driver, AddEmployeePage.class);
		aep.getInput_FirstName().sendKeys(firstName);

	}

	@Given("^I enter LastName (.*?)$")
	public void i_enter_LastName_ibm(String lastName) throws Throwable {
		AddEmployeePage aep = PageFactory.initElements(driver, AddEmployeePage.class);
		aep.getInput_LastName().sendKeys(lastName);

	}

	@Given("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		AddEmployeePage aep = PageFactory.initElements(driver, AddEmployeePage.class);
		aep.getBtn_Save().click();

	}

	@Then("^the employee record is created	with name (.*?)$")
	public void the_employee_record_is_created(String name) throws Throwable {
		AddEmployeePage aep = PageFactory.initElements(driver, AddEmployeePage.class);
		String expected_emp_name = name;
		String actual_emp_name = aep.getEmployeeCreated().getText();
		Assert.assertTrue(
				"Employee record creation not successful as the expected record name is: " + expected_emp_name
						+ "and the actual record name is: " + actual_emp_name,
				expected_emp_name.equals(actual_emp_name));

	}

}
