package ProyectoAccesoUF1.ProyectoAccesoUF1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {
	
	public static void LeerTexto(String PFitxer) {
		
		File f;
		FileReader fr;
		BufferedReader br;
		
		
		f = new File(PFitxer);
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
			
			
		} catch (IOException e) {
			System.err.println("No puc llegir el fitxer");
		
		}
		
	}

}
