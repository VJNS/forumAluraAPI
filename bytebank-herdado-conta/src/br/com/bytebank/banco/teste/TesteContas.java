package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		List<Conta> lista = new ArrayList<>();

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		cc1.deposita(333.0);
		lista.add(cc1);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setCliente(clienteCC2);
		cc2.deposita(444.0);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setCliente(clienteCC3);
		cc3.deposita(111.0);
		lista.add(cc3);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setCliente(clienteCC4);
		cc4.deposita(222.0);
		lista.add(cc4);

		lista.forEach( (conta) ->
				System.out.println( (conta + ", " + conta.getTitular().getNome())));

		System.out.println("------------");

		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		};

		lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );

		lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()) );
	}
}
