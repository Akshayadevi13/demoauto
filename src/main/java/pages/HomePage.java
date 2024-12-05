package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[@href=\"Index.html\"]")
    WebElement home;

    @FindBy(id = "btn1")
    private WebElement SignIn;

    @FindBy(id = "btn2")
    private WebElement SkipSignIn;

    @FindBy(id ="email")
    private WebElement EmailForSignUp;

    @FindBy(id = "enterimg")
    private WebElement ClickEmailForSignUp;

    public void clickOnHome()
    {
        home.click();
    }

    public void SignIn()
    {
        SignIn.click();
    }

    public void SkipSignIn()
    {
        SkipSignIn.click();
    }

    public void EmailForSignUp(String mailid)
    {
        EmailForSignUp.sendKeys(mailid);
    }

    public void ClickEmail()
    {
        ClickEmailForSignUp.click();
    }


}
