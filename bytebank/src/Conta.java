public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
}