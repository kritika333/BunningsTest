package PageObjects;

import com.google.common.graph.AbstractNetwork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class HomePage extends UImodule {

    public HomePage(WebDriver driverThread) {
        this.driverThread = driverThread;
    }

    public void homeinit() throws IOException
    {
        System.out.println("inside homeinit");
        driverThread.get("https://www.bunnings.com.au");
    }

    public void checkSearchbar()
    {
       if(driverThread.findElement(By.id("custom-css-outlined-input")).isDisplayed())
           System.out.println("Search bar displayed successfully");

    }

    public void baseText()
    {
        if(driverThread.findElement(By.id("custom-css-outlined-input")).getText().contains("What can we help you find today?"))
            System.out.println("Base text in Search bar displayed successfully");
    }

    public void editSearchfield()
    {
        driverThread.findElement(By.id("custom-css-outlined-input")).sendKeys("stud finder");
        driverThread.findElement(By.id("crossIcon")).click();
        if(driverThread.findElement(By.id("custom-css-outlined-input")).getText().contains("stud finder"))
            System.out.println("Field edited successfully");
    }


    public void enterProduct(String product)
    {
        driverThread.findElement(By.id("custom-css-outlined-input")).sendKeys(product);
        driverThread.findElement(By.id("crossIcon")).click();
    }

    public void searchResult()
    {
        driverThread.findElement(By.className("searchTermContainer"));
    }

}