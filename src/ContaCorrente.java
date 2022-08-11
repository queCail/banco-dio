
public class ContaCorrente extends Conta {
	private static int  SEQUENCIAL_CC = 1;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.numero = SEQUENCIAL_CC++;
	}

	@Override
	public void impExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		impInfo();
	}

}
