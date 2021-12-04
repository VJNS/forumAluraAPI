
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Jota");
		g1.setSalario(5000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setNome("Bruno");
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		d.setNome("Clara");
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}
