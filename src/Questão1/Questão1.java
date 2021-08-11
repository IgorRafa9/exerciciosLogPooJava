package Quest�o1;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) throws IOException{
		
		Scanner key = new Scanner(System.in);
		var buffreader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean sair = false;
		int opc;
		String name, CNPJ,resp;
		
		Empresa empresa = new Empresa(5);
		Empresa emp;
		Empresa empr;
		
		while(!sair) {
			
			try {
				do {
					System.out.println("Escolha uma a��o: ");
					System.out.println("1 - Cadastrar Empresa");
					System.out.println("2 - Listar empresa");
					System.out.println("3 - Pesquisar empresa");
					opc = key.nextInt();
					
					switch(opc) {
						case 1:
							System.out.println("Nome da empresa: ");
							name = buffreader.readLine();
							
							System.out.println("CNPJ: ");
							CNPJ = buffreader.readLine();
							
							empr = new Empresa(name, CNPJ);
							
							empresa.addEmpresa(empr);
							
							break;
						case 2:
							empresa.listarEmpresa();
							break;
						case 3:
							System.out.println("Nome da empresa: ");
							name = buffreader.readLine();
							
							try {
								empresa.buscarEmpresa(name);
							}catch (Exception e){
								throw new NullPointerException("Empresa n�o existe");
							}
							break;
						case 4:
							
							
						default:
							System.out.println("Op��o inv�lida.");
					}
					System.out.println("Deseja algo mais?");
					resp = key.next();
				}while(resp.equalsIgnoreCase("S"));
			}catch(InputMismatchException e) {
				System.out.println("Insira um valor: ");
				key.next();
			}
		}
		
		
	}
}
