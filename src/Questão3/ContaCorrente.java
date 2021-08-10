package Questão3;

public class ContaCorrente {
	private double saldo;
	private double saque;
	private double dep;
	private double taxa;
	
	public ContaCorrente() {
		this.dep=0;
		this.saque=0;
		this.saldo=0;
		this.taxa=0.005;
	}
	
	public double getDep() {
		return dep;
	}
	
	public void setDep(double d) {
		this.dep=d;
	}
	
	public double getSaq() {
		return saque;
	}
	
	public void setSaq(double s) {
		this.saque=s;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	void deposita(double q) {
		this.saldo+=q;
	}
	boolean sacar(double q) {
		if(this.saldo<q) {
			System.out.println("Valor insuficiente");
			return false;
		}else {
			this.saldo-=q;
			this.taxa*=q;
			System.out.println("Taxa: "+this.taxa);
			return true;
		}
	}
	void mostrarSaldo() {
		System.out.println("Saldo atual: "+this.getSaldo());
	}
}
