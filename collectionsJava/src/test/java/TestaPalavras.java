import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.comparing;

public class TestaPalavras {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("Formação Java");
        palavras.add("Escola");
        palavras.add("Java 8 - Modernização");

        palavras.sort(comparing(String::length));

        palavras.forEach(System.out::println);

    }

}
