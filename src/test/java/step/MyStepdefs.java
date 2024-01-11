package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BukalapakPages;

public class MyStepdefs {
    BukalapakPages bl = new BukalapakPages();
    @Given("User successfully open website Bukalapak.com")
    public void userSuccessfullyOpenWebsiteBukalapakCom() throws InterruptedException {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir  + "/driver/chromedriver.exe");
        Thread.sleep(1000);
        bl.openBukalapak();

    }

    @io.cucumber.java.en.When("^User Input 'Bola Basket' in search bar$")
    public void userInputBolaBasketInSearchBar() throws InterruptedException {
      Thread.sleep(1000);
      bl.inputText("Bola Basket");
    }

    @And("User Click search")
    public void userClickSearch() {bl.buttonSearch();
    }

    @Then("Product {string} displayed")
    public void productBolaBasketDisplayed(String text) {
        System.out.println(bl.verifyresultsearch());
    Assertions.assertEquals(text, bl.verifyresultsearch());
    }

    @And("User sort by highest price")
    public void userSortByHighestPrice() {bl.buttonSorting();
    }

    @Then("Product Bola Basket sort by {string}")
    public void productBolaBasketSortByTermahal(String text) {
        System.out.println(bl.verifyresultsorting());
        Assertions.assertEquals(text,bl.verifyresultsorting());
    }

    @Then("Product page {string} displayed")
    public void productPageBolaBasketMoltenBGBGSizeFIBAApprovedDisplayed(String text) {
        System.out.println(bl.verifyproductpage());
        Assertions.assertEquals(text,bl.verifyproductpage());
    }

   @And("User Scrolling Product")
    public void userScrollingProduct() {bl.scrollproduct();
    }


    @And("User choose DONIC MOBILE BALL BASKET COACHY PENAMPUNG BOLA LATIHAN TENIS MEJA ORIGINAL")
    public void userChooseDONICMOBILEBALLBASKETCOACHYPENAMPUNGBOLALATIHANTENISMEJAORIGINAL() {bl.chooseproduct();
    }

