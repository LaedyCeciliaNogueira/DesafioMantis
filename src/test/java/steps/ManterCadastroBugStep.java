package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.pt.Entao;
import static elements.ManterCadastroBugElemento.*;
import elements.Uteis;
import page.object.ManterCadastroBugPageObject;
import utils.GeradorDriver;

public class ManterCadastroBugStep extends GeradorDriver {

	ManterCadastroBugPageObject usuario = PageFactory.initElements(getDriver(), ManterCadastroBugPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);
	
	@Entao("^seleciona o (.*) para iniciar o cadastro do bug$")
	public void seleciona_o_projeto_para_iniciar_o_cadastro_do_bug(String projeto){
		
		usuariox.seleciona(projeto, PROJETO);
		usuariox.selecionaMenu("Report Issue", ".menu");
		
	}
	
	@Entao("^preenche os dados e salva$")
	public void preenche_os_dados_e_salva() {
		
		//Selecionando Itens do Cadastro
		usuario.aguarda();
		usuariox.seleciona("[All Projects] General", CATEGORY);
		usuariox.seleciona("always", REPRODUCIBILITY);
		usuariox.seleciona("major", SEVERITY);
		usuariox.seleciona("high", PRIORITY);
		usuariox.seleciona("Desktop  Windows 10", SELECT_PROFILE);
		
		//Usuario preenche dados e anexa evidencia 
		usuario.preencheDadosBug();
		usuariox.anexaEvidencia();
		usuario.submeteBug();
	   
	}

	@Entao("^o sistema valida o cadastro$")
	public void o_sistema_valida_o_cadastro() throws InterruptedException{
		usuario.confirmaEnvio();
		usuariox.selecionaMenu("Logout", ".menu");
		//getDriver().close();
	}

	
	
}
