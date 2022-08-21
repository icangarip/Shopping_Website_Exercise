package WebSiteC;

import POM.ContactUsElements;
import POM.HomePageElements;
import POM.LoginPageElements;
import Utils.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendMessageTest extends BaseDriver {

    HomePageElements homePageElements;
    LoginPageElements loginPageElements;
    ContactUsElements contactUsElements;

    @Test
    @Parameters("contactUsText")
    public void login(String contactUsText) {

        homePageElements = new HomePageElements(driver);
        loginPageElements = new LoginPageElements(driver);
        contactUsElements = new ContactUsElements(driver);



        /*wait.until(ExpectedConditions.elementToBeClickable(homePageElements.homePageSignInButton));
        homePageElements.homePageSignInButton.click();*/
        wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.emailBox));
        loginPageElements.emailBox.sendKeys("cg@cg.com");
        wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.passwordBox));
        loginPageElements.passwordBox.sendKeys("12345");

        loginPageElements.signInButton.click();

        loginPageElements.contactUsButton.click();

        Select selectSubject = new Select(contactUsElements.subjectDropdown);
        selectSubject.selectByVisibleText("Customer service");

        contactUsElements.contactUsText.sendKeys(contactUsText);

        contactUsElements.sendButton.click();

        String confirmMessage = contactUsElements.successMessage.getText();
        String actualMessage = "Your message has been successfully sent to our team.";

        if (confirmMessage.equals(actualMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("NO NO NO");
        }





    }


}
