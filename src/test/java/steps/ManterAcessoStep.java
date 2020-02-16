package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import elements.Uteis;
import page.object.ManterAcessoPageObject;
import utils.GeradorDriver;

public class ManterAcessoStep extends GeradorDriver {

	ManterAcessoPageObject usuario = PageFactory.initElements(getDriver(), ManterAcessoPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);
	
	@Dado("^que o usuário esteja no \"([^\"]*)\"$")
	public void que_o_usuário_esteja_no(String portal) {
		getDriver().get(portal);
	}

	@Entao("^ele irá realizar login com (.*) e (.*)$")
	public void ele_irá_realizar_login_com_e(String email, String senha) {
		usuario.realizaLogin(email, senha);
	}

	@E("^o sistema valida o login do (.*)$")
	public void o_sistema_valida_o_login(String user) {
		usuario.verificaLogin(user);
		usuariox.selecionaMenu("Logout", ".menu");
		//getDriver().close();
		
	}

}
