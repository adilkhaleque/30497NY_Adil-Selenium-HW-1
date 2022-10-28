package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy (className = "navigation_page")
    public WebElement searchText;

    @FindBy (xpath = "//a[@title='Add to cart']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//a[@class='product_img_link']")
    public WebElement itemLink;

    @FindBy (xpath = "//div[@id='layer_cart']//a[@title='Proceed to checkout']")
    public WebElement checkoutButton;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchText() {
        return getTrimmedElementText(searchText);
    }

    public void hoverOverItem() {
        hoverOverElement(itemLink);
    }
    public void addItemToCart() {
        clickOnElement(addToCartButton);
    }

    public void clickCheckoutButton() {
        clickOnElement(checkoutButton);
    }
    public ShoppingCartPage doAddToCart() {
        hoverOverItem();
        addItemToCart();
        clickCheckoutButton();

        return new ShoppingCartPage();
    }

}
