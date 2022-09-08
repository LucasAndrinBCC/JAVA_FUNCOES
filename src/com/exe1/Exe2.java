package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa para imprimir:
 * 1
 * 1 2
 * 1 2 3
 * .....
 * 1 2 3 ... n
 * 
 * para um n informado pelo usuário. Use uma função que receba um valor n
 * inteiro imprima até a n-ésima linha.
 */
public class Exe2 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um numero inteiro: ");
		int num = entrada.nextInt();
		
		String text = Functions.piramideNumerosCrescente(num);
		
		System.out.println(text);
		
		entrada.close();
	}

}
