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

    @FindBy (id = "color_2")
    public WebElement itemColor;

    @FindBy (xpath = "//div[@class='button-container']//a[@itemprop='url']")
    public WebElement moreInfoButton;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchText() {
        return searchText.getText();
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

    public void chooseColor() {
        clickOnElement(itemColor);
    }

    public ProductPage modifyColor() {
        hoverOverItem();
        chooseColor();

        return new ProductPage();
    }

    public ProductPage clickMoreInfoButton() {
        clickOnElement(moreInfoButton);

        return new ProductPage();
    }

    public ProductPage getMoreInfo() {
        hoverOverItem();
        clickMoreInfoButton();

        return new ProductPage();
    }


}
