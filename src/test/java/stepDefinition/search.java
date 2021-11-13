package stepDefinition;

import PageObjects.HomePage;
import PageObjects.UImodule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class search extends UImodule {

    HomePage homepage = new HomePage(driverThread);

    @Given("User lands to home page")
    public void userOnHomePage()
    {
        homepage.homeinit();

    }

    @Then("Search Bar should appear")
    public void checkSearchBar()
    {
        homepage.checkSearchbar();

    }

    @Then("Base text in search bar should be What can we help you find today?")
    public void baseText()
    {
        homepage.baseText();
    }


    @Then("User should be able to enter text in search bar")

    public void editSearchfield()
    {
        homepage.editSearchfield();
    }
}
