package Steps.Projeto;

import PageObjects.ClientPage;
import PageObjects.CommomPages;
import PageObjects.ProjectPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AdicionarProjetoSteps {
    public ClientPage client = new ClientPage(Hook.driver) ;
    public ProjectPage projeto = new ProjectPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que o usuário esteja na tela de projetos")
    public void telaAdicionarProjeto() throws InterruptedException {
        Thread.sleep(1000);
        client.botaoClientes.click();
        Thread.sleep(2000);
        client.abrirCliente.click();
    }

    @E("que ele selecione o botão de adicionar projeto")
    public void adicionarProjeto(){
        projeto.botaoAdicionarProjeto.click();
    }

    @E("que ele preencha todos os campos do modal de cadastro corretamente")
    public void preencherCampos() {
        projeto.campoNomeProjeto.sendKeys(GeradorDados.gerarNomeAleatorio(10));
    }

    @Entao("o sistema adiciona o novo projeto")
    public void validarEdicaoRateCard() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Projeto criado com sucesso!")) {
            System.out.println("Projeto criado com sucesso!!");
        }else {
            throw new Exception("Erro ao criar projeto");
        }

    }
}