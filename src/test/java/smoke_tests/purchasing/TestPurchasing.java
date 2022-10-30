package smoke_tests.purchasing;

import application.page_library.HomePage;
import application.page_library.ProductPage;
import application.page_library.SearchResultsPage;
import application.page_library.ShoppingCartPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPurchasing extends BasePage {

    @Test
    public void testSearching() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        String expectedSearchText = "Search";
        Assert.assertEquals(searchResultsPage.getSearchText(), expectedSearchText);
    }

    @Test
    public void testAddingToCart() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        homePage.doSearch(searchTerm);

        SearchResultsPage searchResultsPage = new SearchResultsPage();

        String expectedCartText = "Your shopping cart";

        ShoppingCartPage shoppingCartPage = searchResultsPage.doAddToCart();
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), expectedCartText);
    }

    @Test
    public void testChangingColor() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        homePage.doSearch(searchTerm);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        ProductPage productPage = searchResultsPage.modifyColor();

        String expectedProductName = "Faded Short Sleeve T-shirts";

        Assert.assertEquals(productPage.getProductName(), expectedProductName);

    }

    @Test
    public void testQuantity() {
        HomePage homePage = new HomePage();
        String searchTerm = "t-shirts";
        homePage.doSearch(searchTerm);

        SearchResultsPage searchResultsPage = new SearchResultsPage();
        ProductPage productPage = searchResultsPage.getMoreInfo();

        ShoppingCartPage shoppingCartPage = productPage.modifyProductAttributes();


        String expectedQuantityText = "2 Products";

        Assert.assertEquals(shoppingCartPage.getQuantity(), expectedQuantityText);


    }
}
