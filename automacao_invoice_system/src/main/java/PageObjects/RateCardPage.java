package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RateCardPage {
    public RateCardPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.NAME, using = "rowIndex-0")
    public WebElement abrirRateCard;

    @FindBy(how = How.NAME, using = "createButton-RateCard")
    public WebElement botaoAdicionarRateCard;

    @FindBy(how = How.NAME, using ="Editar")
    public WebElement botaoEditarRateCard;


    // Modal Rate Card
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoDescricaoRateCard;

    @FindBy(how = How.NAME, using = "startPeriod")
    public WebElement InicioVigenciaRateCard;

    @FindBy(how = How.NAME, using = "endPeriod")
    public WebElement FimVigenciaRateCard;

    @FindBy(how = How.NAME, using = "proposalNumber")
    public WebElement campoNumeroProposta;

    @FindBy(how = How.NAME, using = "status")
    public WebElement botaoStatusRateCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivoRateCard;
}



