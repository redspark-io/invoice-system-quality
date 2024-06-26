package Steps.CommonSteps;

import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import PageObjects.RateCardPage;
import PageObjects.SparkerPage;
import hooks.Hook;
import io.cucumber.java.pt.Quando;

public class CommonSteps {
    public ProjectPage projeto;
    public ClientPage cliente;
    public RateCardPage ratecard;
    public SparkerPage sparker;

    @Quando("clicar em salvar {string}")
    public void salvar(String tipo) throws Exception {
        projeto = new ProjectPage(Hook.driver);
        cliente = new ClientPage(Hook.driver);
        ratecard = new RateCardPage(Hook.driver);
        sparker = new SparkerPage(Hook.driver);

        if (tipo.equals("edição de projeto")) {
            projeto.botaoSalvarProjetoEditar.click();
        } else if (tipo.equals("adição de projeto")) {
            projeto.botaoSalvarProjeto.click();
        } else if (tipo.equals("adição de cliente")) {
            cliente.botaoSalvarAdicaoCliente.click();
        } else if (tipo.equals("edição de cliente")) {
            cliente.botaoSalvarEdicaoCliente.click();
        } else if (tipo.equals("adição de rate card")) {
            Thread.sleep(1000);
            ratecard.botaoSalvarRateCard.click();
        } else if (tipo.equals("editar rate card")) {
            ratecard.botaoSalvarRateCardEditar.click();
        } else if (tipo.equals("adição de sparker")) {
            sparker.botaoSalvarAdicaoSparker.click();
        } else if (tipo.equals("edição sparker")) {
            sparker.botaoSalvarEdicaoSparker.click();
        }
    }
}
