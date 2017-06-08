
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by doomcat on 6/8/17.
 */
public class Main {
    public static void main(String[] args){

        System.setProperty("webdriver.firefox.marionette","/usr/bin/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        driver.quit();
    }
}