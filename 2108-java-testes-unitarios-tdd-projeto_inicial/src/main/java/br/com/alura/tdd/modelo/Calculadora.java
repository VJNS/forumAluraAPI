package br.com.alura.tdd.modelo;

public interface Calculadora {

    default int soma(int a, int b) {
        return a + b;
    }

}
