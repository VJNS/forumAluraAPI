
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		
		boolean autenticou = a.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no Sistema");
		}
	}

}
