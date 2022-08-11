
public class ContaPoupanca extends Conta {
	private static int  SEQUENCIAL_CP = 1;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.numero = SEQUENCIAL_CP++;
	}

	@Override
	public void impExtrato() {
		System.out.println("=== EXTRATO CONTA POUPANÇA ===");
		impInfo();
		
	}
}
