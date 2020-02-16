package elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.GeradorDriver;

public class Uteis extends GeradorDriver {

	public void seleciona(String nomeSelecionavel, String css) {
		getDriver().findElement(By.cssSelector(css)).click();
		List<WebElement> itens = getDriver().findElements(By.tagName("option"));
		for (WebElement itemLista : itens) {
			if (itemLista.getText().toLowerCase().equals(nomeSelecionavel.toLowerCase())) {
				itemLista.click();
				break;
			}
		}
	}

	public void selecionaMenu(String nomeSelecionavel, String css) {
		getDriver().findElement(By.cssSelector(css)).click();
		List<WebElement> itens = getDriver().findElements(By.tagName("a"));
		for (WebElement itemLista : itens) {
			if (itemLista.getText().toLowerCase().equals(nomeSelecionavel.toLowerCase())) {
				itemLista.click();
				break;
			}
		}
	}

	public void anexaEvidencia() {

		WebElement enviaArquivo = getDriver().findElement(By.id("ufile[]"));

		URL res = getClass().getClassLoader().getResource("anexo.png");
		File file;
		try {
			file = Paths.get(res.toURI()).toFile();
			String absolutePath = file.getAbsolutePath();
			enviaArquivo.sendKeys(absolutePath);
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

	}

	public String recuperaIdBug() {
		
		Path bancoIdBug = Paths.get("src"+ File.separator
				+ "test" + File.separator
				+ "resources" + File.separator
				+ "bancoId.info");
		try {
			List<String> numeroId = Files.readAllLines(bancoIdBug, Charset.forName("UTF-8"));
			return numeroId.get(0);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
