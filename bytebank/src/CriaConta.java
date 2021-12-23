
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		primeiraConta.saldo = 200.00;
		primeiraConta.agencia = 1000;
		primeiraConta.numero = 00001;
		primeiraConta.titular = "Daniel Silveira";
		
		segundaConta.saldo = 50.00;
		segundaConta.agencia = 1001;
		segundaConta.numero = 00002;
		segundaConta.titular = "Vilma Afonso";
		
		System.out.println(primeiraConta.saldo);
	}
}
