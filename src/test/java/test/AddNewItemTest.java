package test;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddNewItemPage;
import page.BasePage;
import util.BrowserFactory;

public class AddNewItemTest extends BasePage {
	
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
	} 

}
