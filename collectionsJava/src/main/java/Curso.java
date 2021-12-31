import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public int getTempoTotal(Curso curso) {
        return curso.getAulas().stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " +
                this.nome + ", tempo total: " + this.getTempoTotal(this) +
                ", aulas: " + this.aulas + " ]";
    }

    public boolean estaMatriculado(Object obj) {
        Aluno outro = (Aluno) obj;

        return this.getAlunos().contains(outro);
    }

    public Aluno buscaMatriculado(Integer matricula) {

        if(!(matriculaParaAluno.containsKey(matricula))) {
            throw new NoSuchElementException("Matrícula não encontrada!");
        }

        return this.matriculaParaAluno.get(matricula);
    }

}
