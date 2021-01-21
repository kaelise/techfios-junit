package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewItemPage {
	
	WebDriver driver;
	public AddNewItemPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using ="input[name=\"data\"]") WebElement ADD_FIELD;
	@FindBy(how = How.CSS, using = "select[name=\"category\"]") WebElement CATEGORY_DROP_DOWN_FIELD;
	@FindBy(how = How.CSS, using = "select[name=\"due_day\"]") WebElement DAY_DROP_DROWN_FIELD;
	@FindBy(how = How.CSS, using = "select[name=\"due_month\"]") WebElement MONTH_DROP_DROWN_FIELD;
	@FindBy(how = How.CSS, using ="input[value=\"Add\"]") WebElement ADD_BUTTON_FIELD;
	 
	public void enterItem(String item) { 
		ADD_FIELD.sendKeys(item);
	}
	public void selectCategory() {
		BasePage.dropDown(CATEGORY_DROP_DOWN_FIELD, "test");
		
	}
	public void selectDay() {
		BasePage.dropDown(DAY_DROP_DROWN_FIELD, "1");
	}
	public void selecMonth() {
		BasePage.dropDown(MONTH_DROP_DROWN_FIELD, "Jan");
	}
	public void clickAddButton() {
		ADD_BUTTON_FIELD.click();
	}


}
