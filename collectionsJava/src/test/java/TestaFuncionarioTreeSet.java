import java.util.Set;
import java.util.TreeSet;

public class TestaFuncionarioTreeSet {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Thomas", 78);
        Funcionario f2 = new Funcionario("Silvia", 38);
        Funcionario f3 = new Funcionario("Walter", 57);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        funcionarios.forEach(funcionario -> System.out.println(funcionario.getNome()));

    }
}
