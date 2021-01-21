package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddNewItemPage;
import page.BasePage;
import page.ToggleAllCheckBoxPage;
import util.BrowserFactory;

public class ToggleAllCheckBoxTest {
	
	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddNewItem() {
	driver = BrowserFactory.launchBrowser();
	
	AddNewItemPage addnewitem = PageFactory.initElements(driver, AddNewItemPage.class);
	addnewitem.enterItem("Homework"+BasePage.randomNumGenerator());
	addnewitem.selectCategory();
	addnewitem.selectDay();
	addnewitem.selecMonth();
	addnewitem.clickAddButton();
	
	ToggleAllCheckBoxPage toggleallcheckbox = PageFactory.initElements(driver, ToggleAllCheckBoxPage.class);
	toggleallcheckbox.clickCheckAllBox();
	
	toggleallcheckbox.clickFirstCheckBox();
	toggleallcheckbox.clickRemovebutton();
	toggleallcheckbox.clickCheckAllBox();
	toggleallcheckbox.clickRemovebutton();
	
	BrowserFactory.tearDown();
	}

}
