package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='agree']")
    private WebElement acceptCookie;

    @FindBy(id = "username-i")
    private WebElement usernameField;

    @FindBy(id = "password-i")
    private WebElement passwordField;

    @FindBy(id = "login-btn")
    private WebElement siginBtn;

    @FindBy(id = "my-account")
    private WebElement myAccount;

    public void clickCookieButton() {
        acceptCookie.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInBtn() {
        siginBtn.click();
    }

    public boolean accountIsDisplayed() {
        return myAccount.isDisplayed();
    }
}
