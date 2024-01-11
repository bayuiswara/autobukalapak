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
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        Thread.sleep(1000);
        bl.openBukalapak();

    }


    @And("User Click search")
    public void userClickSearch() {
        bl.buttonSearch();
    }

    @Then("Product {string} displayed")
    public void productBolaBasketDisplayed(String text) {
        System.out.println(bl.verifyResultsearch());
        Assertions.assertEquals(text, bl.verifyResultsearch());
    }



    @Then("Product Bola Basket sort by {string}")
    public void productBolaBasketSortByTermahal(String text) {
        System.out.println(bl.verifyresultSorting());
        Assertions.assertEquals(text, bl.verifyresultSorting());
    }

    @Then("Product page {string} displayed")
    public void productPageBolaBasketMoltenBGBGSizeFIBAApprovedDisplayed(String text) {
        System.out.println(bl.verifyproductPage());
        Assertions.assertEquals(text, bl.verifyproductPage());
    }

    @And("User Scrolling Product")
    public void userScrollingProduct() {
        bl.scrollproduct();
    }




    @When("User Input {string} in search bar")
    public void userInputBolaBasketInSearchBar(String teks) throws InterruptedException {
        Thread.sleep(1000);
        bl.inputText(teks);
    }

    @And("User choose {string}")
    public void userChoose(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        bl.chooseproduct(arg0);
    }

    @And("User sort by lowest price")
    public void userSortByLowestPrice() {
        bl.buttonLowprice();
    }

    @And("User Choose highest price")
    public void userChooseHighestPrice() {
        bl.buttonHighprice();
    }

    @And("User Choose Sorting")
    public void userChooseSorting() {
        bl.buttonSorting();
    }
}

