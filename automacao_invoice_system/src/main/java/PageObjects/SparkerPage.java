package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SparkerPage {
    public SparkerPage(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(how = How.NAME, using = "sideBarMenuItem-SPARKERS")
    public WebElement botaoSparker;

    @FindBy(how = How.NAME, using = "createButton-Sparker")
    public WebElement botaoAdicionarSparker;

    @FindBy(how = How.NAME, using = "Editar")
    public WebElement botaoEditarSparker;

    @FindBy(how = How.NAME, using = "sparkerIdRh")
    public WebElement campoIdSparker;

    @FindBy(how = How.NAME, using = "name")
    public WebElement campoNomeSparker;

    @FindBy(how = How.NAME, using = "birth")
    public WebElement campoDataDeNascimentoSparker;
}
