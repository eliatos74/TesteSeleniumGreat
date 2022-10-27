package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestlinkGitPage {

    private By repotestlink = By.xpath("//a[contains(@class, 'url fn')]");
    private By repotestlinkcode = By.xpath("//a[contains(text(), \"testlink-code\") ]");
    private By sobre = By.xpath("//p[contains(@class, 'f4 my-3')]");
    private By digitar = By.name("q");
    private By resultado = By.xpath("//h3[contains(text(), \"2 code results\") ]");

    private WebDriver driver;

    public TestlinkGitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verificarTextoRepositorioPrincipal() {
        String mensagemRepositorioPrincipal = driver.findElement(repotestlink).getText();
        Assert.assertEquals("TestLinkOpenSourceTRMS", mensagemRepositorioPrincipal);
    }

    public void verificarTextoRepositorioCode() {
        String mensagemRepositorioCode = driver.findElement(repotestlinkcode).getText();
        Assert.assertEquals("testlink-code", mensagemRepositorioCode);
    }

    public void verificarMensagemSobre() {
        String mensagemSobre = driver.findElement(sobre).getText();
        Assert.assertEquals("TestLink Open Source Test & Requirement Management System", mensagemSobre);
    }

    public void digitarBarraPesquisa(String texto) {
        driver.findElement(digitar).sendKeys(texto);
        driver.findElement(digitar).submit();
    }

    public void verificarResultadoPesquisa(String mensagem) {
        String resultadoMensagem = driver.findElement(resultado).getText();
        Assert.assertTrue(resultadoMensagem.contains("2 code results"));
    }

}
