package Steps.CommonSteps;

import PageObjects.*;
import hooks.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;

public class CommonSteps {
    public CommomPages commomPage = new CommomPages(Hook.driver);

    @Dado("que o usuario esteja logado")
    public void logar() throws InterruptedException{
        Thread.sleep(1000 );
        commomPage.campoEmail.sendKeys("admin_dev@redspark.io");
        commomPage.campoSenha.sendKeys("Invoice@1234");
        commomPage.botaoEntrar.click();
    }

    @Quando("clicar em salvar {string}")
    public void salvar(String tipo) throws Exception {
        commomPage.botaoSalvar.click();
    }
}
