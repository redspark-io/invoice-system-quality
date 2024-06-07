package Steps.Cliente;

import PageObjects.ClientPage;
import hooks.Hook;
import Steps.CommonSteps.CommonSteps;
import io.cucumber.java.ca.Quan;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class AdicionarClienteSteps {
    public ClientPage cliente;

    @Dado("Que o usuario esteja na tela de clientes")
    public void telaAdicionarCliente(){
        cliente = new ClientPage(Hook.driver);
        cliente.botaoClientes.click();
    }

    @E("que ele clique no botão de adicionar cliente")
    public void abrirModalAddCliente(){
        cliente.botaoAdicionarCliente.click();
    }

    @Quando("ele preencher todos os campos do modal de cadastro corretamente")
    public void preencherCampos(){
        cliente.campoInvoiceId.sendKeys(Hook.gerarNomeAleatorio());
        cliente.campoNomeEmperesa.sendKeys(Hook.gerarNomeAleatorio());
        cliente.botaoStatusCliente.click();
        cliente.botaoStatusAtivo.click();
    }


}
