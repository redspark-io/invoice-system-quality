package Steps.Periodo;

import PageObjects.CommomPages;
import PageObjects.PeriodoPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditarPeriodoSteps {
    public PeriodoPage periodo = new PeriodoPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que ele clique no botão editar de um periodo cadastrado")
    public void abrirModalEdicao() throws InterruptedException {
        Thread.sleep(1000);
        periodo.botaoEditarPeriodo.click();
    }

    @E("que ele preencha o modal de edição de periodo com os dados corretos")
    public void preencherModalEdicao(){
        periodo.campoAnoReferencia.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoAnoReferencia.sendKeys(GeradorDados.gerarAnoAleatorio());

        periodo.campoMesReferencia.click();
        periodo.campoMesReferencia.click();

        periodo.campoHorasUteis.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoHorasUteis.sendKeys("210");

        periodo.campoDiasUteis.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoDiasUteis.sendKeys("30");

        periodo.campoObservacao.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoObservacao.sendKeys("Periodo editado automação ");
    }

    @Entao("o sistema atualiza o periodo")
    public void verificaEdicaoPeriodo() throws Exception {
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Período alterado com sucesso!")) {
            System.out.println("Período alterado com sucesso!");
        }else {
            throw new Exception("Erro ao editar Periodo");
        }
    }
}
