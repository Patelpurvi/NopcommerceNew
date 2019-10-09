package nopCommerceNew;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    private By _register = By.xpath("//a[@href=\"/register?returnUrl=%2F\"]");
     private By _logo = By.xpath("//img[@alt=\"nopCommerce demo store\"]");
     private By _$25VirtualGiftCard = By.linkText("$25 Virtual Gift Card");
     private By _computer = By.linkText("Computers");
     private By _electronics = By.linkText("Electronics");
     private By _apparel = By.linkText("Apparel");
     private By _digitaldownloads = By.linkText("Digital downloads");
     private By _books = By.linkText("Books");
     private By _jewelry = By.linkText("Jewelry");
     private By _giftCards = By.linkText("Gift Cards");
     private By _appleMacBook = By.linkText("Apple MacBook Pro 13-inch");




    public void clickonregisterbutton () {
        clickElement(_register); //click on register
    }
    public void clickOnLogo (){
        clickElement(_logo);//click on logo
    }
     public void clickon$25VirtualGiftCard (){
        clickElement(_$25VirtualGiftCard);
     }   public void clickonComputer () {
            clickElement(_computer);//click on computer
        }
        public void clickonElectronics(){
        clickElement(_electronics);//click on electronics
    }
        public void clickonApparel(){
        clickElement(_apparel); //click on apparel
    }
        public void clickonDigitalDownload (){
        clickElement(_digitaldownloads); //click on digital download
    }
        public void clickonBooks(){
        clickElement(_books); //click on books
            }
        public void clickonJewelry (){
        clickElement(_jewelry); // click on jewelery
             }
        public void clickonGiftCards (){
        clickElement(_giftCards);//click on gift cards
             }
         public void clickonAppleMacBook(){
        clickElement(_appleMacBook); //click on mac book
         }
}

