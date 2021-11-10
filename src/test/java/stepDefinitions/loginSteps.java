package stepDefinitions;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.loginPage;

public class loginSteps {

    public loginPage loginPage;
    public static WebDriver driver;

    public loginSteps() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new loginPage(driver);
    }

    @Given("^the user navigates to the website$")
    public void theUserNavigatesToTheWebsite() {
        driver.get(" https://embark-demo.paylinksolutions.co.uk/login");
        driver.manage().window().maximize();
    }

    @When("^the user enters a valid username \"([^\"]*)\"$")
    public void theUserEntersAValidUsername(String username) throws InterruptedException {
        Thread.sleep(5000);
        loginPage.clickCookieButton();
        loginPage.enterUsername(username);
    }

    @And("^the user enters a valid password \"([^\"]*)\"$")
    public void theUserEntersAValidPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("^clicks the sign in button$")
    public void clicksTheSignInButton() {
        loginPage.clickSignInBtn();
    }

    @Then("^the user is logged in successfully$")
    public void theUserIsLoggedInSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(loginPage.accountIsDisplayed());
        driver.quit();
    }
}
