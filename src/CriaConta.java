
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo +=100;
		
		System.out.println("Meu saldo é: " + primeiraConta.saldo);
	}

}
