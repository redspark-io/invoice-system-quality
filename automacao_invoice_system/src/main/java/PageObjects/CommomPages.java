package PageObjects;

import hooks.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommomPages {
    public CommomPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.ID, using = "notistack-snackbar")
    public WebElement mensagemDeSucesso;

}