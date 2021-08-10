package Questão4;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int n[] = new int[10];
		
		int r,soma=0;
		
		System.out.println("Informe a razão: ");
		r = key.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println("Informe um valor: "+i);
			n[i]=key.nextInt();
			
			soma=soma+(n[i]+(n[i]-1)*r);
		}
		System.out.println(soma);
		if(soma%r!=0) {
			System.out.println("Não é uma progressão aritmética.");
		}else {
			System.out.println("É uma progressão aritmética.");
		}

	}

}
