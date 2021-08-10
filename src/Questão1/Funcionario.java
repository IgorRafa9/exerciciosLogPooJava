package Questão1;

public class Funcionario {
	private String nome;
	private double salario;
	private String dataAdmis;
	private String CPF;


public Funcionario() {
	this.nome="";
	this.salario=0.0f;
	this.dataAdmis="";
}

//Funcionário
public String getNome() {
	return nome;
}

public void setNomeFunc(String func) {
	this.nome=func;
}

void nomeFunc(String func) {
	this.nome=func;
}

//CPF
public String getCPF() {
	return CPF;
}

public void setCPF(String cpf) {
	this.CPF=cpf;
}

void CPF(String cpf) {
	this.CPF=cpf;
}


//Salário
public double getSalario() {
	return salario;
}

public void setSalario(double s) {
	this.salario=s;
}

void salario(double s) {
	this.salario=s;
}

public String getDataAdmis() {
	return dataAdmis;
  }
}