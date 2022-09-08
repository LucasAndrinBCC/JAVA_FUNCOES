package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que use a função valorPagamento para determinar o valor a ser
 * pago por uma prestação de uma conta. O programa deverá solicitar ao usuário o
 * valor da prestação e o número de dias em atraso e passar estes valores para a função
 * valorPagamento, que calculará o valor a ser pago e devolverá este valor ao
 * programa que a chamou. O programa deverá então exibir o valor a ser pago na tela.
 * Após a execução o programa deverá voltar a pedir outro valor de prestação e assim
 * continuar até que seja informado um valor igual a zero para a prestação. Neste
 * momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá
 * a quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser
 * pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da
 * prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia
 * de atraso.
 * 
 * Solicitações:
 * 	valorPrestacao
 * 	numerosDiasAtraso
 * 
 * Calculo: 
 * 	valorPrestacao + valorPrestacao * 3/100 + 0,1/100
 * 
 * 
 */
public class Exe7 {
	
	public static final float MULTA = 0.03f;
	public static final float MULTA_POR_DIA = 0.001f;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float valorPrestacao;
		int numerosDiasAtraso;
		
		do {
			System.out.print("Entre com o valor da prestacao: ");
			valorPrestacao = entrada.nextFloat();
			
			if (valorPrestacao != 0) {
				System.out.print("Entre com os dias de atraso: ");
				numerosDiasAtraso = entrada.nextInt();
				
				System.out.println("valor final: R$" + Functions.valorPagamento(valorPrestacao, numerosDiasAtraso, MULTA, MULTA_POR_DIA));
			}
			
		} while (valorPrestacao != 0);
		
		entrada.close();
	}

}
