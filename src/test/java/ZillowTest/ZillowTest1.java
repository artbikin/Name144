package ZillowTest;

import Zillow.ZillowMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZillowTest1 {
    private WebDriver driver;


    @Test
    public void searchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.zillow.com";
        String searchName = "90210";
        ZillowMainPage zillowMainPage = new ZillowMainPage(driver);
        zillowMainPage.open(url);
        zillowMainPage.searchFor(searchName);

    }
}
