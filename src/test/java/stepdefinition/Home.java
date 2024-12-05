package stepdefinition;

import factory.DriverFactory;
import hooks.MyHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.util.Map;

public class Home
{
    WebDriver driver;


    @Given("user navigates to home page")
    public void user_navigates_to_home_page()
    {
        driver =DriverFactory.getDriver();
        HomePage homepage =new HomePage(driver);
        homepage.clickOnHome();
    }

    @When("user click on sign in button")
    public void user_click_on_sign_in_button()
    {
        HomePage homepage =new HomePage(driver);
        homepage.SignIn();
    }
    @Then("user should navigates to sign in page")
    public void user_should_navigates_to_sign_in_page()
    {
        System.out.println("user navigated to SignIn page");
    }

    @When("user click on skip sign button")
    public void user_click_on_skip_sign_button()
    {
        HomePage homepage =new HomePage(driver);
        homepage.SkipSignIn();
    }
    @Then("user should navigates to register page")
    public void user_should_navigates_to_register_page()
    {
        System.out.println("user navigated to Register page");
    }


    @When("user enter valid mail id into maid id field")
    public void user_enter_valid_mail_id_into_maid_id_field(DataTable dataTable)
    {
        Map<String, String> dataMap = dataTable.asMap(String.class,String.class);

        HomePage homepage =new HomePage(driver);
        homepage.EmailForSignUp(dataMap.get("mailid"));
    }

    @And("user click on enter")
    public void user_click_on_enter()
    {
        HomePage homepage =new HomePage(driver);
        homepage.ClickEmail();
    }





}
