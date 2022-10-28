package smoke_tests.searchingForItems;

import application.page_library.HomePage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearching extends BasePage {

    @Test
    public void testSearching() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        String expectedSearchText = "Search";
        Assert.assertEquals(searchResultsPage.getSearchText(), expectedSearchText);
    }


}
