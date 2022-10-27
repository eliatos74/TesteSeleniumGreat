package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubPage {

    private By texto_inicial = By.xpath("//p[contains(text(),'The complete developer platform to build, scale, and deliver secure software.')]");
    private By barra_pesquisa = By.name("q");
    private By resultado = By.xpath("//h3[contains(text(), \"repository results\") ]");
    WebDriver driver;

    public GithubPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://github.com/");
        driver.manage().window().maximize();
    }

    public void verificarPaginaInicial() {
        String textoPagina = driver.findElement(texto_inicial).getText();
        Assert.assertEquals("The complete developer platform to build, scale, and deliver secure software.", textoPagina);
    }


    public void digitarBarraPesquisa(String texto) {
        driver.findElement(barra_pesquisa).sendKeys(texto);
        driver.findElement(barra_pesquisa).submit();
    }

    public void verificarResultadoPesquisa(String mensagem) {
        String resultadoMensagem = driver.findElement(resultado).getText();
        Assert.assertTrue(resultadoMensagem.contains("repository results"));
    }

}
