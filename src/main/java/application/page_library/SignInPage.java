package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy (id = "email")
    public WebElement emailTextField;

    @FindBy (id = "passwd")
    public WebElement passwordTextField;

    @FindBy (id = "SubmitLogin")
    public WebElement signInButton;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputUserEmailAddress(String emailAddress) {
        sendKeysToElement(emailTextField, emailAddress);
    }

    public void inputUserPassword(String password) {
        sendKeysToElement(passwordTextField, password);
    }

    public void clickSignInButton() {
        clickOnElement(signInButton);
    }

    public MyAccountPage SignIn(String emailAddress, String password) {
        inputUserEmailAddress(emailAddress);
        inputUserPassword(password);
        clickSignInButton();

        return new MyAccountPage();
    }


}
