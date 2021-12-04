package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(0157,200578);
		primeiraConta.deposita(2000);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(0450,378992);
		primeiraConta.transfere(500, segundaConta);
		
		System.out.println(primeiraConta.getSaldo());
		System.out.println(segundaConta.getSaldo());
		
		primeiraConta.getTitular().setNome("Valter");
		
		System.out.println(primeiraConta.getTitular().getNome());
	
		System.out.println(Conta.getTotal());
	}
	
}