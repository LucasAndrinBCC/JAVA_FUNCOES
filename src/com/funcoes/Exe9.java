package com.funcoes;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * Reverso do número. Faça uma função que retorne o reverso de um número inteiro
 * informado. Por exemplo: 127 -> 721.
 * 
 */
public class Exe9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		
		int num = entrada.nextInt();
		
		System.out.println(Functions.inverseNumber(num));
		
		entrada.close();
	}

}
