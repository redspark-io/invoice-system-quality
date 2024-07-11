package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.get("https://dev.invoice.redspark.com.br/");
//      driver.get("http://localhost:3000/initial-page");
    }

    @AfterAll
    public static void afterAll() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }


}
