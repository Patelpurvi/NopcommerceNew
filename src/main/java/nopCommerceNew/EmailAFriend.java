package nopCommerceNew;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    private By _friendEmailAddress = By.className("friend-email");
    private By _personalMessage = By.id("PersonalMessage");
    private By _sendEmail = By.xpath("//div/input[contains(@type, 'submit')]");

    public void referAProductToAFriend() {

       enterText(_friendEmailAddress,loadProperties.getProperty("friendemail")); //input the friend email address
        enterText(_personalMessage, loadProperties.getProperty("PersonalMessage")); //Enter the personal message
        clickElement(_sendEmail); //click on send email
    }



}
