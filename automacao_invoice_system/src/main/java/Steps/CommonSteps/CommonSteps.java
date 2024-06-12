package Steps.CommonSteps;

import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import PageObjects.RateCardPage;
import hooks.Hook;
import io.cucumber.java.pt.E;

public class CommonSteps {
    public ProjectPage projeto;
    public ClientPage cliente;
    public RateCardPage ratecard;

    @E("clicar em salvar {string}")
    public void salvar(String tipo) throws Exception {
        projeto = new ProjectPage(Hook.driver);
        cliente = new ClientPage(Hook.driver);
        ratecard = new RateCardPage(Hook.driver);

        if (tipo.equals("edição")) {
            projeto.botaoSalvarProjetoEditar.click();
        } else if (tipo.equals("adição")) {
            projeto.botaoSalvarProjeto.click();
        } else if (tipo.equals("adição de cliente")) {
            cliente.botaoSalvarAdicaoCliente.click();
        } else if (tipo.equals("edição de cliente")) {
            Thread.sleep(1000);
            cliente.botaoCancelarEdicaoCliente.click();
        } else if (tipo.equals("adição de rate card")) {
            Thread.sleep(1000);
            ratecard.botaoSalvarRateCard.click();
        } else if (tipo.equals("editar rate card")) {
            ratecard.botaoSalvarRateCardEditar.click();
        }
    }
}
