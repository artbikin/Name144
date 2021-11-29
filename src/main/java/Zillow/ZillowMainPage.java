package Zillow;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ZillowMainPage {

    public WebDriver driver;

    public ZillowMainPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement searchField(){
        return driver.findElement(By.xpath("//*[contains(@class,'tyledFormContro')]"));
}
    private WebElement resultZIP(){
        return driver.findElement(By.xpath("(//*[contains(text(),'90210')])[2]"));
    }

    private WebElement skip(){
        return driver.findElement(By.xpath("(//*[contains(@class,'StyledTextButton-c11n-8-48-0__sc-n1gfmh-0 jBjBRQ')])[2]"));
    }

    private WebElement clickAndHold(){
        return driver.findElement(By.xpath("(//*[contains(@class,'UnkiAKVRjgNlgjA')])[2]"));
    }

    public void open(String url){
        driver.get(url);
    }


    public void searchFor(String searchName) throws InterruptedException {
        searchField().click();
        Thread.sleep(2000);
        searchField().sendKeys(searchName);
        Thread.sleep(2000);
        searchField().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        skip().click();
        Thread.sleep(2000);

        Assert.assertTrue(resultZIP().isDisplayed());


        Actions actions = new Actions(driver);
        actions.moveToElement(clickAndHold());
        actions.clickAndHold().perform();
    }







}
