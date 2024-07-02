package Steps.Periodo;

import PageObjects.CommomPages;
import PageObjects.PeriodoPage;
import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import Steps.Tools.GeradorDados;
import io.cucumber.java.pt.Entao;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdicionarPeriodoSteps {
    public PeriodoPage periodo = new PeriodoPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @Dado("que o usuário esteja na tela de periodo")
    public void abrirTelaPeriodo(){
        periodo.botaoPeriodo.click();
    }

    @E("que ele clique em adicionar periodo")
    public void abrirModalAdicaoPeriodo(){
        periodo.botaoAdicionarPeriodo.click();
    }

    @E("que ele preencha os campos obrigatórios do modal")
    public void preencherModalAdicaoPeriodo(){
        periodo.campoAnoReferencia.sendKeys(GeradorDados.gerarAnoAleatorio());
        periodo.campoMesReferencia.click();
        periodo.campoMesReferenciaJaneiro.click();
        periodo.campoDiasUteis.sendKeys("30");
        periodo.campoHorasUteis.sendKeys("210");
        periodo.campoObservacao.sendKeys("Periodo de teste");
    }

    @Entao("o sistema cadastra um novo periodo")
    public void verificaAdicaoPeriodo() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Período criado com sucesso!")) {
            System.out.println("Período criado com sucesso!");
        }else {
            throw new Exception("Erro ao criar Periodo");
        }
    }
}
