package page.object;

import org.junit.Assert;

import elements.ManterPesquisaElemento;

public class ManterPesquisaPageObject extends ManterPesquisaElemento {

	public void realizaPesquisa(String id) {

		campoPesquisaID.sendKeys(id);
		btnJump.click();
	}

	public void verificaRetornoIdValido(String idEsperado) {
		String idObtido = idRetornadoPesquisa.getText();
		Assert.assertTrue(idObtido.contains(idEsperado));
	}

	public void verificaRetornoIdInvalido() {

		String msgObtida = msgErroIdInvalido.getText();
		Assert.assertEquals(MSG_IDINVALIDO, msgObtida);

	}
}
