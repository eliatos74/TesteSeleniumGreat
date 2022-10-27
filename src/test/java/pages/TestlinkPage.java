package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestlinkPage {

    private By cabecalho = By.xpath("//h1[contains(text(), \"TestLink Open Source Test Management\") ]");
    private By linkGit = By.xpath("//a[contains(text(), \"Access Git Repository (GitHub)\") ]");

    private WebDriver driver;

    public TestlinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void aceesarPaginaTestlink() {
        driver.get("https://testlink.org/");
        driver.manage().window().maximize();
    }

    public void verificarPaginaInicial() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://testlink.org/", url);
    }

    public void verificarMensagemCabecalho() {
        String cabecalhoMensagem = driver.findElement(cabecalho).getText();
        Assert.assertEquals("TestLink Open Source Test Management", cabecalhoMensagem);
    }

    public void clicarLinkGit() {
        driver.findElement(linkGit).click();
    }
}
