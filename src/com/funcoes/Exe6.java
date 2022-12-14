package com.funcoes;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Faça um programa que converta da notação de 24 horas para a notação de 12 horas.
 * Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em
 * dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e
 * uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e
 * ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal
 * para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita
 * esse cálculo para novos valores de entrada todas as vezes que desejar.
 */
public class Exe6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continuar = true;
		
		while (continuar) {
			int horas, horasRetorno, minutos;
			char periodo;
			
			do {
				System.out.print("Entre com as horas: ");
				horas = entrada.nextInt();
				
				if (horas > 23 || horas < 0) {
					System.out.println("Horas devem estar entre 23 e 0!");
				}
				
			} while (horas > 23 || horas < 0);
			
			do {
				System.out.print("Entre com os minutos: ");
				minutos = entrada.nextInt();
				
				if (minutos > 59 || minutos < 0) {
					System.out.println("Minutos devem estar entre 59 e 0!");
				}
				
			} while (minutos > 59 || minutos < 0);
			
			horasRetorno = Functions.coverteHoras24Para12(horas);
			
			if (horasRetorno != horas) {
				periodo = 'P';
			} else {
				periodo = 'A';
			}
			
			System.out.println(Functions.retornoConversaoHoras(horasRetorno, minutos, periodo));
			
			System.out.print("Deseja continuar? ");
			continuar = entrada.nextBoolean();
		};
		
		System.out.println("Programa finalizado!");
		
		entrada.close();
	}

}
