package smoke_tests.adding_shipping_address;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShippingAddress extends BasePage {

    @Test
    public void testShippingAddress() {
        HomePage homePage = new HomePage();
        MyAccountPage myAccountPage = homePage.clickSignInButton().SignIn(config.appUser, config.appPassword);
        myAccountPage.clickOnMyAddresses();

        MyAddressesPage myAddressesPage = new MyAddressesPage();
        AccountInfoPage accountInfoPage = myAddressesPage.clickOnNewAddressButton();

        String address1 = "1234 56th Ave";
        String address2 = "3rd FL";
        String city = "New York City";
        String zipCode = "12345";
        String mobileNumber = "111-111-1111";
        String alias = "My Address-new";

        MyAddressesPage myAddressesPage1 = accountInfoPage.addShippingAddress(address1, address2, city, zipCode, mobileNumber, alias);

        Assert.assertTrue(myAddressesPage1.backButton.isDisplayed());
    }

}
