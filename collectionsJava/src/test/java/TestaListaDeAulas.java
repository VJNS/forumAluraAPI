import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

    public static void main(String[] args) {

        Aula a1 = new Aula("Lógica de Programação", 540);
        Aula a2 = new Aula("POO - Java", 360);
        Aula a3 = new Aula("Estrutura de Dados", 720);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
