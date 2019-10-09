package nopCommerceNew;

import org.openqa.selenium.By;
import org.testng.Assert;

public class UnRegisterEmailAFriend extends Utils {
    LoadProperties loadProperties = new LoadProperties();
    private By _yourEmail = By.xpath("//input[@name=\"YourEmailAddress\"]");
    private By _friendEmailAddress = By.className("friend-email");
    private By _personalMessage = By.id("PersonalMessage");
    private By _sendEmail = By.xpath("//div/input[contains(@type, 'submit')]");
    private By _actualResult = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");


    public void unRegisterEmail() {

        enterText(_yourEmail,loadProperties.getProperty("youremail"));
        enterText(_friendEmailAddress,loadProperties.getProperty("friendemail")); //input the friend email address
        enterText(_personalMessage, loadProperties.getProperty("PersonalMessage")); //Enter the personal message
        clickElement(_sendEmail); //click on send email
    }
    public void unRegisterUserReferAProductFail(){
        String expectedResult = "Only registered customers can use email a friend feature";
        String actualResult = getText(_actualResult);
        Assert.assertEquals(expectedResult,actualResult);

    }


}
