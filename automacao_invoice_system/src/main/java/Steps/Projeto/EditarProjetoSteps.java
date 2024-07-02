package Steps.Projeto;

import PageObjects.CommomPages;
import PageObjects.ProjectPage;
import Steps.Tools.GeradorDados;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EditarProjetoSteps {
    public ProjectPage projeto = new ProjectPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);


    @E("que ele selecione o botão de editar")
    public void selecionaEditar() throws InterruptedException {
        Thread.sleep(1000);
        projeto.botaoEditarProjeto.click();
    }

    @E("que ele preencha o modal de edição com os dados necessarios")
    public void preenhcerModal() throws InterruptedException {
        projeto.campoNomeProjetoEditar.sendKeys(Keys.CONTROL + "a");
        projeto.campoNomeProjetoEditar.sendKeys(Keys.DELETE);
        projeto.campoNomeProjetoEditar.sendKeys(GeradorDados.gerarNomeAleatorio());

    }
    @Entao("o sistema atualiza as informacoes do projeto")
    public void validarEdicaoRateCard() throws Exception{
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Projeto alterado com sucesso!")) {
            System.out.println("Projeto alterado com sucesso!!");
        }else {
            throw new Exception("Erro ao alterar projeto");
        }

    }



}
