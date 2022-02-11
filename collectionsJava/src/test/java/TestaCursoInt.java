import java.util.*;
import java.util.stream.Collectors;

public class TestaCursoInt {

    public static void main(String[] args) {

        List<CursoInt> cursos = new ArrayList<CursoInt>();

        cursos.add(new CursoInt("Python", 45));
        cursos.add(new CursoInt("JavaScript", 150));
        cursos.add(new CursoInt("Java 8", 113));
        cursos.add(new CursoInt("C", 55));

        List<CursoInt> collect = cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
