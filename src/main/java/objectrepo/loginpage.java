package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
    WebDriver driver;

    public loginpage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="Email")
    WebElement useremail;
    @FindBy(name = "Password")
    WebElement userpwd;
    @FindBy(id = "RememberMe")
    WebElement remeberemailid;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement loginbutton;


    public void Enter_useremail(String USEREMAILID){
        useremail.sendKeys(USEREMAILID);
    }
    public  void Enter_userpwd(String USERPASSWORD){
        userpwd.sendKeys((USERPASSWORD));
    }

    public void Tick_remeberemailid(){
        remeberemailid.click();
    }
    public void Click_loginbutton(){
        loginbutton.click();
    }


}
