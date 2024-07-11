package Steps.Cliente;

import PageObjects.CommomPages;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import PageObjects.ClientPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EditarClienteSteps {
    public ClientPage cliente= new ClientPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que ele selecione o botão de editar de um cliente cadastrado")
    public void abrirModalEditar() throws InterruptedException {
        Thread.sleep(2000);
        cliente.botaoEditarCliente.click();
    }

    @E("que ele preencha o modal de edição de cliente com os dados necessarios")
    public void preencherModalEditar() throws Exception{
        //limpa o campo e escreve um nome aleatorio
        cliente.campoNomeEmperesa.sendKeys(Keys.CONTROL + "a");
        cliente.campoNomeEmperesa.sendKeys(Keys.DELETE);
        cliente.campoNomeEmperesa.sendKeys(GeradorDados.gerarNomeAleatorio(10));

        //limpa o campo e escreve um nome aleatorio
        cliente.campoInvoiceId.sendKeys(Keys.CONTROL + "a");
        cliente.campoInvoiceId.sendKeys(Keys.DELETE);
        cliente.campoInvoiceId.sendKeys(GeradorDados.gerarNomeAleatorio(10));
    }
    @Entao("o sistema salva a edicao do cliente")
    public void validarEdicaoSparker() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Perfil de cliente alterado com sucesso!")) {
            System.out.println("Perfil de cliente alterado com sucesso!");
        }else {
            throw new Exception("Erro ao editar perfil de cliente");
        }

    }



}
