package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("soma: " +soma);
		System.out.println("sub: " +subtracao);
		System.out.println("mult: " +multiplicacao);
		System.out.println("div: " +divisao);
		
		
	}
	
	public static float soma(float a, float b) {
		return a+b;
	}
	
	public static float subtracao(float a, float b) {
		return a-b;
	}
	
	public static float divisao(float a, float b) {
		return a/b;
	}
	
	public static float multiplicacao(float a, float b) {
		return a*b;
	}
	
	

}
