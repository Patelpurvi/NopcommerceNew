package nopCommerceNew;

import org.openqa.selenium.By;

public class AsAGuestShopping extends Utils {
    LoadProperties loadProperties = new LoadProperties();

    private By _ifYouWAit = By.linkText("If You Wait (donation)");
    private By _addToCart = By.xpath("//input[@id=\"add-to-cart-button-35\"]");
    private By _shoppingCart = By.xpath("//span[@class=\"cart-label\"]");
    private By _termsAndCondition = By.xpath("//div[@class='terms-of-service']");
    private By _checkOut = By.xpath("//button[@class=\"button-1 checkout-button\"]");



    public void userShouldSelectTheProduct(){
        clickElement(_ifYouWAit); //click on ifyouwait digitaldownload page
        clickElement(_addToCart); //click on add to cart
        clickElement(_shoppingCart); //click on shoppingcart
        clickElement(_termsAndCondition); //click on terms and conditions
        clickElement(_checkOut);



    }



}
