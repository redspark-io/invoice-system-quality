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

    @FindBy(how = How.NAME, using = "sideBarMenuItem-PERIOD")
    public WebElement botaoPeriodo;

    @FindBy(how = How.NAME, using = "createButton-Period")
    public WebElement botaoAdicionarPeriodo;

    @FindBy(how = How.NAME, using = "Editar")
    public WebElement botaoEditarPeriodo;


    @FindBy(how = How.NAME, using = "referenceYear")
    public WebElement campoAnoReferencia;

    @FindBy(how = How.NAME, using = "utilDays")
    public WebElement campoDiasUteis;

    @FindBy(how = How.NAME, using = "utilHours")
    public WebElement campoHorasUteis;

    @FindBy(how = How.ID, using = "mui-component-select-referenceMonth")
    public WebElement campoMesReferencia;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-referenceMonth\"]/div[3]/ul/li[1]")
    public WebElement campoMesReferenciaJaneiro;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-referenceMonth\"]/div[3]/ul/li[2]")
    public WebElement campoMesReferenciaFevereiro;

    @FindBy(how = How.NAME, using = "observations")
    public WebElement campoObservacao;

}
