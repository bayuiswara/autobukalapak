package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.WebDriverFactory;

public class BukalapakPages {
    private final WebDriver driver= WebDriverFactory.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void openBukalapak() throws InterruptedException{
       driver.get("https://www.bukalapak.com/");
    Thread.sleep(1000);
    }

    private final By inputtext = By.xpath("//*[@id=\"v-omnisearch__input\"]");
    public void  inputText(String text){
        driver.findElement(inputtext).sendKeys(text);
    }
    private final By buttonsearch = By.xpath("//*[@id=\"v-omnisearch\"]/button");
    public void buttonSearch(){
        driver.findElement(buttonsearch).click();
    }
    private final By verifyResultsearch = By.xpath("/html/body/div[2]/div/section/div/div/h1");
    public String verifyresultsearch() {

        return driver.findElement(verifyResultsearch).getText();
    }
    private final By buttonsorting = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div");
    private final By buttonHighprice = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/ul/li[4]/div");
    public void buttonSorting() {
        driver.findElement(buttonsorting).click();
        driver.findElement(buttonHighprice).click();
    }
    private final By verifyresultSorting = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div/div[1]/div/p");
    public String verifyresultsorting() {
        return driver.findElement(verifyresultSorting).getText();
    }


    public void scrollproduct(){
        js.executeScript("window.scrollBy(0,950)", "");
    }

    private final By chooseProduct = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[3]/client-only/div/div/div[10]");
    public void chooseproduct(){
        driver.findElement(chooseProduct).click();
    }
    private final By verifyproductPage = By.xpath("//*[@id=\"section-main-product\"]/div[2]/div[1]/div[1]/h1");
    public String verifyproductpage(){
        return driver.findElement(verifyproductPage).getText();

    }
}

