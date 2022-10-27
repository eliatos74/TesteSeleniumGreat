package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestlinkGitPage {

    private By repotestlink = By.xpath("//a[contains(@class, 'url fn')]");
    private By repotestlinkcode = By.xpath("//a[contains(text(), \"testlink-code\") ]");
    private By sobre = By.xpath("//p[contains(@class, 'f4 my-3')]");

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

}
