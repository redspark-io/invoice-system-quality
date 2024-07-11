package Steps.rate_card;

import PageObjects.CommomPages;
import PageObjects.RateCardPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditarRateCardSteps {
    public RateCardPage ratecard = new RateCardPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que ele selecione o botão de editar um rate card cadastrado")
    public void abrirModalEditarRateCard() throws InterruptedException {
        Thread.sleep(2000);
        ratecard.botaoEditarRateCard.click();
    }

    @E("que o usuário preencher o modal de edição com os campos necessários")
    public void preencherModalEditarRateCard(){
        ratecard.campoDescricaoRateCard.click();
        ratecard.campoDescricaoRateCard.sendKeys(Keys.CONTROL + "a");
        ratecard.campoDescricaoRateCard.sendKeys(Keys.DELETE);
        ratecard.campoDescricaoRateCard.sendKeys(GeradorDados.gerarNomeAleatorio(10));
        ratecard.InicioVigenciaRateCard.click();
        ratecard.InicioVigenciaRateCard.sendKeys("02022024");
        ratecard.FimVigenciaRateCard.click();
        ratecard.FimVigenciaRateCard.sendKeys("02022025");
        ratecard.campoNumeroProposta.click();
        ratecard.campoNumeroProposta.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        ratecard.campoNumeroProposta.sendKeys("54321");
    }

    @Entao("o sistema atualiza o rate card")
    public void validarEdicaoRateCard() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Rate Card alterado com sucesso!")) {
            System.out.println("Rate Card alterado com sucesso!");
        }else {
            throw new Exception("Erro ao editar rate card");
        }

    }

}
