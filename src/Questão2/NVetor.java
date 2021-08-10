package Questão2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class NVetor {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int numVet[] = new int[10];
		int num,i;
	
		
		for(i=0;i<10;i++) {
			do {
				System.out.println("Informe o valor de "+i+":");
				numVet[i] = key.nextInt();
			}while(numVet[i]<0);
		}
		
		
			for(i = 0; i < numVet.length; i++) {
				if(numVet[9]>numVet[0]) {
					System.out.println("Crescente");
					break;
				}else {
					System.out.println("Decrescente");
					break;
				}
			}
			
		do {			
			System.out.println("Informe um valor: ");
			num = key.nextInt();	
			for(i=0;i<numVet.length;i++) {
				if(num>numVet[i]) {
					System.out.println(num+" é maior que "+numVet[i]);
				}else if(num<numVet[i]) {
					System.out.println(num+" é menor a "+numVet[i]);
				}else {
					System.out.println(num+" é igual a "+numVet[i]);
				}
			}
			System.out.println("-------------------------------");
		}while(num<0);
		
			
		}	
		
		
	}

