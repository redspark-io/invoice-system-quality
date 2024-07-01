package Steps.rate_card;

import PageObjects.CommomPages;
import PageObjects.RateCardPage;
import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AdicionarRateCardSteps {
    public ClientPage cliente = new ClientPage(Hook.driver);;
    public ProjectPage projeto = new ProjectPage(Hook.driver);
    public RateCardPage ratecard = new RateCardPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @Dado("que o usuário esteja na tela de Rate Cards")
    public void abrirTelaRateCard() throws InterruptedException {
        cliente.botaoClientes.click();
        Thread.sleep(2000);
        cliente.abrirCliente.click();
        Thread.sleep(1000);
        projeto.abrirProjeto.click();
    }

    @E("que o usuário clique no botão de adicionar rate card")
    public void abrirModalRateCard(){
        ratecard.botaoAdicionarRateCard.click();
    }

    @E("que o usuário preencha todos os campos do modal de cadastro corretamente")
    public void preencherModalRateCard() throws InterruptedException{
        ratecard.campoDescricaoRateCard.sendKeys(GeradorDados.gerarNomeAleatorio());
        ratecard.InicioVigenciaRateCard.click();
        ratecard.InicioVigenciaRateCard.sendKeys("01012024");
        Thread.sleep(1000);
        ratecard.FimVigenciaRateCard.click();
        ratecard.FimVigenciaRateCard.sendKeys("01012025");
        ratecard.campoNumeroProposta.sendKeys("12345");
    }

    @Entao("o sistema adiciona um novo rate card")
    public void validarEdicaoRateCard() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Rate Card criado com sucesso!")) {
            System.out.println("Rate Card criado com sucesso!");
        }else {
            throw new Exception("Erro ao criar rate card");
        }

    }

}
