package nopCommerceNew;

import org.openqa.selenium.By;

public class AppleMacBookPage extends HomePage {

    //  LoadProperties loadProperties = new LoadProperties();

    private By _emailToFriend = By.xpath("//div[@class=\"email-a-friend\"]");

    public void clickOnEmailAFriend(){
        clickElement(_emailToFriend);
    }
}
