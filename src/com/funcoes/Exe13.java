package com.funcoes;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Desenha moldura. Construa uma função que desenhe um retângulo usando os
 * caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros,
 * linhas e colunas, sendo que o valor por omissão é o valor mínimo igual
 * a 1 e o valor máximo é 20. Se valores fora da faixa forem informados,
 * eles devem ser modificados para valores dentro da faixa de forma elegante.
 * +-----+
 */
public class Exe13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int colunas, linhas;
		
		do {
			System.out.print("Entre com a quantidade de colunas: ");
			colunas = entrada.nextInt();
			
			if (colunas < 1 && colunas > 20) {
				System.out.println("Valor informado deve estar entre 1 e 20!");
			}
		} while (colunas < 1 && colunas > 20);
			
		do {
			System.out.print("Entre com a quantidade de linhas: ");
			linhas = entrada.nextInt();
			
			if (linhas < 1 && linhas > 20) {
				System.out.println("Valor informado deve estar entre 1 e 20!");
			}
		} while (linhas < 1 && linhas > 20);
		
		System.out.println(Functions.desenhaMoldura(colunas, linhas));
		
		entrada.close();
	}

}
