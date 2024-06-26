package PageObjects;

import io.cucumber.java.ja.且つ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SparkerPage {
    public SparkerPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[1]/div/ul/div[6]/a")
    public WebElement botaoSparker;

    // adição de sparker
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button")
    public WebElement botaoAdicionarSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoIdSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div/input")
    public WebElement campoNomeSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/input")
    public WebElement campoDataDeNascimentoSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarAdicaoSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarAdicaoSparker;

    // edição de sparker
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[6]/td[4]/div/button")
    public WebElement botaoEditarSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoIdSparkerEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div/input")
    public WebElement getCampoNomeSparkerEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/input")
    public WebElement campoDataDeNascimentoSparkerEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarEdicaoSparker;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement getBotaoCancelarEdicaoSparker;
}
