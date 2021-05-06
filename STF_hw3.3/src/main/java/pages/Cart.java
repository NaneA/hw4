package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

    public WebDriver driver;
    private By textCart = By.xpath("//div[contains(text(),'Your shopping bag is empty.')]");
    private By contShop = By.xpath("//a[@id='shopcartHomepage']");

    public Cart(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){

        return driver.findElement(textCart).getText();
    }


    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void clickGoShop(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(contShop)));
        driver.findElement(contShop).click();
    }



}
