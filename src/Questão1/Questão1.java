package Questão1;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Questão1 {

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
				   System.out.println("Deseja cadastrar funcionário?");
				   System.out.println("1 - Sim\n2 - Não");
				   escolha = key.nextInt();
				   switch(escolha) {
				   		case 1:
				   			do {
				   			System.out.println("Informe o nome do funcionário: ");
							   nome = key.next();
							   func.nomeFunc(nome);
							   System.out.println("Sobrenome");
							   sobrenome = key.next();
							   System.out.println("CPF: ");
							   CPF = key.next();
							   System.out.println("Salário: ");
							   salario = key.nextDouble();
							   func.salario(salario);						   							   
				   			   System.out.println("Cadastrar mais um funcionário?");
							   escolha = key.nextInt();							   							   
				   }while(escolha==1);
				   			break;
				   		case 2:
				   			System.out.println("Saiu");
				   			break;
				   		default: 
				   			System.out.println("Opção inválida.");
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
