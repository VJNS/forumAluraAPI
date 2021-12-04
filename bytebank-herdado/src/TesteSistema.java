
public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel a = new Gerente();
		a.setSenha(2222);

		Autenticavel adm = new Administrador();
		adm.setSenha(1111);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(a);
		si.autentica(adm);	
		
	}
}
