package WebSiteC;

import POM.ContactUsElements;
import POM.HomePageElements;
import POM.LoginPageElements;
import Utils.BaseDriver;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Scenario2 extends BaseDriver {

    HomePageElements homePageElements;
    LoginPageElements loginPageElements;
    ContactUsElements contactUsElements;

    @Test
    public void placeOrder() {
        homePageElements = new HomePageElements(driver);
        loginPageElements = new LoginPageElements(driver);
        contactUsElements = new ContactUsElements(driver);


        wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.emailBox));
        loginPageElements.emailBox.sendKeys("cg@cg.com");
        wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.passwordBox));
        loginPageElements.passwordBox.sendKeys("12345");

        loginPageElements.signInButton.click();

        homePageElements.homePageLogo.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        WebDriver webdriver;
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.cssSelector("img[class='replace-2x img-responsive']"));
        action.moveToElement(we).click(homePageElements.itemAddToCart).perform();
        wait.until(ExpectedConditions.elementToBeClickable(homePageElements.proceedToCheckout));
        homePageElements.proceedToCheckout.click();

        homePageElements.proceedToCheckoutOnSummary.click();
        homePageElements.proceedToCheckoutOnAddress.click();
        homePageElements.checkBox.click();
        homePageElements.proceedToCheckoutOnShipping.click();
        homePageElements.payByBankWireButton.click();
        homePageElements.confirmMyOrderButton.click();

        String orderConfirmation =  homePageElements.orderConfirmation.getText();
        String referenceValue = orderConfirmation.substring(216,225);

        homePageElements.myAccountButton.click();
        homePageElements.ordersButton.click();
        String lastOrder = homePageElements.lastOrder.getText();
        System.out.println("Order reference number --> "+referenceValue);
        System.out.println("Last order's reference number --> "+lastOrder);
        System.out.println("----------------------------------");




        if (referenceValue.equals(lastOrder)) {
            System.out.println("PASSED");
        } else {
            System.out.println("NO NO NO");
        }





    }

}
