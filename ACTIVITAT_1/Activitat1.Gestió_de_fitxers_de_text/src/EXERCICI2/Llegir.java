package EXERCICI2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Llegir {
	public static void llegirFitxer(String qFitxer) {
		File f;
		FileReader fr;
		BufferedReader in;
		
		f = new File(qFitxer);
		try {
			fr = new FileReader(f);
			in = new BufferedReader(fr);
			
			while(in.ready()) {
				System.out.println(in.readLine());
			}
		} catch (IOException e) {
			System.err.println("No puc llegir el fitxer");
			//e.printStackTrace();
		}
	}

}