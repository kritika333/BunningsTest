package stepDefinition;

import PageObjects.HomePage;
import PageObjects.UImodule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class search extends UImodule {

    @Given("Search functionality should be tested")
    public void searchtest(){
        DriverConfiguration();

    }

    @Then("User lands to home page")
    public void userOnHomePage() throws IOException {
        HomePage homepage = new HomePage(driverThread);
        homepage.homeinit();
    }

    @Then("Search Bar should appear")
    public void checkSearchBar()
    {    HomePage homepage = new HomePage(driverThread);
        homepage.checkSearchbar();
    }

    @Then("Base text in search bar should be What can we help you find today?")
    public void baseText()
    {    HomePage homepage = new HomePage(driverThread);
        homepage.baseText();
    }


    @Then("User should be able to enter text in search bar")

    public void editSearchfield()
    {    HomePage homepage = new HomePage(driverThread);
        homepage.editSearchfield();
        QuitDriver(driverThread);
    }
}
