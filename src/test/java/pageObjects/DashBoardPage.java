package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage {

	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	private WebElement PIMMenu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement PIM_AddEmployeeMenu;

	public WebElement getPIMMenu() {
		return PIMMenu;
	}

	public void setPIMMenu(WebElement pIMMenu) {
		PIMMenu = pIMMenu;
	}

	public WebElement getPIM_AddEmployeeMenu() {
		return PIM_AddEmployeeMenu;
	}

	public void setPIM_AddEmployeeMenu(WebElement pIM_AddEmployeeMenu) {
		PIM_AddEmployeeMenu = pIM_AddEmployeeMenu;
	}

	
	
	
	
}
