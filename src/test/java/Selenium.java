import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;



public class Selenium {
    @Test
    public void helloIqbal(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/");

    }
}
