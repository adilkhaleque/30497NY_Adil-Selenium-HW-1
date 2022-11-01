package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInfoPage extends BasePage {

    @FindBy (id = "address1")
    public WebElement addressLine1;

    @FindBy (id = "address2")
    public WebElement addressLine2;

    @FindBy (id = "city")
    public WebElement cityField;

    @FindBy (id = "id_state")
    public WebElement stateSelector;

    @FindBy (id = "postcode")
    public WebElement zipCodeField;

    @FindBy (id = "phone_mobile")
    public WebElement mobileNumberField;

    @FindBy (id = "alias")
    public WebElement aliasField;

    @FindBy (id = "submitAddress")
    public WebElement saveButton;

    public AccountInfoPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputAddressLine1(String address1) {
        sendKeysToElement(addressLine1, address1);
    }

    public void inputAddressLine2(String address2) {
        sendKeysToElement(addressLine2, address2);
    }

    public void inputCityName(String city) {
        sendKeysToElement(cityField, city);
    }

    public void selectStateFromDropdown() {
        selectFromDropdownByValue(stateSelector, "32");
    }

    public void inputZipCode(String zipCode) {
        sendKeysToElement(zipCodeField, zipCode);
    }

    public void inputMobileNumber(String mobileNumber) {
        sendKeysToElement(mobileNumberField, mobileNumber);
    }

    public void inputNewAlias(String alias) {
        clearSendKeysToElement(aliasField, alias);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }

    public void scrollDownToAddressLine() {
        jsScrollDownUntilElementIsVisible(addressLine1);
    }

    public MyAddressesPage addShippingAddress(String address1, String address2, String city, String zipCode,
                                              String mobileNumber, String alias) {
        scrollDownToAddressLine();
        inputAddressLine1(address1);
        inputAddressLine2(address2);
        inputCityName(city);
        selectStateFromDropdown();
        inputZipCode(zipCode);
        inputMobileNumber(mobileNumber);
        inputNewAlias(alias);
        clickOnSaveButton();

        return new MyAddressesPage();
    }


}
