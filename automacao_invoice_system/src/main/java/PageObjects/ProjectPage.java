package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    public ProjectPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[1]")
    public WebElement abrirProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button/span[1]")
    public WebElement botaoAdicionarProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/div/button")
    public WebElement botaoEditarProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]/div/div/button[2]")
    public WebElement botaoVerificarProjeto;


    //Page objects do modal de adicionar projeto
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoNomeProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-status\"]")
    public WebElement botaoStatusProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]/div/span")
    public WebElement statusInativo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button/span[1]")
    public WebElement botaoSalvarProjeto;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarProjeto;

    // Page objects do modal de editar projeto
    @FindBy(how = How.NAME, using = "name")
    public WebElement campoNomeProjetoEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mui-component-select-status\"]")
    public WebElement botaoStatusProjetoeditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivoEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]/div/span")
    public WebElement statusInativoEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button/span[1]")
    public WebElement botaoSalvarProjetoEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarProjetoEditar;
}