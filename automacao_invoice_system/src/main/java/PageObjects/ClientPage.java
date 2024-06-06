package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
    public ClientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]")
    public WebElement abrirCliente;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[1]/div/ul/div[1]/a")
    public WebElement botaoClientes;
}