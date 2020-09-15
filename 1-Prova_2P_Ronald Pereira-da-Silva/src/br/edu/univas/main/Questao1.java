package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	   public static void main(String[]args) {
		   
	        Scanner leitura = new Scanner(System.in);

	        int notas[] = new int [10];

	        for(int i = 0; i < notas.length; i++ ) {
	        	
	            int notas2 = leitura.nextInt();

	            resultadoNotas(notas2, i);


	            leitura.close();
	        }

	    }public static void resultadoNotas(int x, int y) {

	        if(x < 60) {
	            System.out.println( ++y == 0);
	            
	        }else if (x > 60) {
	            System.out.println(++y == 1); 
	        }

	    }
	}