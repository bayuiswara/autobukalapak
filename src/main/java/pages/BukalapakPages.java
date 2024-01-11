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
    private final By verifyresultsearch = By.xpath("/html/body/div[2]/div/section/div/div/h1");
    public String verifyResultsearch() {

        return driver.findElement(verifyresultsearch).getText();
    }
    private final By buttonsorting = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div");
    public void buttonSorting() {
        driver.findElement(buttonsorting).click();
    }
    private final By buttonhighprice = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/ul/li[4]/div");
    public void buttonHighprice(){
        driver.findElement(buttonhighprice).click();
    }
    private final By verifyresultsorting = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div/div[1]/div/p");
    public String verifyresultSorting() {
        return driver.findElement(verifyresultsorting).getText();
    }


    public void scrollproduct(){
        js.executeScript("window.scrollBy(0,400)", "");
    }


    public By getElement(String elementLinkText){
        return By.partialLinkText(elementLinkText);
    }

    public void chooseproduct(String getElement){

       driver.findElement(getElement(getElement)).click();
    }
    private final By verifyproductpage = By.xpath("//*[@id=\"section-main-product\"]/div[2]/div[1]/div[1]/h1");
    public String verifyproductPage(){
        return driver.findElement(verifyproductpage).getText();

    }
    private final By buttonlowprice = By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/div");
    public void buttonLowprice(){
        driver.findElement(buttonlowprice).click();
    }
}

