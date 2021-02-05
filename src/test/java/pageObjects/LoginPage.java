package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	private WebElement inputBox_UserName;	
	@FindBy(id="txtPassword")
	private WebElement inputBox_Password;
	@FindBy(id="btnLogin")
	private WebElement btn_Login;
	
	
	public WebElement getInputBox_UserName() {
		return inputBox_UserName;
	}
	public void setInputBox_UserName(WebElement inputBox_UserName) {
		this.inputBox_UserName = inputBox_UserName;
	}
	public WebElement getInputBox_Password() {
		return inputBox_Password;
	}
	public void setInputBox_Password(WebElement inputBox_Password) {
		this.inputBox_Password = inputBox_Password;
	}
	public WebElement getBtn_Login() {
		return btn_Login;
	}
	public void setBtn_Login(WebElement btn_Login) {
		this.btn_Login = btn_Login;
	}
	
	
	
	
}
