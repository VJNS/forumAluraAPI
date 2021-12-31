import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add("Java e Orientação a Objetos");
        cursos.add("Spring Framework");
        cursos.add("Formação AWS");

        cursos.sort(null);

        cursos.forEach( curso -> System.out.println(curso) );

    }

}
