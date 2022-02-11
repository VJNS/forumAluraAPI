package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public class ReajusteSalarial {

    private BigDecimal reajuste;

    public void reajusteSalarial(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
        funcionario.reajusteSalarial(reajuste);
    }
}
