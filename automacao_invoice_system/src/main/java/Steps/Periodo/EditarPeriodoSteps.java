package Steps.Periodo;

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

    @E("que ele clique no botão editar de um periodo cadastrado")
    public void abrirModalEdicao() throws InterruptedException {
        Thread.sleep(1000);
        periodo.botaoEditarPeriodo.click();
    }

    @E("que ele preencha o modal de edição de periodo com os dados corretos")
    public void preencherModalEdicao(){
        periodo.campoAnoReferenciaEdicao.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoAnoReferenciaEdicao.sendKeys(GeradorDados.gerarAnoAleatorio());

        periodo.campoMesReferenciaEdicao.click();
        periodo.campoMesReferenciaFevereiro.click();

        periodo.campoHorasUteisEdicao.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoHorasUteisEdicao.sendKeys("210");

        periodo.campoDiasUteisEdicao.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoDiasUteisEdicao.sendKeys("30");

        periodo.campoObservacaoEdicao.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        periodo.campoObservacaoEdicao.sendKeys("Periodo editado automação ");
    }

    @Entao("o sistema atualiza o periodo")
    public void verificaEdicaoPeriodo() throws Exception {
        Thread.sleep(1000);
        WebElement mensagemDeSucesso = Hook.driver.findElement(By.id("notistack-snackbar"));
        if (mensagemDeSucesso.getText().equals("Período alterado com sucesso!")) {
            System.out.println("Período alterado com sucesso!");
        }else {
            throw new Exception("Erro ao editar Periodo");
        }
    }
}