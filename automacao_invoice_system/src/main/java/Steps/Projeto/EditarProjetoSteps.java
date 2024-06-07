package Steps.Projeto;

import PageObjects.ProjectPage;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.Keys;

import static hooks.Hook.gerarNomeAleatorio;

public class EditarProjetoSteps {
    public ProjectPage projeto;


    @E("que ele selecione o botão de editar")
    public void selecionaEditar() throws InterruptedException {
        projeto = new ProjectPage(Hook.driver);
        Thread.sleep(1000);
        projeto.botaoEditarProjeto.click();
    }

    @Quando("ele preencher o modal de edição com os dados necessarios")
    public void preenhcerModal() throws InterruptedException {
        projeto.campoNomeProjetoEditar.sendKeys(Keys.CONTROL + "a");
        projeto.campoNomeProjetoEditar.sendKeys(Keys.DELETE);
        projeto.campoNomeProjetoEditar.sendKeys(gerarNomeAleatorio());

    }

}
