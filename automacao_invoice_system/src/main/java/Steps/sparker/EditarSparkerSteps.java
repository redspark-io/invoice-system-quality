package Steps.sparker;

import PageObjects.CommomPages;
import PageObjects.SparkerPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditarSparkerSteps {
    public SparkerPage sparker = new SparkerPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que o usuario clique no botao de editar sparker")
    public void abrirModalEditarSparker() throws InterruptedException{
        Thread.sleep(2000);
        sparker.botaoEditarSparker.click();
    }

    @E("que o usuário preencha o modal de edição com os dados corretos")
    public void preenhcerEdicaoSparker() {
        sparker.campoNomeSparker.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        sparker.campoNomeSparker.sendKeys(GeradorDados.gerarNomeAleatorio());
        sparker.campoIdSparker.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        sparker.campoIdSparker.sendKeys(GeradorDados.gerarIdAleatorio());
        sparker.campoDataDeNascimentoSparker.sendKeys("01012005");
    }

    @Entao("o sistema atualiza sparker com os dados informados")
    public void validarEdicaoSparker() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Sparker alterado com sucesso!")) {
           System.out.println("Sparker alterado com sucesso!");
        }else {
            throw new Exception("Erro ao alterar sparker");
       }

    }

}
