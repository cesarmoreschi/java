
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primera: " + primeiraConta.saldo);
		Conta segundaConta = new Conta();
		
		segundaConta = primeiraConta;
		
		primeiraConta.saldo += 300;
		
		System.out.println("A segunda conta tem " + segundaConta.saldo + "reais");
		
	}
}
