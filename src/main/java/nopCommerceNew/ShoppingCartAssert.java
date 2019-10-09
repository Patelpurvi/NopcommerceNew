package nopCommerceNew;

import org.openqa.selenium.By;

public class ShoppingCartAssert extends BuyAProduct {

    public void shoppingCart(){
        assertUrl("onepagecheckout"); }



    private By _country = By.xpath("//select[@data-trigger=\"country-select\"]");
    private By _city = By.xpath("//input[@data-val-required=\"City is required\"]");
    private By _address1 = By.xpath("//input[@data-val-required=\"Street address is required\"]");
    private By _zipCode = By.xpath("//input[@data-val-required=\"Zip / postal code is required\"]");
    private By _phoneNumber = By.xpath("//input[@data-val-required=\"Phone is required\"]");
    private By _continue = By.xpath("//input[@title=\"Continue\"]");
    private By _shippingMehtodContinue = By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    private By _creditCard = By.xpath("//input[@id=\"paymentmethod_1\"]");
    private By _continue2 = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _selectCardType = By.xpath("//select[@class=\"dropdownlists\"]");
    private By _cardHolderName = By.xpath("//input[@data-val-required=\"Enter cardholder name\"]");
    private By _cardNumber = By.xpath("//input[@id=\"CardNumber\"]");
    private By _expiryMonth = By.xpath("//select[@id=\"ExpireMonth\"]");
    private By _expiryYear = By.xpath("//select[@id=\"ExpireYear\"]");
    private By _cardCode = By.xpath("//input[@name=\"CardCode\"]");
    private By _continuefororder = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _conformorder = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");


    public void userisonShippingAddresspage () {


        selectByValue(_country, loadProperties.getProperty("country")); //select country
        enterText(_city, loadProperties.getProperty("city")); // enter city
        enterText(_address1, loadProperties.getProperty("address1")); //enter address1
        enterText(_zipCode, loadProperties.getProperty("zipcode")); //enter zipcode
        enterText(_phoneNumber, loadProperties.getProperty("phonenumber")); //enter phonenumber
        clickElement(_continue); //click on  after phone number continue
    }
        public void clickContinueShipping() {
            clickElement(_shippingMehtodContinue);
        }
         public void clickCreaditCard() {
             clickElement(_creditCard);  // click on creditcard
             clickElement(_continue2);
         }
        public void paymentInformationDetails() {
            selectByVisibleText(_selectCardType, loadProperties.getProperty("cardtype")); //select tht cardtype
            enterText(_cardHolderName, loadProperties.getProperty("FirstName")); //enter the cardholdername
            enterText(_cardNumber, loadProperties.getProperty("cardnumber")); //enter the card number
            selectByVisibleText(_expiryMonth, loadProperties.getProperty("expirymonth")); //select the expirymonth
            selectByVisibleText(_expiryYear, loadProperties.getProperty("expiryyear")); //select the expiryyear
            enterText(_cardCode, loadProperties.getProperty("cardcode"));//enter the security code
            clickElement(_continuefororder);
        }
        public void clickOnConformOrder(){
        clickElement(_conformorder);}

        public void orderComplete (){
        assertUrl("checkout");











        }
}
