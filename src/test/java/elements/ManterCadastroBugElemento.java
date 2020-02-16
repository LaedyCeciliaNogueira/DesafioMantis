package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManterCadastroBugElemento {
	
	public static final String PROJETO = "body > table.hide > tbody > tr > td.login-info-right > form > select";
	
	public static final String CATEGORY = "body > div:nth-child(6) > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > select";
	public static final String REPRODUCIBILITY = "body > div:nth-child(6) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > select";
	public static final String SEVERITY = "body > div:nth-child(6) > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > select";
	public static final String PRIORITY = "body > div:nth-child(6) > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > select";
	public static final String SELECT_PROFILE = "body > div:nth-child(6) > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > select";

	
	@FindBy (css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]")
	protected WebElement summary;
	
	@FindBy (css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > textarea")
	protected WebElement description;
	
	@FindBy (css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > textarea")
	protected WebElement steps;
	
	@FindBy (css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(11) > td:nth-child(2) > textarea")
	protected WebElement addicional;
	
	@FindBy (css ="#ufile\\[\\]")
	protected WebElement btnEscolherArquivo;
	
	@FindBy (css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(15) > td.center > input")
	protected WebElement btnSubmitReport;
	
	@FindBy(css="body > div:nth-child(5) > span:nth-child(2) > a")
	protected WebElement idBug;
	
	@FindBy(css="body > div:nth-child(5)")
	protected WebElement msgSucesso;
	
}
