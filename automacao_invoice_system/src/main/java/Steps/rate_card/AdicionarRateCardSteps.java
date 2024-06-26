package Steps.rate_card;

import PageObjects.RateCardPage;
import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class AdicionarRateCardSteps {
    public ClientPage cliente;
    public ProjectPage projeto;
    public RateCardPage ratecard;

    @Dado("que o usuário esteja na tela de Rate Cards")
    public void abrirTelaRateCard() throws InterruptedException {
        cliente = new ClientPage(Hook.driver);
        projeto = new ProjectPage(Hook.driver);
        ratecard = new RateCardPage(Hook.driver);

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
        ratecard.botaoStatusRateCard.click();
    }


}
