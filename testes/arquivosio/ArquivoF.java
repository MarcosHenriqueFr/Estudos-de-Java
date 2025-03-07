package testes.arquivosio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoF {

	ClassLoader loader = getClass().getClassLoader();
	
	void lerArquivo() {
		try {
			FileReader teste = new FileReader(loader.getResource("resources/teste.txt").getFile());
			BufferedReader reader = new BufferedReader(teste);
			List<String> linhasArquivo = new ArrayList<String>(); 
			
			System.out.println(reader.readLine()); // lê somente essa linha
			
			String linha;
			while((linha = reader.readLine()) != null) {
				linhasArquivo.add(linha);
			}
			
			System.out.println(linhasArquivo.size());
			System.out.println(linhasArquivo.toString());
			linhasArquivo.stream().forEach(System.out::println);
			
			reader.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	void escreverArquivo(String[] qualquer) {
		try {
			//é feito na pasta do projeto
			//Atualiza\Override o arquivo
			FileWriter teste = new FileWriter(loader.getResource("resources/teste.txt").getFile());
			BufferedWriter writer = new BufferedWriter(teste);
			
			writer.write("Hello World, im writing here!");
			writer.write("\nSecond Line");
			writer.write("\n\nNomes:");
			
			for(String nome: qualquer) {
				writer.write("\n" + nome);
			}
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
