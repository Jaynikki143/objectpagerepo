package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends registrationspage {
    WebDriver driver;

    public homepage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Register")
    WebElement registrationslink;

    @FindBy(linkText = "Log in")
    WebElement loginlink;

    @FindBy(className = "ico-wishlist")
    WebElement wishlistlink;

    public void Click_registrationslink(){
        registrationslink.click();
    }

    public void  Click_loginlink(){
        loginlink.click();
    }

    public void  Click_wishlistlink(){
        wishlistlink.click();
    }



}
