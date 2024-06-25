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


import java.util.List;

public class AdicionarClienteSteps {
    public ClientPage cliente;
    public RateCardPage rateCard;

    public List<WebElement> elementsBefore() throws InterruptedException{
        Thread.sleep(2000);
        return Hook.driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr"));
    }

    @Dado("Que o usuario esteja na tela de clientes")
    public void telaAdicionarCliente() throws  InterruptedException{
        cliente = new ClientPage(Hook.driver);
        rateCard = new RateCardPage(Hook.driver);
        cliente.botaoClientes.click();
        elementsBefore();
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
    public void VerificaTeste() throws Exception {
        Thread.sleep(2000);
        List<WebElement> elementsAfter = Hook.driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr"));
        System.out.println(elementsBefore().size());
        System.out.println(elementsAfter.size());
            if (elementsAfter.size() < elementsBefore().size()) {
                throw new Exception("Cliente não foi adicionado");
            }else{
                System.out.println("Cliente adicionado com sucesso");
            }
    }
}
