package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckBoxPage {
	
	WebDriver driver;
	public ToggleAllCheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using = "input[name=\"allbox\"]") WebElement TOGGLE_CHECK_FIELD;
	@FindBy(how = How.CSS, using = "input[name=\"todo[0]\"]") WebElement FIRST_CHECKBOX_FIELD;
	@FindBy(how = How.CSS, using = "input[value=\"Remove\"]") WebElement REMOVE_BUTTON_FIELD;
	
	public void clickCheckAllBox() {
		TOGGLE_CHECK_FIELD.click();
	}
	public void clickFirstCheckBox() {
		FIRST_CHECKBOX_FIELD.click();
	}
	public void clickRemovebutton() {
		REMOVE_BUTTON_FIELD.click();
	}


}
