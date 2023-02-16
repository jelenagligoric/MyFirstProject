package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);}

    By signInRegisterBy = By.className("r-z");
    By signInWithZappos = By.id("zapposSignIn");
    By emailFieldBy = By.id("ap_email");
    By passwordFieldBy = By.id("ap_password");
    By signInButtonBy = By.id("signInSubmit");

    public void performLogin(){
        clickElement(signInRegisterBy);
        clickElement(signInWithZappos);
        writeText(emailFieldBy, "englishteacher.jelena@gmail.com");
        writeText(passwordFieldBy,"englishteacher00");
        clickElement(signInButtonBy);




    }
}
