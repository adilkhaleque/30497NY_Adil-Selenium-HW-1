package smoke_tests.authentication;

import application.page_library.HomePage;
import application.page_library.MyAccountPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test
    public void testSignIn() {
        HomePage homePage = new HomePage();

        MyAccountPage myAccountPage = homePage.clickSignInButton().SignIn(config.appUser, config.appPassword);

        String expectedSignOutText = "Sign out";

        Assert.assertEquals(myAccountPage.getSignOutButtonText(), expectedSignOutText);
    }
}
