package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

    private WebDriver driver;
    private By button = By.xpath("//a[@id='WC_AccountDisplay_links_2']");
    private By emailAddress = By.xpath("//input[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']");
    private By password = By.xpath("//input[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']");
    private By errors = By.xpath("//div[@id='pageLevelMessage']");
    private By forgotPass = By.xpath("//a[@id='WC_AccountDisplay_links_1']");
    private By successfulLogin = By.xpath("//p[contains(text(),'Welcome, Unknown Unkn')]");


    public SignIn(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailAddress(String email){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(emailAddress)));
        driver.findElement(emailAddress).sendKeys(email);
    }

    public void SetPassword(String pass){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(password)));
        driver.findElement(password).sendKeys(pass);
    }

    public void submit(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(button)));
        driver.findElement(button).click();
    }

    public boolean Login() {

        return !driver.findElements(successfulLogin).isEmpty();
    }

    public boolean errorExists() {

        return !driver.findElements(errors).isEmpty();
    }
    public ForgotPassword goForgotPassword() {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(forgotPass)));
        driver.findElement(forgotPass).click();
        return new ForgotPassword(driver);
    }

}
