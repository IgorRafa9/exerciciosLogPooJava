package Quest�o4;

import java.util.Scanner;

public class Quest�o4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int n[] = new int[10];
		
		int r,soma=0;
		
		System.out.println("Informe a raz�o: ");
		r = key.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println("Informe um valor: "+i);
			n[i]=key.nextInt();
			
			soma=soma+(n[i]+(n[i]-1)*r);
		}
		System.out.println(soma);
		if(soma%r!=0) {
			System.out.println("N�o � uma progress�o aritm�tica.");
		}else {
			System.out.println("� uma progress�o aritm�tica.");
		}

	}

}
