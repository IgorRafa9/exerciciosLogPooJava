package Quest�o1;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Quest�o1 {

	public static void main(String[] args) {		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/YYYY");
		
		Scanner key = new Scanner(System.in);
		
		Calendar agora = Calendar.getInstance();
		Empresa empresa = new Empresa();
		ArrayList <String> empr = new ArrayList<>();
		Funcionario func = new Funcionario();
		int escolha,quant=0;;
		double salario;
		String CNPJ, resp, CPF, nome, sobrenome;
		
		
		do {
			System.out.println("O que deseja?");
			System.out.println("1-Cadastrar empresa\n"
					+ "2-Lista de Empresas\n"
					+ "3-Sair");
			escolha = key.nextInt();
			switch(escolha) {
			   case 1:
				   System.out.println("Insira o nome da empresa: ");
				   nome = key.next();
				   empresa.nome(nome);				   
				   System.out.println("CNPJ: ");
				   CNPJ = key.next();
				   empresa.CNPJ(CNPJ);
				   empresa.mostrarInfo();
				   System.out.println("============================");
				   System.out.println("Deseja cadastrar funcion�rio?");
				   System.out.println("1 - Sim\n2 - N�o");
				   escolha = key.nextInt();
				   switch(escolha) {
				   		case 1:
				   			do {
				   			System.out.println("Informe o nome do funcion�rio: ");
							   nome = key.next();
							   func.nomeFunc(nome);
							   System.out.println("Sobrenome");
							   sobrenome = key.next();
							   System.out.println("CPF: ");
							   CPF = key.next();
							   System.out.println("Sal�rio: ");
							   salario = key.nextDouble();
							   func.salario(salario);						   							   
				   			   System.out.println("Cadastrar mais um funcion�rio?");
							   escolha = key.nextInt();							   							   
				   }while(escolha==1);
				   			break;
				   		case 2:
				   			System.out.println("Saiu");
				   			break;
				   		default: 
				   			System.out.println("Op��o inv�lida.");
				   		}
			   case 2:
		   			break;
			   case 3:
					System.out.println("Saiu da tela");
					break;	
				}	
			
			System.out.println("Deseja algo mais?");
			resp = key.next();
			
		}while(resp.equalsIgnoreCase("S"));
		System.out.println("Saiu. Obrigado e volte sempre!!!");
		System.out.printf
	
		
		("%tF\n",agora);
		System.out.printf("%tr\n",agora);
		key.close();
	  }
	}
