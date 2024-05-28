import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class Selenium {

    public static WebDriver driver;
    @Test
    public void helloIqbal() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://jayjay.co/");
        Thread.sleep(1000);
        driver.navigate().to("https://selenium.dev");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.quit();
        System.out.println("Test Selenium Success");
    }
}
