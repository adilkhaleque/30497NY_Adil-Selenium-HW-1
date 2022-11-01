package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressesPage extends BasePage {

    @FindBy (xpath = "//div[@id='center_column']//a[@title='Add an address']")
    public WebElement addNewAddressButton;

    @FindBy (xpath = "//ul[@class='footer_links clearfix']//li[1]/a")
    public WebElement backButton;

    public AccountInfoPage clickOnNewAddressButton () {
        clickOnElement(addNewAddressButton);

        return new AccountInfoPage();
    }

    public MyAddressesPage() {
        PageFactory.initElements(driver, this);
    }
}
