package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (className = "login")
    public WebElement signInButton;

    @FindBy (id = "search_query_top")
    public WebElement searchField;

    @FindBy (name = "submit_search")
    public WebElement searchButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public SignInPage clickSignInButton() {
        clickOnElement(signInButton);

        return new SignInPage();
    }

    public void inputSearchText(String searchTerm) {
        sendKeysToElement(searchField, searchTerm);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public SearchResultsPage doSearch(String searchTerm) {
        inputSearchText(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }
}
