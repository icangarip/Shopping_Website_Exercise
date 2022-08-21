package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[class='login']")
    public WebElement lutfenArtikOlsun;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "passwd")
    public WebElement passwordBox;

    @FindBy(css = "button[name='SubmitLogin']")
    public WebElement signInButton;

    @FindBy(css = "a[title='Contact Us']")
    public WebElement contactUsButton;






}
