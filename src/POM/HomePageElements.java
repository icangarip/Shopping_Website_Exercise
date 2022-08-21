package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    public HomePageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[class='login']")
    public WebElement homePageSignInButton;

    @FindBy(css = "img[alt='My Store']")
    public WebElement homePageLogo;

    /*@FindBy(css = "(//*[@title='Add to cart'])[3]")
    public WebElement firstItem;*/
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement itemAddToCart;


    @FindBy (css = "a[class='btn btn-default button button-medium']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutOnSummary;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceedToCheckoutOnAddress;

    @FindBy(css = "input[name='cgv']")
    public WebElement checkBox;

    @FindBy(css = "button[name='processCarrier']")
    public WebElement proceedToCheckoutOnShipping;

    @FindBy(css = "a[class='bankwire']")
    public WebElement payByBankWireButton;

    @FindBy(css = "button[class='button btn btn-default button-medium']")
    public WebElement confirmMyOrderButton;

    @FindBy(css = "div[class='box']")
    public  WebElement orderConfirmation;

    @FindBy(css = "div[class='box']>br:nth-of-type(5)")
    public WebElement reference2;

    @FindBy(css = "a[class='account']")
    public WebElement myAccountButton;

    @FindBy(css = "a[title='Orders']")
    public WebElement ordersButton;

    @FindBy(css = "td[class='history_link bold footable-first-column']")
    public WebElement lastOrder;

    @FindBy(css = "tbody>tr:nth-child(n)")
    public  WebElement list;





}
