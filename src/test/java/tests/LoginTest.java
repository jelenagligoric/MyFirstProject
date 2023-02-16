package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserLoggedInPage;

public class LoginTest extends BaseTest{
    @Test
    public void performLogin()  {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin();
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.verifyLogin("My Account");


    }
}
