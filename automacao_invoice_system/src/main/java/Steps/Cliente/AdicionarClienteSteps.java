package Steps.Cliente;

import PageObjects.ClientPage;
import PageObjects.RateCardPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdicionarClienteSteps {
    public ClientPage cliente = new ClientPage(Hook.driver);;

    @Dado("Que o usuario esteja na tela de clientes")
    public void telaAdicionarCliente() throws  InterruptedException{
        cliente.botaoClientes.click();
    }

    @E("que ele clique no botão de adicionar cliente")
    public void abrirModalAddCliente(){
        cliente.botaoAdicionarCliente.click();
    }

    @E("que ele preencha todos os campos do modal de cadastro corretamente")
    public void preencherCampos(){
        cliente.campoInvoiceId.sendKeys(GeradorDados.gerarNomeAleatorio());
        cliente.campoNomeEmperesa.sendKeys(GeradorDados.gerarNomeAleatorio());
        cliente.botaoStatusCliente.click();
        cliente.botaoStatusAtivo.click();
    }

    @Entao("o sistema adiciona o novo cliente")
    public void validarEdicaoSparker() throws Exception{
        Thread.sleep(1000);
        WebElement mensagemDeSucesso = Hook.driver.findElement(By.id("notistack-snackbar"));
        if (mensagemDeSucesso.getText().equals("Perfil de cliente criado com sucesso!")) {
            System.out.println("Perfil de cliente criado com sucesso!");
        }else {
            throw new Exception("Erro ao criar perfil de cliente");
        }

    }
}
