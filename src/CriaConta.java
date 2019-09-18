
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo +=100;
		
		System.out.println("Meu saldo é: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("Meu saldo é: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		} else {
			System.out.println("sao contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
