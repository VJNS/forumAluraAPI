import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.ReajusteSalarial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteSalarialTest {

    private ReajusteSalarial reajuste;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.reajuste = new ReajusteSalarial();
        this.funcionario = new Funcionario(
                "João", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    void reajustaSalarioParaDesempenhoADesejarIgualA3PorCento() {
        reajuste.reajusteSalarial(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void reajustaSalarioParaDesempenhoBomIgualA10PorCento() {
        reajuste.reajusteSalarial(funcionario, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void reajustaSalarioParaDesempenhoOtimoIgualA20PorCento() {
        reajuste.reajusteSalarial(funcionario, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
