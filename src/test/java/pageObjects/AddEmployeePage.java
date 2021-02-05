package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {

	@FindBy(id="firstName")
	private WebElement input_FirstName;
	
	@FindBy(id="lastName")
	private WebElement input_LastName;
	
	@FindBy(id="btnSave")
	private WebElement btn_Save;
	
	@FindBy(xpath="//*[@id='profile-pic']/h1")
	private WebElement EmployeeCreated;

	

	public WebElement getEmployeeCreated() {
		return EmployeeCreated;
	}

	public void setEmployeeCreated(WebElement employeeCreated) {
		EmployeeCreated = employeeCreated;
	}

	public WebElement getInput_FirstName() {
		return input_FirstName;
	}

	public void setInput_FirstName(WebElement input_FirstName) {
		this.input_FirstName = input_FirstName;
	}

	public WebElement getInput_LastName() {
		return input_LastName;
	}

	public void setInput_LastName(WebElement input_LastName) {
		this.input_LastName = input_LastName;
	}

	public WebElement getBtn_Save() {
		return btn_Save;
	}

	public void setBtn_Save(WebElement btn_Save) {
		this.btn_Save = btn_Save;
	}
	
}
