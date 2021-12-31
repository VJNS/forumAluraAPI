import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for(int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fimPrimeiroFor = System.currentTimeMillis();

        long tempoDeExecucao = fimPrimeiroFor - inicio;

        System.out.println("Tempo Gasto - Primeiro For: " + tempoDeExecucao);

        for(Integer numero: numeros) {
            numeros.contains(numero);
        }

        long fimSegundoFor = System.currentTimeMillis();

        long tempoDeExecucaoFinal = fimSegundoFor - inicio;

        System.out.println("Tempo Gasto - Segundo For: " + tempoDeExecucaoFinal);

    }
}
