package page.object;

import org.junit.Assert;

import elements.ManterAcessoElemento;

public class ManterAcessoPageObject extends ManterAcessoElemento {

	public void realizaLogin(String nome, String senha) {

		user.sendKeys(nome);
		password.sendKeys(senha);

		btnLogin.click();
	}
	
	public void verificaLogin(String user) {
		
		String usuarioLogado = userLog.getText();
		Assert.assertTrue(user.toLowerCase().contains(usuarioLogado.toLowerCase()));
		
	}

}
