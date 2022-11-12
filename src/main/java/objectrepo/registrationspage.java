package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationspage extends loginpage{

    WebDriver driver;

    public registrationspage(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    WebElement titlename;

    @FindBy(id = "gender-male")
    WebElement gendermale;

    @FindBy(id = "FirstName")
    WebElement firstname;

    @FindBy(id = "LastName")
    WebElement lastname;

    @FindBy(name = "DateOfBirthDay")
    WebElement birthday;

    @FindBy(name = "DateOfBirthMonth")
    WebElement birthdaymonth;

    @FindBy(name = "DateOfBirthYear")
    WebElement birthdayyear;
    @FindBy(name = "Email")
    WebElement emailid;
    @FindBy(id = "Company")
    WebElement companyname;
    @FindBy(name = "Password")
    WebElement passwordname;
    @FindBy(name = "ConfirmPassword")
    WebElement confirmpassword;
    @FindBy(id="register-button")
    WebElement registerbutton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    WebElement capturetext;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")
    WebElement alreadyexits;
    public void Text_titlename(){
       String title= titlename.getText();
        System.out.println(title);
    }
    public void Select_gendermale(){
        gendermale.click();
    }
    public void Enter_firstname(String FIRSTNAME){
        firstname.sendKeys(FIRSTNAME);
    }
    public void Enter_lastname(String LASTNAME){
        lastname.sendKeys(LASTNAME);
    }
    public void Select_day(String BIRTHDAY) {
        Select day = new Select(birthday);
        day.selectByVisibleText(BIRTHDAY);
    }
    public void Select_month(String BIRTHMONTH){
        Select month = new Select(birthdaymonth);
        month.selectByVisibleText(BIRTHMONTH);
    }
    public void Select_year(String BIRTHYEAR){
        Select year = new Select(birthdayyear);
        year.selectByVisibleText(BIRTHYEAR);
    }
    public void Enter_emailid(String EMAILID){
        emailid.sendKeys(EMAILID);
    }
    public void Enter_companyname(String Companyname){
        companyname.sendKeys(Companyname);
    }
    public void Enter_passwordname(String PASSWORD){
        passwordname.sendKeys(PASSWORD);
    }
    public void Enter_confirmpassword(String confirmpasswordname){
        confirmpassword.sendKeys(confirmpasswordname);
    }
    public void Click_registerbutton(){
        registerbutton.click();
    }
    public  String  Capture_capturetext(){
        String actualvalue = capturetext.getText();
        return actualvalue;
    }
    public String Capturetext_alreadyexitsaccount(){
        String actualtext = alreadyexits.getText();
        return actualtext;
    }



}
