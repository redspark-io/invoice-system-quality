package Steps.rate_card;

import PageObjects.RateCardPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.sl.In;
import org.openqa.selenium.Keys;



public class EditarRateCardSteps {
    public RateCardPage ratecard;

    @E("que ele selecione o botão de editar um rate card cadastrado")
    public void abrirModalEditarRateCard() throws InterruptedException {
        ratecard = new RateCardPage(Hook.driver);

        Thread.sleep(2000);
        ratecard.botaoEditarRateCard.click();
    }

    @E("que o usuário preencher o modal de edição com os campos necessários")
    public void preencherModalEditarRateCard(){
        ratecard.campoDescricaoRateCardEditar.click();
        ratecard.campoDescricaoRateCardEditar.sendKeys(Keys.CONTROL + "a");
        ratecard.campoDescricaoRateCardEditar.sendKeys(Keys.DELETE);
        ratecard.campoDescricaoRateCardEditar.sendKeys(GeradorDados.gerarNomeAleatorio());
        ratecard.InicioVigenciaRateCardEditar.click();
        ratecard.InicioVigenciaRateCardEditar.sendKeys("02022024");
        ratecard.FimVigenciaRateCardEditar.click();
        ratecard.FimVigenciaRateCardEditar.sendKeys("02022025");
        ratecard.campoNumeroPropostaEditar.sendKeys("54321");
        ratecard.botaoStatusRateCardEditar.click();
        ratecard.statusInativoRateCardEditar.click();
    }

}
