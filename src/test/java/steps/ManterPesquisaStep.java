package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import elements.Uteis;
import page.object.ManterPesquisaPageObject;
import utils.GeradorDriver;

public class ManterPesquisaStep extends GeradorDriver {

	ManterPesquisaPageObject usuario = PageFactory.initElements(getDriver(), ManterPesquisaPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);

	// Validacao com Id válido
	@Entao("^realiza a pesquisa do Bug por um ID válido$")
	public void realiza_a_pesquisa_do_Bug_por_um_ID_válido() {
		usuariox.selecionaMenu("My View", ".menu");
		usuario.realizaPesquisa(usuariox.recuperaIdBug());
	}

	@E("^sistema retorna o resultado$")
	public void sistema_retorna_o_resultado() {
		usuario.verificaRetornoIdValido(usuariox.recuperaIdBug());
	}

	// Validacao com Id Invalido
	@E("^para verificar um retorno nulo o usuário insere um Id nulo$")
	public void para_verificar_um_retorno_nulo_o_usuário_insere_um_Id_nulo() {
		usuario.realizaPesquisa("12345");
	}

	@Entao("^o sistema retorna uma msg de erro\\.$")
	public void o_sistema_retorna_uma_msg_de_erro() {
		usuario.verificaRetornoIdInvalido();
		usuariox.selecionaMenu("Logout", ".menu");
		getDriver().close();
	}

}
