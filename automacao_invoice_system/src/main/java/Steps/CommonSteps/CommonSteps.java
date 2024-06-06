package Steps.CommonSteps;

import PageObjects.ProjectPage;
import hooks.Hook;
import io.cucumber.java.pt.E;

public class CommonSteps {
    public ProjectPage projeto;

    @E("clicar em salvar {string}")
    public void salvar(String tipo) throws Exception {
        projeto = new ProjectPage(Hook.driver);
        if (tipo.equals("edição")) {
            projeto.botaoSalvarProjetoEditar.click();
        } else if (tipo.equals("adição")) {
            projeto.botaoSalvarProjeto.click();
        }
    }
}
