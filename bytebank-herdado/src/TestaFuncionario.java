
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		
		f1.setNome("Valter");
		f1.setCpf("43578479105");
		f1.setSalario(3000.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
	}

}
