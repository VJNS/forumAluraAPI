import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as Collections do Java", "Paulo Silveira");

        System.out.println(curso.getAulas());

        curso.adiciona(new Aula("Formação em Java e Orientação a Objetos", 25));
        curso.adiciona(new Aula("Certificação AWS Solutions Architect Solutions", 21));
        curso.adiciona(new Aula("Spring Framework", 32));

        System.out.println(curso.getAulas());

        List<Aula> aulas = new ArrayList<Aula>(curso.getAulas());

        Collections.sort(aulas);

        System.out.println(aulas);
        System.out.println(curso.getTempoTotal(curso));

        System.out.println(curso);

    }
}
