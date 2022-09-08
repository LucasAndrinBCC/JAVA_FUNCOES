package com.exe1;

import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Embaralha palavra. Construa uma função que receba uma string como parâmetro
 * e devolva outra string com os carateres embaralhados. Por exemplo: se função
 * receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra
 * combinação possível, de forma aleatória. Padronize em sua função que todos os
 * caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de
 * como foram digitados.
 * 
 */
public class Exe12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma palavra: ");
		String texto = entrada.next();
		
		System.out.println(Functions.embaralhaPalavra(texto));
		
		entrada.close();
	}

}
