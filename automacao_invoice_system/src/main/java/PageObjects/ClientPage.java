package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
    public ClientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "rowIndex-0")
    public WebElement abrirCliente;

    @FindBy(how = How.NAME, using = "sideBarMenuItem-CLIENTS")
    public WebElement botaoClientes;

    @FindBy(how = How.NAME, using = "createButton-Clientes")
    public WebElement botaoAdicionarCliente;

    @FindBy(how = How.NAME, using = "Editar")
    public WebElement botaoEditarCliente;


    // Mapeameto dos campos do modal de adicionar cliente
    @FindBy(how = How.NAME, using = "nickname")
    public WebElement campoInvoiceId;

    @FindBy(how = How.NAME, using = "name")
    public WebElement campoNomeEmperesa;

    @FindBy(how = How.NAME, using = "status")
    public WebElement botaoStatusCliente;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement botaoStatusAtivo;

    @FindBy(how = How.NAME, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]")
    public WebElement botaoStatusInativo;

    @FindBy(how = How.NAME, using = "modalDialog-saveButton")
    public WebElement botaoSalvarAdicaoCliente;

    @FindBy(how = How.NAME, using = "modalDialog-cancelButton")
    public WebElement botaoCancelarAdicaoCliente;

}