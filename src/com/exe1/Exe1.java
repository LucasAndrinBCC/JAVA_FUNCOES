package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa para imprimir:
 * 
 * 1
 * 2 2
 * 3 3 3
 * .....
 * n n n n n n ... n
 * 
 * para um n informado pelo usuário. Use uma função que receba um valor n
 * inteiro e imprima até a n-ésima linha.
 */
public class Exe1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro: ");
		int num = entrada.nextInt();
		
		String text = Functions.piramideNumeros(num);
		
		System.out.println(text);
		
		entrada.close();
	}

}
