package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FuncaoPage {
    public FuncaoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "createButton-ItemRateCard")
    public WebElement botaoAdicionarFuncao;

    @FindBy(how = How.NAME, using = "Editar")
    public WebElement botaoEditarFuncao;

    //modal adicionar funcao
    @FindBy(how = How.NAME, using = "functionName")
    public WebElement campoNomeFuncao;

    @FindBy(how = How.ID, using = "mui-component-select-profile")
    public WebElement abrirPerfil;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-profile\"]/div[3]/ul/li[2]/div/span")
    public WebElement perfilPleno;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-profile\"]/div[3]/ul/li[3]")
    public WebElement perfilSenior;

    @FindBy(how = How.NAME, using = "hourPrice")
    public WebElement campoValorHora;

    @FindBy(how = How.NAME, using = "alocation")
    public WebElement campoAlocacao;
}
