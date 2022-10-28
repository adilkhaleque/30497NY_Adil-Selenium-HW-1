package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy (className = "logout")
    public WebElement signOutButton;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSignOutButtonText() {
        return signOutButton.getText();
    }
}
