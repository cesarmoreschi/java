
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.saldo);
		
		boolean conseguiuSacar = conta.sacar(101.00);
		
		if(conseguiuSacar) {
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insulficiente!");
		}
		
		
	}
}
