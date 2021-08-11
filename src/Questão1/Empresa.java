package Questão1;

import java.util.Arrays;

public class Empresa {
	private String nome;
	private String CNPJ;
	private Empresa[] empresa;
	private String dep;

	public Empresa(String nome, String CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
	}

	public Empresa() {
		this.empresa = new Empresa[5];
	}

	public Empresa(int t) {
		this.empresa = new Empresa[t];
	}

	// Empresa
	public String getNomeEmpresa() {
		return nome;
	}

	public void setNomeEmpresa(String nome) {
		this.nome = nome;
	}

	// CNPJ
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cnpj) {
		this.CNPJ = cnpj;
	}
	
	//Departamento
	

	public void addEmpresa(Empresa e) {
		if (existeEmpresa(e)) {
			System.out.println("Essa empresa já existe");
		} else {
			boolean existe = false;
			for (int i = 0; i < empresa.length & !existe; i++) {
				if (empresa[i] == null) {
					empresa[i] = e;
					existe = true;
				}
			}
			if (existe) {
				System.out.println("Empresa salva.");
			}
		}
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public void listarEmpresa() {
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] != null) {
				System.out.println(empresa[i].toString());
			}
		}
	}

	public void buscarEmpresa(String nome) {
		boolean existe = false;
		for (int i = 0; i < empresa.length & !existe; i++) {
			if (empresa[i] != null && empresa[i].getNomeEmpresa().equalsIgnoreCase(nome)) {
				System.out.println(empresa[i].toString());
				existe = true;
			}
		}
		if (!existe) {
			System.out.println("Empresa não encontrada");
		}
	}

	@Override
	public String toString() {
		return "Nome da empresa: " + nome + "\nCNPJ: " + CNPJ;
	}
	
	public boolean existeDep(Empresa e) {
		boolean existe = false;
		for(int i = 0; i < empresa.length; i++) {
			if(empresa[i] != null && e.equals(empresa[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean existeEmpresa(Empresa e) {
		boolean existe = false;
		for (int i = 0; i < empresa.length; i++) {
			if (empresa[i] != null && e.equals(empresa[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(Empresa e) {
		if (this.getNomeEmpresa().trim().equalsIgnoreCase(e.getNomeEmpresa().trim())) {
			return true;
		}
		if (this.getCNPJ().trim().equalsIgnoreCase(e.getCNPJ().trim())) {
			return true;
		}
		return false;
	}

}
