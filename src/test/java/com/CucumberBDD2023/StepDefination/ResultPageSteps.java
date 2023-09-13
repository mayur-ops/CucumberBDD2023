package com.CucumberBDD2023.StepDefination;

import com.CucumberBDD2023.PageObject.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResultPageSteps {
 ResultPage obj = new ResultPage();

    @When("user types puma in the search box")
    public void user_types_puma_in_the_search_box() {
    obj.dosearch("puma");
    }
    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
    obj.SearchButtonClick();
    }
    @When("user should be able to see all the puma products")
    public void user_should_be_able_to_see_all_the_puma_products() {
    obj.resultURL();
    }

    @And("user clicks on £{int} - £{int} price range checkbox")
    public void userClicksOn££PriceRangeCheckbox(int arg0, int arg1) throws InterruptedException {
    obj.checkBoxes();
    }

    @Then("user should able to see all the items within that price range")
    public void user_should_able_to_see_all_the_items_within_that_price_range() throws InterruptedException {
    obj.priceRange();
    }
}
