package stepDefinition;


import Core.UImodule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.desktop.QuitStrategy;

public class search extends UImodule {

    @Given("User is on home page")
    public void userOnHomePage() {
        DriverConfiguration();
        System.out.println("inside homeinit");
        driverThread.get("https://www.bunnings.com.au");
        Assert.assertTrue(driverThread.findElement(By.xpath("//*[@data-locator='logo-Bunnings']")).isDisplayed());
    }

    @Given("Search Bar should appear")
    public void checkSearchBar()
    {
        Assert.assertTrue(driverThread.findElement(By.id("custom-css-outlined-input")).isDisplayed());
        System.out.println("Search bar displayed successfully");
    }

    @Then("Base text in search bar should be What can we help you find today?")
    public void baseText()
    {
        if(driverThread.findElement(By.id("custom-css-outlined-input")).getText().contains("What can we help you find today?"));
                System.out.println("Base text in Search bar displayed successfully");
    }

    @Then("Popular searches should appear on search bar click")
    public void flyoutdisplay()
    {
        driverThread.findElement(By.id("custom-css-outlined-input")).click();
        Assert.assertTrue(driverThread.findElement(By.id("flyout")).isDisplayed());
    }


    @And("^User Enters ([^\"]*) in search bar$")
    public void enterProduct(String product)
    {
        driverThread.findElement(By.id("custom-css-outlined-input")).sendKeys(product);
        driverThread.findElement(By.id("crossIcon")).click();

    }

    @Then("Search results should appear")
    public void searchResult()
    {
        // Assert.assertTrue(driverThread.findElement(By.xpath("//*[@class='searchTerm']")).isDisplayed());
        WebDriverWait wait=new WebDriverWait(driverThread,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='searchTerm']"))).isDisplayed();
    }

    @Then("^Total number of result ([^\"]*) should appear$")
    public void totalProduct(String total)
    {
        driverThread.findElement(By.xpath("//div[@class='totalResults']/p")).getText().contains(total);
        QuitDriver(driverThread);
    }

    @When("User select item from flyout")
    public void selectItem()
    {
        driverThread.findElement(By.xpath("(//*[@data-code='0177356'])[1]")).click();

    }

    @And("Product description should display")
    public void addtoCart()
    {
        WebDriverWait wait=new WebDriverWait(driverThread,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='productDescriptionTopWrapper']"))).isDisplayed();
    }

    @And("User closed the browser")

    public void closeBowser()
    {
        QuitDriver(driverThread);

    }
}
