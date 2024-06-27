package Steps.rate_card;

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
    public RateCardPage ratecard = new RateCardPage(Hook.driver);;

    @E("que ele selecione o botão de editar um rate card cadastrado")
    public void abrirModalEditarRateCard() throws InterruptedException {
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
        ratecard.campoNumeroPropostaEditar.click();
        ratecard.campoNumeroPropostaEditar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        ratecard.campoNumeroPropostaEditar.sendKeys("54321");
    }

    @Entao("o sistema atualiza o rate card")
    public void validarEdicaoRateCard() throws Exception{
        Thread.sleep(1000);
        WebElement mensagemDeSucesso = Hook.driver.findElement(By.id("notistack-snackbar"));
        if (mensagemDeSucesso.getText().equals("Rate Card alterado com sucesso!")) {
            System.out.println("Rate Card alterado com sucesso!");
        }else {
            throw new Exception("Erro ao editar rate card");
        }

    }

}
