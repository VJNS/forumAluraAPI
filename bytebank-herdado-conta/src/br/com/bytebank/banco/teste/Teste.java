package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaPoupanca(22,22);
        lista.add(cc2);

        int tamanho = lista.size();
        System.out.println(tamanho);

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33,11);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44,33);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Conta oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------------");

        for(Conta oRef: lista) {
            System.out.println(oRef);
        }
    }
}
