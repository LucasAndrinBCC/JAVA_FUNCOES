package com.funcoes;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa com uma função chamada somaImposto. A função possui dois
 * parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa
 * em porcentagem e custo, que é o custo de um item antes do imposto. A função
 * “altera” o valor de custo para incluir o imposto sobre vendas.
 */
public class Exe5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o valor do item: ");
		float valorItem = entrada.nextFloat();
		
		System.out.print("Entre com a taxa de imposto: ");
		float taxaImposto = entrada.nextFloat();
		
		float valorItemComImposto = Functions.somaImposto(valorItem, taxaImposto);
		
		System.out.println("Valor do item com imposto: " + valorItemComImposto);
		
		System.out.println("Entre com a quantidade de itens: ");
		int qtdItens = entrada.nextInt();
		
		System.out.println("Total: " + valorItem * qtdItens);
		System.out.println("Total (com imposto): " + valorItemComImposto * qtdItens);
		
		entrada.close();
	}

}
