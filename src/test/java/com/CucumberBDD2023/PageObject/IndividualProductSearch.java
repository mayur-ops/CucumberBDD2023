package com.CucumberBDD2023.PageObject;

import com.CucumberBDD2023.BaseClassPackage.DriverFactory;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IndividualProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"findability\"]/div[6]/div/div[5]/div[1]/h1")
    WebElement nikeHeading;

    public void currentURL() {
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertThat(actualURL, CoreMatchers.containsString("https://www.argos.co.uk/"));
    }

    public void dosearch(String item) {
        SearchTextBox.sendKeys(item);
    }

    public void SearchButtonClick() {
        SearchButton.click();
    }

    public void resultURL() {
        String actual = nikeHeading.getText();
        System.out.println(actual);
        Assert.assertThat(actual, Matchers.containsString("nike"));


//        String actualURL = driver.getCurrentUrl();
//        System.out.println(actualURL);
//        Assert.assertThat(actualURL, CoreMatchers.containsString("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"));
//
    }
}
