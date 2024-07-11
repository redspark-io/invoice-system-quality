package Steps.sparker;

import PageObjects.CommomPages;
import PageObjects.SparkerPage;
import hooks.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import Steps.Tools.GeradorDados;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdicionarSparkerSteps {
    public SparkerPage sparker = new SparkerPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que o usuário esteja na tela de sparker")
    public void telaSparker() throws InterruptedException {
        Thread.sleep(2000);
        sparker.botaoSparker.click();
    }

    @E("que ele clique no botao de adicionar sparker")
    public void abrirModalAddSparker() {
        sparker.botaoAdicionarSparker.click();
    }

    @E("que ele preenhca o modal de adição corretamente")
    public void preencherModalAdicionarSparker() {
        sparker.campoIdSparker.sendKeys(GeradorDados.gerarIdAleatorio());
        sparker.campoNomeSparker.sendKeys(GeradorDados.gerarNomeAleatorio());
        sparker.campoDataDeNascimentoSparker.sendKeys("01012006");
    }

    @Entao("o sistema realiza o cadastro do novo sparker")
    public void validarEdicaoSparker() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Sparker criado com sucesso!")) {
            System.out.println("Sparker criado com sucesso!");
        }else {
            throw new Exception("Erro ao criar sparker");
        }

    }
}
