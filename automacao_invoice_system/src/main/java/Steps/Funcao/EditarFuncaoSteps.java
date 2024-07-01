package Steps.Funcao;

import PageObjects.CommomPages;
import PageObjects.FuncaoPage;
import hooks.Hook;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditarFuncaoSteps {
    public FuncaoPage funcao = new FuncaoPage(Hook.driver);
    public CommomPages commom = new CommomPages(Hook.driver);

    @E("que ele clique no botão de editar uma função já cadastrada")
    public void abrirModalEdicaoFuncao() throws InterruptedException {
        Thread.sleep(1000);
        funcao.botaoEditarFuncao.click();
    }

    @E("que ele preencha o modal de edição com os campos necessários")
    public void preenhcerModalEdicaoFuncao() {
        funcao.campoNomeFuncaoEditar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        funcao.campoNomeFuncaoEditar.sendKeys("QA");

        funcao.abrirPerfilEditar.click();
        funcao.perfilSeniorEditar.click();

        funcao.campoValorHoraEditar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        funcao.campoValorHoraEditar.sendKeys("200");

        funcao.campoAlocacaoEditar.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        funcao.campoAlocacaoEditar.sendKeys("95");
    }

    @Entao("o sistema atualiza os dados da função com sucesso")
    public void verificarAdicaoFuncao() throws Exception {
        Thread.sleep(1000);
        if (commom.mensagemDeSucesso.getText().equals("Função alterada com sucesso!")) {
            System.out.println("Função alterada com sucesso!");
        }else {
            throw new Exception("Erro ao alterar função");
        }
    }
}
