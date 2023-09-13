package com.CucumberBDD2023.StepDefination;

import com.CucumberBDD2023.PageObject.IndividualProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProductSearchSteps {

    IndividualProductSearch obj = new IndividualProductSearch();

    @Given("user is on the home page of argos website")
    public void user_is_on_the_home_page_of_argos_website() {
        obj.currentURL();
    }

    @When("user types nike in the search box")
    public void user_types_nike_in_the_search_box() {
        obj.dosearch("Nike");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        obj.SearchButtonClick();
    }

    @Then("user should be able to see all the nike products")
    public void user_should_be_able_to_see_all_the_nike_products() {
        obj.resultURL();

    }

}
