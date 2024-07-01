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

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button")
    public WebElement botaoAdicionarFuncao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/button")
    public WebElement botaoEditarFuncao;

    //modal adicionar funcao
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoNomeFuncao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-profile\"]")
    public WebElement abrirPerfil;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-profile\"]/div[3]/ul/li[2]/div/span")
    public WebElement perfilPleno;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div[1]/div/div/input")
    public WebElement campoValorHora;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div[2]/div/div/input")
    public WebElement campoAlocacao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarAdicaoFuncao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarAdicaoFuncao;

    //modal editar funcao
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoNomeFuncaoEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-profile\"]")
    public WebElement abrirPerfilEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-profile\"]/div[3]/ul/li[3]")
    public WebElement perfilSeniorEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div[1]/div/div/input")
    public WebElement campoValorHoraEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div[2]/div/div/input")
    public WebElement campoAlocacaoEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarEdicaoFuncao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarEdicaoFuncao;
}
