package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa, com uma função que necessite de um argumento. A função
 * retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
 * argumento for zero ou negativo.
 */
public class Exe4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um numero inteiro: ");
		int num = entrada.nextInt();
		
		char caractere = Functions.retornaNegativoPositivo(num);
		
		System.out.println("Resultado: " + caractere);
		
		entrada.close();
	}

}
