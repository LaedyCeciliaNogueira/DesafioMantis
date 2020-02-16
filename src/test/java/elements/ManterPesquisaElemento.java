package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManterPesquisaElemento {

	public static final String MSG_IDINVALIDO = "APPLICATION ERROR #1100";

	@FindBy(css = "body > table.width100 > tbody > tr > td.menu.right.nowrap > form > input.small")
	protected WebElement campoPesquisaID;

	@FindBy(css = "body > table.width100 > tbody > tr > td.menu.right.nowrap > form > input.button-small")
	protected WebElement btnJump;

	@FindBy(css = "body > table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(1)")
	protected WebElement idRetornadoPesquisa;

	@FindBy(css = "body > div:nth-child(5) > table > tbody > tr:nth-child(1) > td")
	protected WebElement msgErroIdInvalido;
}
