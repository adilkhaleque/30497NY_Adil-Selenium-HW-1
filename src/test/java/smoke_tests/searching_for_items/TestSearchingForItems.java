package smoke_tests.searching_for_items;

import application.page_library.HomePage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchingForItems extends BasePage {

    @Test
    public void testSearching() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        String expectedSearchText = "Search";
        Assert.assertEquals(searchResultsPage.getSearchText(), expectedSearchText);
    }


}
