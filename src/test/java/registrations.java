import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepo.homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class registrations {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        homepage obj = new homepage(driver);
        /*obj.Click_registrationslink();
        obj.Text_titlename();
        obj.Select_gendermale();
        obj.Enter_firstname();
        obj.Enter_lastname();
        obj.Select_day();
        obj.Select_month();
        obj.Select_year();
        obj.Enter_emailid();
        obj.Enter_companyname("keyaaanjay");
        obj.Enter_passwordname();
        obj.Enter_confirmpassword("jaynikki143");
        obj.Click_loginlink();
        obj.Enter_emailid();
        obj.Enter_passwordname();
        obj.Tick_remeberemailid();*/



    }

}
