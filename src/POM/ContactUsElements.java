package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContactUsElements {

    public ContactUsElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "id_contact")
    public WebElement subjectDropdown;

    @FindBy(id = "id_order")
    public WebElement orderReferenceDropDown;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement sendButton;

    @FindBy(id = "message")
    public WebElement contactUsText;

    @FindBy(css = "p[class='alert alert-success']")
    public WebElement successMessage;




}
