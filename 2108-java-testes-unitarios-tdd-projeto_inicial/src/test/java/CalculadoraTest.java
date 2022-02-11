import br.com.alura.tdd.modelo.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest implements Calculadora {

    @Test
    public void somarDoisNumerosPositivos() {
        CalculadoraTest calc = new CalculadoraTest();
        int soma = calc.soma(3, 7);

        Assertions.assertEquals(10, soma);
    }

}
