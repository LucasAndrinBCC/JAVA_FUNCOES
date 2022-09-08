package com.exe1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

public class Functions {

	/**
	 * Retorna piramide de números de acordo com o tamanho da piramide informado:
	 * 
	 * 1
	 * 2 2
	 * 3 3 3
	 * .....
	 * n n n n n n ... n
	 * 
	 * @param size
	 * @return exit
	 */
	public static String piramideNumeros(int size) {
		
		StringBuilder text = new StringBuilder();
		
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < i; j++) {
				text.append(i);
				text.append(" ");
			}
			text.append("\n");
		}
		
		return text.toString();
		
	}
	
	/**
	 * Retorna uma piramide de numeros crescentes de acordo com o tamanho informado
	 * 1
	 * 1 2
	 * 1 2 3
	 * .....
	 * 1 2 3 ... n
	 * 
	 * @param size
	 * @return text
	 */
	public static String piramideNumerosCrescente(int size) {
		StringBuilder text = new StringBuilder();
		
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				text.append(j);
				text.append(" ");
			}
			text.append("\n");
		}
		
		return text.toString();
	}
	
	/**
	 * Retorna a soma de tres argumentos
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return soma
	 */
	public static int somaTresNumeros(int a, int b, int c) {
		int soma = a + b + c;
		return soma;
	}
	
	/**
	 * Retorna P para numero positivo e N para numero negativo
	 * 
	 * @param num
	 * @return 'P' or 'N'
	 */
	public static char retornaNegativoPositivo(int num) {
		if (num > 0) {
			return 'P';
		} else {
			return 'N';
		}
	}
	
	/**
	 * Reajusta o valor do item de acordo com o imposto (%) sobre o preco do mesmo
	 * 
	 * @param valorItem
	 * @param taxaImposto
	 * @return valorItem
	 */
	public static float somaImposto(float valorItem, float taxaImposto) {
		valorItem += valorItem * (taxaImposto / 100);
		
		return valorItem;
	}
	
	/**
	 * Formata horas do padrão 24 para 12
	 * 
	 * @param hora
	 * @return hora or hora - 12
	 */
	public static int coverteHoras24Para12(int hora) {
		if (hora > 12) {
			return hora - 12;
		} else {
			return hora;
		}
	}
	
	/**
	 * retorna conversao de horas 24 para horas 12
	 * 
	 * @param hora
	 * @param periodo
	 * @return text.toString();
	 */
	public static String retornoConversaoHoras(int horas, int minutos, char periodo) {
		StringBuilder text = new StringBuilder();
		
		text.append(horas);
		text.append(":");
		text.append(minutos);
		text.append(" ");
		text.append(periodo);
		text.append(".M");
		
		return text.toString();
	}
	
	/**
	 * retorna o valor de pagamento final, considerando o valor de pagamento informado, os dias de atraso, a multa e a multa por dia
	 * 
	 * @param valorPagamento
	 * @param diasAtraso
	 * @param multa
	 * @param multaPorDia
	 * @return valorFinal
	 */
	public static float valorPagamento(float valorPagamento, int diasAtraso, float multa, float multaPorDia) {
		float valorFinal = valorPagamento + valorPagamento * multa + valorPagamento * multaPorDia * diasAtraso;
		
		return  valorFinal;
	}
	
	/**
	 * Retorna o número de dígitos de um número inteiro
	 * 
	 * @param numero
	 * @return numeroString.length();
	 */
	public static int numeroLength(int numero) {
		String numeroString = String.valueOf(numero);
		
		return numeroString.length();
	}
	
	/**
	 * Retorna o reverso de um número inteiro
	 * 
	 * @param number
	 * @return reverso
	 */
	public static int inverseNumber(int number) {
		int reverso = 0;
		
		while(number != 0) {
			int remainder = number % 10;
			reverso = reverso * 10 + remainder;  
			number = number/10;
		}

		return reverso;
	}
	
	/**
	 * Retorna mes da data informada no tipo dd/mm/aa
	 * se estiver errática retorna null
	 * 
	 * @param data
	 * @return null/string
	 * @throws ParseException
	 */
	public static String retornaMes(String data) throws ParseException {
		if (data.length() != "dd/mm/aaaa".length()) {
			
			return null;
			
		} else if (data.charAt(2) != '/' || data.charAt(5) != '/') {
			
			return null;
			
		} else {
			SimpleDateFormat diaMesAno = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataFormatada = diaMesAno.parse(data);
			
			if (dataFormatada.toString() != data) {
				return null;
			}
			
			LocalDate localData = dataFormatada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					
			int mes = localData.getMonthValue();
			
			switch (mes) {
				case 1:
					return "Janeiro";
				case 2: 
					return "Fevereiro";
				case 3: 
					return "Marco";
				case 4: 
					return "Abril";
				case 5: 
					return "Maio";
				case 6: 
					return "Junho";
				case 7:
					return "Julho";
				case 8: 
					return "Agosto";
				case 9:
					return "Setembro";
				case 10:
					return "Outubro";
				case 11: 
					return "Novembro";
				default:
					return "Dezembro";
			}
		}
	}

	/**
	 * Retorna string embaralhada
	 * 
	 * @param texto
	 * @return embaralhado.toString()
	 */
	public static String embaralhaPalavra(String texto) {
		StringBuilder embaralhado = new StringBuilder();
		String[] textVector = texto.split("");
		
		Arrays.sort(textVector);
		
		for (String caractere : textVector) {
			embaralhado.append(caractere);
		}
		
		return embaralhado.toString();
	}
	
	public static String desenhaMoldura(int colunas, int linhas) {
		
		StringBuilder texto = new StringBuilder();
		
		String plus = "+", minus = "-", bar = "|", nextLine = "\n";
		int first = 1;
		
		for (int i = first; i <= linhas; i++) {
			for (int j = first; j <= colunas; j++) {
				if (j == first) {
					
					if (i != first && i != linhas) {
						texto.append(bar);
					} else {
						texto.append(plus);
					}
					
				} else if (j == colunas) {
					
					if (i != first && i != linhas) {
						texto.append(bar);
					} else {
						texto.append(plus);
					}
					texto.append(nextLine);
					
				} else {
					texto.append(minus);
				}
			}
		}

		return texto.toString();
	}
}
