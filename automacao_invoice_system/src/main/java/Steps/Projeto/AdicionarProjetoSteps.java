package Steps.Projeto;

import PageObjects.ClientPage;
import PageObjects.ProjectPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AdicionarProjetoSteps {
    public ClientPage client;
    public ProjectPage projeto;

    public List<WebElement> elementsBefore(){
        return Hook.driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/table/tbody/tr"));
    }
    @Dado("que o usuário esteja na tela de projetos")
    public void telaAdicionarProjeto() throws InterruptedException {
        client = new ClientPage(Hook.driver);
        client.botaoClientes.click();
        Thread.sleep(2000);
        client.abrirCliente.click();
    }

    @E("que ele selecione o botão de adicionar projeto")
    public void adicionarProjeto() throws InterruptedException {
        System.out.println(elementsBefore().size());
        projeto = new ProjectPage(Hook.driver);
        projeto.botaoAdicionarProjeto.click();
    }

    @E("que ele preencha todos os campos do modal de cadastro corretamente")
    public void preencherCampos() {
        projeto.campoNomeProjeto.sendKeys(GeradorDados.gerarNomeAleatorio());
        projeto.botaoStatusProjeto.click();
        projeto.statusAtivo.click();
    }
    @Entao("o sistema adiciona o novo projeto")
    public void verificaAdicao() throws Exception{

    }
}