package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
			
			Scanner leitura = new Scanner (System.in);
			
			String palavra = leitura.nextLine();
			
			int tamanho = palavra.length();
			String palaNova = "";
			char leiaLetra;
			
			for (int i = tamanho; i > 0 ; i--) {
				
				leiaLetra = palavra.charAt(i-1);
				
				System.out.println(leiaLetra);
				
				palaNova = palaNova + leiaLetra;
				
			}
			
			
			
			leitura.close();
		}

	}
