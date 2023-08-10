package com.escrita;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		
		ArrayList<String> linhas = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		String entrada = new String();
		
		System.out.println("DIgite suas tarefas abaixo, "
				+ "cada tarefa separada por um Enter");
		
		do {
			entrada = scanner.nextLine();
			linhas.add(entrada);
		} while (entrada!=""); 
		
		Path path = Paths.get("/home/gustavopc/Desktop/tarefas.txt");
		
		Files.write(path, linhas);
		
		System.out.println("Fim...");
	}
}
