package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepo.homepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class registrationspage{
     WebDriver driver;
     homepage obj;
    @Given("User is on the registrations page")
    public void user_is_on_the_registrations_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        obj = new homepage(driver);
        obj.Click_registrationslink();
    }
    @When("Enter all the valid detail in all the field")
    public void enter_all_the_valid_detail_in_all_the_field() {
    obj.Text_titlename();
    obj.Select_gendermale();
    obj.Enter_firstname("NIKKI");
    obj.Enter_lastname("PATEL");
    obj.Select_day("14");
    obj.Select_month("March");
    obj.Select_year("1997");
    obj.Enter_emailid("test1100@gmail.com");
    obj.Enter_passwordname("jaynikki143");
    obj.Enter_confirmpassword("jaynikki143");
    obj.Click_registerbutton();
    }
    @Then("Account should created Sucessfully")
    public void account_should_created_Sucessfully() {
        String actual_msg =obj.Capture_capturetext();
        Assert.assertEquals("Your registration completed",actual_msg);

    }

     @When("User enter all details which is already registered")
     public void user_enter_all_details_which_is_already_registered() {
         obj.Text_titlename();
         obj.Select_gendermale();
         obj.Enter_firstname("NIKKI");
         obj.Enter_lastname("PATEL");
         obj.Select_day("14");
         obj.Select_month("March");
         obj.Select_year("1997");
         obj.Enter_emailid("test1200@gmail.com");
         obj.Enter_passwordname("jaynikki143");
         obj.Enter_confirmpassword("jaynikki143");
         obj.Click_registerbutton();
     }
     @Then("Account should not be created and should take me to login page.")
     public void account_should_not_be_created_and_should_take_me_to_login_page() {
         System.out.println(obj.Capturetext_alreadyexitsaccount());
     obj.Click_loginlink();

     }

 }
