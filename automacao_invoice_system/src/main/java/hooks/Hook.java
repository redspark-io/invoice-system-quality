package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public static void beforeAll() throws IOException {
        driver = new ChromeDriver();
        Properties props = inicializarProperties("config.properties");
        String ambiente = props.getProperty("ambiente");
        driver.get("https:" + ambiente + ".invoice.redspark.com.br/login");
    }

    @AfterAll
    public static void afterAll() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    public static Properties inicializarProperties(String nomeArquivoProperties) throws IOException {
        Properties props = new Properties();
        InputStream resource = Hook.class.getClassLoader().getResourceAsStream(nomeArquivoProperties);
        props.load(new InputStreamReader(resource, StandardCharsets.UTF_8));
        return props;
    }


}
