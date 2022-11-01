package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy (className = "logout")
    public WebElement signOutButton;

    @FindBy (xpath = "//div[@id='center_column']//a[@title='Addresses']")
    public WebElement myAddressesButton;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSignOutButtonText() {
        return signOutButton.getText();
    }

    public void clickOnMyAddresses() {
        clickOnElement(myAddressesButton);
    }
}
