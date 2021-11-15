package stepDefinition;

import PageObjects.HomePage;
import PageObjects.UImodule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class search extends UImodule {

    @Given("Search functionality should be tested")
    public void searchtest(){
        DriverConfiguration();

    }

    @When("User lands to home page")
    public void userOnHomePage() throws IOException {
        System.out.println("inside homeinit");
        driverThread.get("https://www.bunnings.com.au");
    }

    @Then("Search Bar should appear")
    public void checkSearchBar()
    {
        if(driverThread.findElement(By.id("custom-css-outlined-input")).isDisplayed())
        System.out.println("Search bar displayed successfully");
    }

    @Then("Base text in search bar should be What can we help you find today?")
    public void baseText()
    {
        if(driverThread.findElement(By.id("custom-css-outlined-input")).getText().contains("What can we help you find today?"))
        System.out.println("Base text in Search bar displayed successfully");
    }


    @Then("User should be able to enter text in search bar")

    public void editSearchfield()
    {
        driverThread.findElement(By.id("custom-css-outlined-input")).sendKeys("stud finder");
        driverThread.findElement(By.id("crossIcon")).click();
        if(driverThread.findElement(By.id("custom-css-outlined-input")).getText().contains("stud finder"))
            System.out.println("Field edited successfully");
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
}




