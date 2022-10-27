package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import pages.TestlinkPage;
import runner.RunCucumber;

public class TestlinkStep extends RunCucumber {

    TestlinkPage testlinkPage = new TestlinkPage(driver);

    @Dado("^que eu acesse a página do Testlink$")
    public void que_eu_acesse_a_página_do_Testlink() {
        testlinkPage.aceesarPaginaTestlink();
    }

    @E("^verifico se estou na página inicial$")
    public void verifico_se_estou_na_página_inicial() {
        testlinkPage.verificarPaginaInicial();
    }

    @Então("^verifico a mensagem de cabeçalho$")
    public void verifico_a_mensagem_de_cabeçalho() {
        testlinkPage.verificarMensagemCabecalho();
    }

    @E("^clico no link do Github$")
    public void clico_no_link_do_Github() {
        testlinkPage.clicarLinkGit();
    }
}
