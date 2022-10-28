package smoke_tests.adding_to_cart;

import application.page_library.HomePage;
import application.page_library.SearchResultsPage;
import application.page_library.ShoppingCartPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddingToCart extends BasePage {

    @Test
    public void testAddingToCart() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        homePage.doSearch(searchTerm);

        SearchResultsPage searchResultsPage = new SearchResultsPage();

        String expectedCartText = "Your shopping cart";

        ShoppingCartPage shoppingCartPage = searchResultsPage.doAddToCart();
        Assert.assertEquals(shoppingCartPage.getshoppingCartText(), expectedCartText);
    }
}
