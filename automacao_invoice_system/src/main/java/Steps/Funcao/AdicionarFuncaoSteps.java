package Steps.Funcao;

import PageObjects.ClientPage;
import PageObjects.FuncaoPage;
import PageObjects.ProjectPage;
import PageObjects.RateCardPage;
import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdicionarFuncaoSteps {
    public ClientPage cliente = new ClientPage(Hook.driver);
    public ProjectPage projeto = new ProjectPage(Hook.driver);
    public RateCardPage rateCard = new RateCardPage(Hook.driver);
    public FuncaoPage funcao = new FuncaoPage(Hook.driver);

    @Dado("que o usuário esteja na tela de função")
    public void telaAdicionarFuncao() throws InterruptedException{
        cliente.botaoClientes.click();
        Thread.sleep(1000);
        cliente.abrirCliente.click();
        Thread.sleep(1000);
        projeto.abrirProjeto.click();
        Thread.sleep(1000);
        rateCard.abrirRateCard.click();
    }

    @E("que ele clique no botão de adicionar")
    public void abrirModalAdicaoFuncao() {
        funcao.botaoAdicionarFuncao.click();
    }

    @E("que ele preencha todos os campos do modal de cadastro corretamente")
    public void preencherCamposAdicaoFuncao() {
        funcao.campoNomeFuncao.sendKeys("Desenvolvedor");
        funcao.abrirPerfil.click();
        funcao.perfilPleno.click();
        funcao.campoValorHora.sendKeys("150");
        funcao.campoAlocacao.sendKeys("100");
    }

    @Entao("o sistema cadastra uma nova função")
    public void verificarAdicaoFuncao() throws Exception {
        Thread.sleep(1000);
        WebElement mensagemDeSucesso = Hook.driver.findElement(By.id("notistack-snackbar"));
        if (mensagemDeSucesso.getText().equals("Função criada com sucesso!")) {
            System.out.println("Função criada com sucesso!");
        }else {
            throw new Exception("Erro ao criar função");
        }
    }
}
