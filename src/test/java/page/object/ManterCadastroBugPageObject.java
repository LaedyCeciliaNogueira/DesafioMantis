package page.object;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import elements.ManterCadastroBugElemento;

public class ManterCadastroBugPageObject extends ManterCadastroBugElemento {

	public void preencheDadosBug() {
		summary.sendKeys("UC0012_ManterRequerimento");
		description.sendKeys("Os campos obrigatórios nao foram validados");
		steps.sendKeys("Menu -> Acoes -> Cadastro do Requerimento");
		addicional.sendKeys(" Os dados técnicos devem seguir a obrigatoriedade e Complementares nao.");
		aguarda();
	}

	public void submeteBug() {
		btnSubmitReport.click();
	}

	public void aguarda() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void confirmaEnvio() throws InterruptedException {

		salvaIdBug();

	}

	public void salvaIdBug() throws InterruptedException {

		String[] array = idBug.getText().split(" ");
		String id = array[3];
		System.out.println("######" +  id);
		
		try {
			Path bancoId = Paths.get("src" + File.separator
					+ "test"
					+ File.separator
					+ "resources"
					+ File.separator
					+ "bancoId.info");
			System.out.println("#####" + bancoId.toFile().getAbsolutePath());
			Files.write(bancoId, id.getBytes(), StandardOpenOption.CREATE,
			         StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e1) {
			e1.printStackTrace();

	}
}}
