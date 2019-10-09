package nopCommerceNew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RagistrationPage ragistrationPage = new RagistrationPage();
    RegistrationResult registrationResult = new RegistrationResult();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    UnRegisterEmailAFriend unRegisterEmailAFriend = new UnRegisterEmailAFriend();
    DigitalDownLoadResult digitalDownLoadResult = new DigitalDownLoadResult();
    BuyAProduct buyAProduct = new BuyAProduct();
    ShoppingCartAssert shoppingCartAssert = new ShoppingCartAssert();
    ShoppingCartResult shoppingCartResult = new ShoppingCartResult();
    AsAGuestShopping asAGuestShopping = new AsAGuestShopping();
    CheckOutResultAssert checkOutResultAssert = new CheckOutResultAssert();



    @Test
    public void userShouldBeAbleToclickonRegister(){
        homePage.clickonregisterbutton();
        ragistrationPage.verifyUserIsOnRegistrationPage();
        ragistrationPage.userEnterTheRegistrationDetails();
        registrationResult.userIsSuccessfullyRegister();}

    @Test
    public void userShouldAbleToReferAProductToAFriend(){
        homePage.clickonregisterbutton();
        ragistrationPage.verifyUserIsOnRegistrationPage();
        ragistrationPage.userEnterTheRegistrationDetails();
        registrationResult.userIsSuccessfullyRegister();
        homePage.clickOnLogo();
        homePage.clickonAppleMacBook();
        appleMacBookPage.clickOnEmailAFriend();
        emailAFriend.referAProductToAFriend();
        emailAFriendResult.userIsAbleToreferProductSuccessfully();}
    @Test
    public void unRegisterUserShouldNotAbleToReferAProduct (){
        homePage.clickonAppleMacBook();
        appleMacBookPage.clickOnEmailAFriend();
        unRegisterEmailAFriend.unRegisterEmail();
        unRegisterEmailAFriend.unRegisterUserReferAProductFail(); }
     @Test
    public void userShoulAbleToBuyAProductSuccessfully(){
         homePage.clickonregisterbutton();
         ragistrationPage.verifyUserIsOnRegistrationPage();
         ragistrationPage.userEnterTheRegistrationDetails();
         registrationResult.userIsSuccessfullyRegister();
        homePage.clickonDigitalDownload();
        digitalDownLoadResult.digitalDownloadPage();
        buyAProduct.addToCartAndBuyAProduct();
        shoppingCartAssert.shoppingCart();
        shoppingCartAssert.userisonShippingAddresspage();
        shoppingCartAssert.clickContinueShipping();
        shoppingCartAssert.clickCreaditCard();
        shoppingCartAssert.paymentInformationDetails();
        shoppingCartAssert.clickOnConformOrder();
        shoppingCartAssert.orderComplete();
    }
        @Test
     public void userShouldAbleToBuyAProductAsAGust (){
            homePage.clickonDigitalDownload();
            digitalDownLoadResult.digitalDownloadPage();
        asAGuestShopping.userShouldSelectTheProduct();
        checkOutResultAssert.userIsOnCheckoutasaguestorregisterPage();
        checkOutResultAssert.userShouldContinueAsAGuset();
            shoppingCartAssert.userisonShippingAddresspage();
            shoppingCartAssert.clickContinueShipping();
            shoppingCartAssert.clickCreaditCard();
            shoppingCartAssert.paymentInformationDetails();
            shoppingCartAssert.clickOnConformOrder();
            shoppingCartAssert.orderComplete();
    }




         }

















