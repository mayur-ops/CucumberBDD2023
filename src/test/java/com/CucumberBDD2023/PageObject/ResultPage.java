package com.CucumberBDD2023.PageObject;

import com.CucumberBDD2023.BaseClassPackage.DriverFactory;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverFactory {

//    public void currentURL() {
//        String actualURL = driver.getCurrentUrl();
//        System.out.println(actualURL);
//        Assert.assertThat(actualURL, CoreMatchers.containsString("https://www.argos.co.uk/"));
//    }

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    public void dosearch(String item) {
        SearchTextBox.sendKeys(item);
    }

    @FindBy(className = "_2mKaC")
    WebElement SearchButton;

    public void SearchButtonClick() {
        SearchButton.click();
    }


    @FindBy(xpath = "//h1[contains(text(),'puma')]")
    WebElement pumaHeading;

    public void resultURL() {
        String actual = pumaHeading.getText();
        System.out.println(actual);
        Assert.assertThat(actual, Matchers.containsString("puma"));
    }

    @FindBy(css = ".Checkboxstyles__CheckboxOption-b61uwr-3.cKQGxN")
    private List<WebElement> CheckBoxesList;

    public void checkBoxes() {
        for (WebElement checkBox : CheckBoxesList) {
            System.out.println(checkBox.getText());
            if (checkBox.getText().contains("£10 - £15")) ;
            checkBox.click();
            break;
        }
    }

    @FindBy(css = ".ProductCardstyles__ValueMessagingContainer-h52kot-14.ejTbAz")
    private List<WebElement> PriceRangeList;

    public void priceRange() throws InterruptedException {
        Thread.sleep(2000);
        for (WebElement pricerange : PriceRangeList) {
            System.out.println(pricerange.getText());
            String pricewithoutpound = pricerange.getText().replace("£", "");
            double Priceindouble = Double.parseDouble(pricewithoutpound);
            System.out.println(Priceindouble);
            Assert.assertThat(Priceindouble, Matchers.greaterThanOrEqualTo(10.00));
            Assert.assertThat(Priceindouble, Matchers.lessThanOrEqualTo(15.00));
        }
    }
}
