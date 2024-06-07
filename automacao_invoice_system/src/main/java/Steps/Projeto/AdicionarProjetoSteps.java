package Steps.Projeto;

import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import hooks.Hook;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

import static hooks.Hook.gerarNomeAleatorio;


public class AdicionarProjetoSteps {
    public ClientPage client;
    public ProjectPage projeto;

    @Dado("que o usuário esteja na tela de projetos")
    public void telaAdicionarProjeto() throws InterruptedException {
        client = new ClientPage(Hook.driver);

        client.botaoClientes.click();
        Thread.sleep(2000);
        client.abrirCliente.click();
    }

    @E("que ele selecione o botão de adicionar projeto")
    public void adicionarProjeto() throws InterruptedException {
        projeto = new ProjectPage(Hook.driver);
        projeto.botaoAdicionarProjeto.click();
    }

    @Quando("ele preencher todos os campos do modal de cadastro corretamente")
    public void preencherCampos() {
        projeto.campoNomeProjeto.sendKeys(gerarNomeAleatorio());
        projeto.botaoStatusProjeto.click();
        projeto.statusAtivo.click();
    }
}