package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RateCardPage {
    public RateCardPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]")
    public WebElement abrirRateCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button")
    public WebElement botaoAdicionarRateCard;

    @FindBy(how = How.XPATH, using ="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr/td[6]/div/button")
    public WebElement botaoEditarRateCard;



    // Modal adicionar Rate Card
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoDescricaoRateCard;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[1]/div/input")
    public WebElement InicioVigenciaRateCard;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[2]/div/input")
    public WebElement FimVigenciaRateCard;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/input")
    public WebElement campoNumeroProposta;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-status\"]")
    public WebElement botaoStatusRateCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivoRateCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]")
    public WebElement statusInativoRateCard;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarRateCard;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarRateCard;

    //Modal editar Rate Card
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoDescricaoRateCardEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[1]/div/input")
    public WebElement InicioVigenciaRateCardEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div[2]/div/input")
    public WebElement FimVigenciaRateCardEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/input")
    public WebElement campoNumeroPropostaEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-status\"]")
    public WebElement botaoStatusRateCardEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivoRatecardEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]")
    public WebElement statusInativoRateCardEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarRateCardEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarRateCardEditar;

}



