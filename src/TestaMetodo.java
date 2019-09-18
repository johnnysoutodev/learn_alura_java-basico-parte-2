
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		
		conta.saldo = 100;
		conta.deposita(1000);
		
		System.out.println("Meu saldo é: " + conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(25);
		System.out.println(conseguiuRetirar);
		System.out.println("Meu novo saldo é: " + conta.saldo);
	}

}
