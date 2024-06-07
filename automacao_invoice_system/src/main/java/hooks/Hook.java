package hooks;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
    }
//    @AfterAll
//    public static void afterAll(){
//        driver.quit();
//    }


    //Gerador de Nome aleatório
    public static String gerarNomeAleatorio() {
        String[] letras = {"a", "b", "c", "d", "1", "2", "3", "4", "R", "r", "x"};
        String nomeFinal = "Automação ";

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int pos = random.nextInt(letras.length);
            nomeFinal = nomeFinal.concat(letras[pos]);
        }
        return nomeFinal;
    }
}
