package com.funcoes;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Jogo de Craps.
 * 
 * Faça um programa que implemente um jogo de Craps. O jogador
 * lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
 * tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
 * jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
 * um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
 * dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 ou 11 antes
 * de tirar este Ponto novamente.
 * 
 */
public class Exe10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continuar = true, natural = false, craps = false, pontoFinal = false;
		int pontos = 0, primeiroPonto = 0;
		
		String line = "#==============#";
		
		System.out.println("Natural: 7 ou 11");
		System.out.println("Craps: 2, 3, ou 12");
		System.out.println("Pontuar: 4, 5, 6, 8, 9, 10");
		System.out.println(line);
		
		for (int i = 1; continuar; i++) {
			System.out.println("Jogando dados...");			
			int[] dados = Functions.sorteiaParDados();
			
			for (int j = 0; j < dados.length; j ++) {
				System.out.println("Dado " + (j + 1) + ": " + dados[j]);
			}
			
			craps = Functions.verificaCraps(dados);
			
			if (i == 1) {
				natural = Functions.verificaNatural(dados);
				
				if (!(natural || craps)) {
					primeiroPonto = Functions.verificaPrimeiroPonto(dados);
					System.out.println("Primeiro ponto! " + primeiroPonto);
					pontos++;
				}
				
			} else {
				pontoFinal = Functions.verificaPontoFinal(dados, primeiroPonto);
				
				if (!(craps || pontoFinal)) {
					pontos++;
				}
			}
			
			if (natural || craps || pontoFinal) {
				continuar = false;
			}
			
			System.out.println(line);
		}
		
		if (natural) {
			System.out.println("Você é um natural! Ganhou!");
		} else if (craps) {
			System.out.println("Você perdeu! Craps!");
		} else if (pontoFinal) {
			System.out.println("Você ganhou!");
		}
		System.out.println("Pontos: " + pontos);
		
		entrada.close();
	}

}
