import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by thapa on 8/6/2017.
 */
public class Executor {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","F:\\LeapFrog\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

    }
}
