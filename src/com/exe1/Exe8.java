package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça uma função que informe a quantidade de dígitos de um determinado número
 * inteiro informado.
 */
public class Exe8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int num = entrada.nextInt();
		
		System.out.println("Quantidade de dígitos: " + Functions.numeroLength(num));
		
		entrada.close();
	}

}
