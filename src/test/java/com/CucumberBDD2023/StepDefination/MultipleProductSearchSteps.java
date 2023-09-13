package com.CucumberBDD2023.StepDefination;

import com.CucumberBDD2023.PageObject.MultipleProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleProductSearchSteps {

MultipleProductSearch obj = new MultipleProductSearch();

    @When("user search for {string}")
    public void user_search_for(String item) {
      obj.multipleSearch(item);

    }

    @Then("user should be able to see all product related searched")
    public void userShouldBeAbleToSeeAllProductRelatedSearched() {
        obj.MultipleSearchResult();
    }
}
