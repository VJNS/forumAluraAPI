import java.util.Collections;
import java.util.Set;

public class TestaCursoAluno {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as Collections do Java", "Paulo Silveira");

        curso.adiciona(new Aula("Formação em Java e Orientação a Objetos", 25));
        curso.adiciona(new Aula("Certificação AWS Solutions Architect Solutions", 21));
        curso.adiciona(new Aula("Spring Framework", 32));

        curso.matricula(new Aluno("Jorge Paulo Lemann", 340015));
        curso.matricula(new Aluno("Bill Gates", 340016));
        curso.matricula(new Aluno("Elon Musk", 340017));

        System.out.println(curso.buscaMatriculado(340095));
    }
}
