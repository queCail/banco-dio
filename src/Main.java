
public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Caique");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		cc.transferir(20, cp);
		
		cc.impExtrato();
		cp.impExtrato();
		
	}
}
