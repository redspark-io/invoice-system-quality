package Steps.Cliente;

import Steps.Tools.GeradorDados;
import hooks.Hook;
import PageObjects.ClientPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EditarClienteSteps {
    public ClientPage cliente;
    public String elementBefore;

    public WebElement PegaElemento(){
        return Hook.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[1]/td[3]"));
    }

    @E("que ele selecione o botão de editar de um cliente cadastrado")
    public void abrirModalEditar() throws InterruptedException {
        Thread.sleep(1000);
        elementBefore = PegaElemento().getText();
        cliente = new ClientPage(Hook.driver);
        cliente.botaoEditarCliente.click();
    }

    @E("que ele preencha o modal de edição de cliente com os dados necessarios")
    public void preencherModalEditar() throws Exception{
        //limpa o campo e escreve um nome aleatorio
        cliente.campoNomeEmpresaEditar.sendKeys(Keys.CONTROL + "a");
        cliente.campoNomeEmpresaEditar.sendKeys(Keys.DELETE);
        cliente.campoNomeEmpresaEditar.sendKeys("teste");

        //limpa o campo e escreve um nome aleatorio
        cliente.campoInvoiceIdEditar.sendKeys(Keys.CONTROL + "a");
        cliente.campoInvoiceIdEditar.sendKeys(Keys.DELETE);
        cliente.campoInvoiceIdEditar.sendKeys(GeradorDados.gerarNomeAleatorio());

        //muda o status do cliente
        cliente.botaoStatusClienteEditar.click();
        cliente.botaoStatusInativoEditar.click();


    }
    @Entao("o sistema salva a edicao do cliente")
    public void VerificaEdicao() throws Exception {
        Thread.sleep(2000);
        WebElement elementAfter = Hook.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr[5]/td[3]"));
        String ElementAfter = elementAfter.getText();

        if (ElementAfter.equals(elementBefore)){
            throw new Exception("Erro ao editar");
        } else {
            System.out.println("Cliente editado com sucesso");
        }
    }



}
