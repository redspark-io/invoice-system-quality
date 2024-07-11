package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    public ProjectPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.NAME, using = "rowIndex-0")
    public WebElement abrirProjeto;

    @FindBy(how = How.NAME, using = "createButton-Projects")
    public WebElement botaoAdicionarProjeto;

    @FindBy(how = How.NAME, using = "Editar")
    public WebElement botaoEditarProjeto;


    //Page objects do modal de projeto
    @FindBy(how = How.NAME, using = "name")
    public WebElement campoNomeProjeto;

    @FindBy(how = How.XPATH, using = "status")
    public WebElement botaoStatusProjeto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement statusAtivo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]/div/span")
    public WebElement statusInativo;


}