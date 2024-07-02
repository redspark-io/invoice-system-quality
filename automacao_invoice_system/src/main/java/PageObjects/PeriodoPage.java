package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PeriodoPage {
    public PeriodoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[1]/div/ul/div[3]/a")
    public WebElement botaoPeriodo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button")
    public WebElement botaoAdicionarPeriodo;

    // modal de adicao de periodo
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div/div/input")
    public WebElement campoAnoReferencia;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")
    public WebElement campoDiasUteis;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public WebElement campoHorasUteis;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-referenceMonth\"]")
    public WebElement campoMesReferencia;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-referenceMonth\"]/div[3]/ul/li[1]")
    public WebElement campoMesReferenciaJaneiro;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/textarea")
    public WebElement campoObservacao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarAdicaoPeriodo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelaAdicaorPeriodo;

    // modal de edicao de periodo
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[6]/div/button")
    public WebElement botaoEditarPeriodo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div[1]/div/div/input")
    public WebElement campoAnoReferenciaEdicao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")
    public WebElement campoDiasUteisEdicao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    public WebElement campoHorasUteisEdicao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-referenceMonth\"]")
    public WebElement campoMesReferenciaEdicao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-referenceMonth\"]/div[3]/ul/li[2]")
    public WebElement campoMesReferenciaFevereiro;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/textarea")
    public WebElement campoObservacaoEdicao;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarEdicaoPeriodo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarEdicaoPeriodo;
}
