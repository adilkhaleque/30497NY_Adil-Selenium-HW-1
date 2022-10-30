package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy (className = "icon-plus")
    public WebElement increaseQuantityButton;

    @FindBy (id = "uniform-group_1")
    public WebElement sizeSelectorField;

    @FindBy (xpath = "//select[@id='group_1']//option[2]")
    public WebElement specificSize;

    @FindBy (xpath = "//*[@itemprop='name']")
    public WebElement productName;

    @FindBy (xpath = "//p[@id='add_to_cart']/button[@name='Submit']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//div[@id='layer_cart']//a[@title='Proceed to checkout']")
    public WebElement checkoutButton;

    public ProductPage() {
        PageFactory.initElements(driver,this);
    }

    public void increaseQuantity() {
        clickOnElement(increaseQuantityButton);
    }

    public void clickSizeDropdown() {
        clickOnElement(sizeSelectorField);
    }

    public void clickOnSize() {
        clickOnElement(specificSize);
    }

    public String getProductName() {
        return getTrimmedElementText(productName);
    }

    public void clickAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void clickCheckoutButton() {
        clickOnElement(checkoutButton);
    }

    public ShoppingCartPage modifyProductAttributes() {
        increaseQuantity();
        clickSizeDropdown();
        clickOnSize();
        clickAddToCartButton();
        clickCheckoutButton();

        return new ShoppingCartPage();
    }
}
