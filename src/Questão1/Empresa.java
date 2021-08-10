package Questão1;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String CNPJ;
	private ArrayList<Empresa>emp;
	
	public Empresa() {
		this.nome="";
		this.CNPJ="";
		this.emp= new ArrayList<>();
	}
	
	
	//Empresa
	public String getNomeEmpresa() {
		return nome;
	}
	
	public void setNomeEmpresa(String n) {
		this.nome=n;
	}
	
	void nome(String name) {
		this.nome=name;
	}
	
	//CNPJ
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cnpj) {
		this.CNPJ=cnpj;
	}
	
	void CNPJ(String cnpj) {
		this.CNPJ=cnpj;
	}
	
	//Mostrar informações da empresa
	void mostrarInfo() {
		System.out.println("Nome da Empresa: "+this.getNomeEmpresa()+"\n"
				+"CNPJ: "+this.getCNPJ());
	}
}
