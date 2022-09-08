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
public class Exe3 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro: ");
		int a = entrada.nextInt();
		
		System.out.print("Informe um numero inteiro: ");
		int b = entrada.nextInt();
		
		System.out.print("Informe um numero inteiro: ");
		int c = entrada.nextInt();
		
		int soma = Functions.somaTresNumeros(a, b, c);
		
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}

}
