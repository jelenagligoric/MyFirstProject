package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);}

    By myAccountBy = By.id("headerMyAccountDropdownToggle");

    public void verifyLogin(String expectedText){
        assertStringEquals(readText(myAccountBy), expectedText);

    }
}
