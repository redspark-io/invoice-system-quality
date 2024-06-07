package Steps.Cliente;

import hooks.Hook;
import PageObjects.ClientPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.Keys;

import java.security.Key;

public class EditarClienteSteps {
    public ClientPage cliente;

    @E("que ele selecione o botão de editar de um cliente cadastrado")
    public void abrirModalEditar() throws InterruptedException {
        Thread.sleep(1000);
        cliente = new ClientPage(Hook.driver);
        cliente.botaoEditarCliente.click();
    }

    @Quando("ele preencher o modal de edição de cliente com os dados necessarios")
    public void preencherModalEditar() {
        //limpa o campo e escreve um nome aleatorio
        cliente.campoNomeEmpresaEditar.sendKeys(Keys.CONTROL + "a");
        cliente.campoNomeEmpresaEditar.sendKeys(Keys.DELETE);
        cliente.campoNomeEmpresaEditar.sendKeys(Hook.gerarNomeAleatorio());

        //limpa o campo e escreve um nome aleatorio
        cliente.campoInvoiceIdEditar.sendKeys(Keys.CONTROL + "a");
        cliente.campoInvoiceIdEditar.sendKeys(Keys.DELETE);
        cliente.campoInvoiceIdEditar.sendKeys(Hook.gerarNomeAleatorio());

        //muda o status do cliente
        cliente.botaoStatusClienteEditar.click();
        cliente.botaoStatusInativoEditar.click();
    }

    @E("clicar em salvar a edição")
    public void salvarEdicao(){
        cliente.botaoSalvarEdicaoCliente.click();
    }

}
