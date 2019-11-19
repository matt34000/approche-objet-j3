package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
// j'ai t�l�charg� commons-io-2.6.jar, je l'ai import�, mais il ne le trouve pas dans cette page
// erreur : FileUtils cannot be resolved

public class LectureFichier {
	public static void main(String[] args) {
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

