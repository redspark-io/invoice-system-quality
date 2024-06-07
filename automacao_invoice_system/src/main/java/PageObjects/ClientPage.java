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

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]")
    public WebElement abrirCliente;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[1]/div/ul/div[1]/a")
    public WebElement botaoClientes;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/button")
    public WebElement botaoAdicionarCliente;


    // Mapeameto dos campos do modal de adicionar cliente
    @FindBy(how = How.NAME, using = "invoiceId")
    public WebElement campoInvoiceId;

    @FindBy(how = How.NAME, using = "name")
    public WebElement campoNomeEmperesa;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/div")
    public WebElement botaoStatusCliente;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement botaoStatusAtivo;

    @FindBy(how = How.NAME, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]")
    public WebElement botaoStatusInativo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button")
    public WebElement botaoSalvarAdicaoCliente;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarAdicaoCliente;


    // Mapeamento dos campos do modal de editar cliente
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[5]/div/button")
    public WebElement botaoEditarCliente;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[1]/div/div/input")
    public WebElement campoInvoiceIdEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[2]/div/div/input")
    public WebElement campoNomeEmpresaEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[1]/div/div[3]/div/div/div")
    public WebElement botaoStatusClienteEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[1]")
    public WebElement botaoStatusAtivoEditar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-status\"]/div[3]/ul/li[2]")
    public WebElement botaoStatusInativoEditar;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[1]/button/span[1]")
    public WebElement botaoSalvarEdicaoCliente;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/form/div[2]/div/div[2]/button")
    public WebElement botaoCancelarEdicaoCliente;
}