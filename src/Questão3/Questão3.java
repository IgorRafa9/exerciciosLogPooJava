package Questão3;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int escolha;
		double dep,saq,sal;
		ContaCorrente cc = new ContaCorrente();
		
		String resp;
		do {
			System.out.println("O que deseja?");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Saldo");
			escolha = key.nextInt();
			switch(escolha) {
				case 1:
					System.out.println("Insira o valor a depositar: ");
					dep = key.nextDouble();
					cc.deposita(dep);
					cc.mostrarSaldo();
					break;
				case 2:
					System.out.println("Insira o valor a ser sacado: ");
					saq = key.nextDouble();
					cc.sacar(saq);
					cc.mostrarSaldo();
					break;
				case 3:
					cc.mostrarSaldo();
					break;
				default:
					System.out.println("Saiu");
			}
			System.out.println("Deseja outra fazer operação?");
			resp = key.next();
		}while(resp.equalsIgnoreCase("S"));
		System.out.println("Sessão Encerrada");
	}
		
}
