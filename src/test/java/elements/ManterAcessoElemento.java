package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManterAcessoElemento {
	
	@FindBy (css= "input[name='username']")
	protected WebElement user;
	
	@FindBy (css= "input[name = 'password']")
	protected WebElement password;
	
	@FindBy (css= ".button")
	protected WebElement btnLogin;
	
	@FindBy (css = "body > table.hide > tbody > tr > td.login-info-left > span.italic")
	protected WebElement userLog;
}
