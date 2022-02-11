public class CursoInt {

    private String nome;
    private int alunos;

    public CursoInt(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "[Nome = " + this.nome + ", Quantidade de Alunos = " + this.alunos + "]";
    }
}
