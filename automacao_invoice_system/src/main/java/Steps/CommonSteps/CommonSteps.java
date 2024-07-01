package Steps.CommonSteps;

import PageObjects.*;
import hooks.Hook;
import io.cucumber.java.pt.Quando;

public class CommonSteps {
    public ProjectPage projeto = new ProjectPage(Hook.driver);
    public ClientPage cliente = new ClientPage(Hook.driver);
    public RateCardPage ratecard = new RateCardPage(Hook.driver);
    public SparkerPage sparker = new SparkerPage(Hook.driver);
    public PeriodoPage periodo = new PeriodoPage(Hook.driver);
    public FuncaoPage funcao = new FuncaoPage(Hook.driver);

    @Quando("clicar em salvar {string}")
    public void salvar(String tipo) throws Exception {
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
        } else if (tipo.equals("adição periodo")) {
            periodo.botaoSalvarAdicaoPeriodo.click();
        } else if (tipo.equals("edição periodo")) {
            periodo.botaoSalvarEdicaoPeriodo.click();
        } else if (tipo.equals("adição função")) {
            funcao.botaoSalvarAdicaoFuncao.click();
        } else if (tipo.equals("edição função")) {
            funcao.botaoSalvarEdicaoFuncao.click();
        }
    }
}
