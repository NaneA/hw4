package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.directory.SearchResult;

public class Search {
    private WebDriver driver;
    private By searchbox =By.xpath("//input[@id='SimpleSearchForm_SearchTerm']");
 //   private By searchText = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[1]/div[3]/div[1]");

    private By Gender = By.xpath("//span[@id='navHeader_Gender_Label']");
    private By Price = By.xpath("//span[@id='navHeader_Price_Label']");
    private By checkboxWomen = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]");
    private By searchText = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[1]/div[3]/div[1]");
    private By checked = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[1]/div[3]/div[1]");
    private By navbar = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[2]/div[1]");


   private By el = By.xpath("//body/div[@id='page']/main[@id='contentWrapper']/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]/img[2]");

    public SearchResults gotoResultsPage(){
        clickXpath("//header/div[@id='stickyHeader']/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]/img[1]");
        return new SearchResults(driver);
    }
    public Search(WebDriver driver){
        this.driver = driver;
    }


    public void search(String searchItem){
        WebElement s = driver.findElement(searchbox);
        s.sendKeys(searchItem);
        s.submit();
    }

    public boolean ContentExists(){
        return !driver.findElements(navbar).isEmpty();
    }
    public String getSearchResults(){
        return driver.findElement(searchText).getText();
    }
    public String CheckboxCheck(){
        return driver.findElement(checkboxWomen).getText();
    }


    public void ClickCategories(){
        driver.findElement(Gender).click();
    }

    public void ClickCheck(){
        driver.findElement(checkboxWomen).click();
    }

    public void ClickElement(){
        driver.findElement(el).click();
    }
    private void clickXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
}
