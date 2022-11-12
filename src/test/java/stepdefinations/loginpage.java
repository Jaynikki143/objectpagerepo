package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepo.homepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
    WebDriver driver;
    homepage obj;
    @Given("User is on the login {string} page")
    public void user_is_on_the_login_page(String arg0) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(arg0);
        driver.manage().window().maximize();
        obj = new homepage(driver);
        obj.Click_loginlink();

    }
    @When("Enter username {string} and password {string}")
    public void enter_username_and_password(String string, String string2) {
       obj.Enter_useremail(string);
       obj.Enter_userpwd(string2);
       obj.Click_loginbutton();
    }


    @Then("Should login sucessfully")
    public void shouldLoginSucessfully() {
        System.out.println("jay123");
    }
}
