package com.CucumberBDD2023.PageObject;

import com.CucumberBDD2023.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement SearchButton;

    public void multipleSearch(String item) {
        SearchTextBox.sendKeys(item);
        SearchButton.click();
    }

    public void MultipleSearchResult() {
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
    }
}
