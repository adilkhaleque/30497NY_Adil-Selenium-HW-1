package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy (className = "navigation_page")
    public WebElement searchText;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchText() {
        return getTrimmedElementText(searchText);
    }
}
