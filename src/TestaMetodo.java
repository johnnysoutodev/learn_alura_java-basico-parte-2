
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		
		conta.saldo = 100;
		conta.deposita(1000);
		
		System.out.println("Meu saldo é: " + conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(25);
		System.out.println(conseguiuRetirar);
		System.out.println("Meu novo saldo é: " + conta.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		conta2.transfere(500, conta);
		System.out.println("Conta2 " + conta2.saldo);
		System.out.println("Conta " + conta.saldo);
	}

}
