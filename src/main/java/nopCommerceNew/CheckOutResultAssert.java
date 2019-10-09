package nopCommerceNew;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CheckOutResultAssert extends Utils{

    LoadProperties loadProperties = new LoadProperties();

    private By _asAGuest = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");
    private By _firstname =By.xpath("//input[@data-val-required=\"First name is required.\"]");
    private By _lastname = By.xpath("//input[@data-val-required=\"Last name is required.\"]");
    private By _email = By.xpath("//input[@data-val-required=\"Email is required.\"]");


    public void userIsOnCheckoutasaguestorregisterPage (){

        assertUrl("checkoutasguest?returnUrl=%2Fcart");
    }
    public void userShouldContinueAsAGuset(){
        clickElement(_asAGuest);
        enterText(_firstname,loadProperties.getProperty("FirstName")); //enter first name
        enterText(_lastname,loadProperties.getProperty("LastName")); //enter last name
        enterText(_email,loadProperties.getProperty("friendemail"));// enter email address

    }}

