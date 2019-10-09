package nopCommerceNew;

import org.openqa.selenium.By;

public class RagistrationPage extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@name ='LastName']");
    private By _Date = By.xpath("//select[@name=\'DateOfBirthDay']");
    private By _Month = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _Year = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.name("Email");
    private By _password = By.xpath("//input[contains(@name, 'Password')]");
    private By _confoirmpassword = By.name("ConfirmPassword");
    private By _registerButton = By.id("register-button");
   // private By _continue = By.xpath("//input[@class=\"button-1 register-continue-button\"]");


    //private static String timestamp = randomDate();

    public void verifyUserIsOnRegistrationPage(){
        assertUrl("register");
    }

    public void userEnterTheRegistrationDetails() {
        enterText(_firstName, loadProperties.getProperty("FirstName"));   //enter the first name
        enterText(_lastName, loadProperties.getProperty("LastName"));//enter the lastname
        selectByValue(_Date, loadProperties.getProperty("Date")); //select the Date
        selectByValue(_Month, loadProperties.getProperty("Month"));//select the Month
        selectByValue(_Year, loadProperties.getProperty("Year"));// select the year
        enterText(_email, "testtest" + randomDate() + "@test56.com");//Enter Email
        enterText(_password, loadProperties.getProperty("Password"));//enter the password
        enterText(_confoirmpassword, loadProperties.getProperty("ConformPassword")); //enter the confirm password
        clickElement(_registerButton);//click on Register
       // clickElement(_continue); //click on continue

    }



}
