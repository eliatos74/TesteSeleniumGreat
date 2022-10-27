package steps;

import cucumber.api.java.pt.*;
import pages.GithubPage;
import runner.RunCucumber;

public class GithubStep extends RunCucumber {

    GithubPage githubPage = new GithubPage(driver);

    @Dado("^que eu acesse a página do github$")
    public void que_eu_acesse_a_página_do_github() {
        githubPage.acessarPagina();
    }

    @Então("^verifico se estou na página incial$")
    public void verifico_se_estou_na_página_incial() {
        githubPage.verificarPaginaInicial();
    }

    @Quando("^eu pesquiso por \"([^\"]*)\"$")
    public void eu_pesquiso_por(String texto) {
        githubPage.digitarBarraPesquisa(texto);
    }

    @Então("^devo ver a mensagem \"([^\"]*)\"$")
    public void devo_ver_a_mensagem(String mensagem) {
        githubPage.verificarResultadoPesquisa(mensagem);
    }
}
