package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    @FindBy (xpath = "//div[@class='breadcrumb clearfix']//span[2]")
    public WebElement shoppingCartText;

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);

    }

    public String getshoppingCartText() {
        return getTrimmedElementText(shoppingCartText);
    }
}
