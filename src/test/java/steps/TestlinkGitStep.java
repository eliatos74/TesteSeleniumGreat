package steps;

import cucumber.api.java.pt.*;
import pages.TestlinkGitPage;
import runner.RunCucumber;

public class TestlinkGitStep extends RunCucumber {

    TestlinkGitPage testlinkGitPage = new TestlinkGitPage(driver);

    @E("^verifico se estou na página github do Testlink$")
    public void verifico_se_estou_na_página_github_do_Testlink() {
        testlinkGitPage.verificarTextoRepositorioPrincipal();
        testlinkGitPage.verificarTextoRepositorioCode();
    }

    @Então("^verifico a mensagem do sobre$")
    public void verifico_a_mensagem_do_sobre() {
        testlinkGitPage.verificarMensagemSobre();
    }

    @Quando("^eu pesquiso por \"([^\"]*)\" na barra de pesquisa$")
    public void eu_pesquiso_por_na_barra_de_pesquisa(String texto) {
        testlinkGitPage.digitarBarraPesquisa(texto);
    }

    @Então("^devo ver a mensagem \"([^\"]*)\"$")
    public void devo_ver_a_mensagem(String mensagem) {
        testlinkGitPage.verificarResultadoPesquisa(mensagem);
    }
}
