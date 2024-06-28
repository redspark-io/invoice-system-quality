package Steps.sparker;

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

    @E("que o usuario clique no botao de editar sparker")
    public void abrirModalEditarSparker() throws InterruptedException{
        Thread.sleep(2000);
        sparker.botaoEditarSparker.click();
    }

    @E("que o usuário preencha o modal de edição com os dados corretos")
    public void preenhcerEdicaoSparker() {
        sparker.campoNomeSparker.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        sparker.campoNomeSparker.sendKeys(GeradorDados.gerarNomeAleatorio());
        sparker.campoIdSparkerEditar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        sparker.campoIdSparkerEditar.sendKeys(GeradorDados.gerarIdAleatorio());
        sparker.campoDataDeNascimentoSparker.sendKeys("01012005");
    }

    @Entao("o sistema atualiza sparker com os dados informados")
    public void validarEdicaoSparker() throws Exception{
        Thread.sleep(1000);
        WebElement mensagemDeSucesso = Hook.driver.findElement(By.id("notistack-snackbar"));
        if (mensagemDeSucesso.getText().equals("Sparker alterado com sucesso!")) {
           System.out.println("Sparker alterado com sucesso!");
        }else {
            throw new Exception("Erro ao alterar sparker");
       }

    }

}
