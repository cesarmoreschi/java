public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		if(this.saldo >= 0) {
			this.saldo -= valor;
			conta.depositar(valor);	
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia >= 0) {
			this.agencia = agencia;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}