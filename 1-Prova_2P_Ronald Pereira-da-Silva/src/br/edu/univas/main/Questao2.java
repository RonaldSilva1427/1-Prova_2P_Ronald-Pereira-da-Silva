package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		String palavra = leitura.nextLine();
		
		int tamanho = palavra.length();
		String palaNova = "";
		
		char leiaLetra = ' ';
		
		
		
		System.out.println(invertePalavra (tamanho, leiaLetra, palaNova, palavra));
		
		leitura.close();
	}

	public static String invertePalavra (int tamanho, char leiaLetra, String palaNova, String palavra) {
		
		for (int i = tamanho; i > 0 ; i--) {
			
			leiaLetra = palavra.charAt(i-1);
			
			palaNova = palaNova + leiaLetra;
			
		}
		
		return palaNova;
	}
	
}