package com.exe1;

import java.text.ParseException;
import java.util.Scanner;

/**
 * 
 * @author Lucas Andrin
 * 
 * Data com mês por extenso. Construa uma função que receba uma data no formato
 * DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA.
 * Opcionalmente, valide a data e retorne NULL caso a data seja inválida.
 */
public class Exe11 {

	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com uma data no formato DD/MM/YYYY: ");
		String data = entrada.nextLine();
		
		System.out.println(Functions.retornaMes(data));
		
		entrada.close();
	}

}
