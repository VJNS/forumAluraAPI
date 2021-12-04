package br.com.bytebank.banco.modelo;

/**
 * 
 * Classe que representa a moldura de uma Conta
 * 
 * @author Valter Silva
 * @version 1.0
 *
 */

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;

/**
 * 	
 * Construtor para inicializar o objeto Conta a partir da agencia e do numero
 * 
 * @param agencia
 * @param numero
 */
	
	public Conta(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		
		Conta.total++;
		
		System.out.println("Criando uma Conta");
		
	}
	
	public abstract void deposita(double valor);

/**
 * 
 * Valor precisa ser menor ou igual ao saldo
 * 
 * @param valor
 * @throws SaldoInsuficienteException
 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);		
		destino.deposita(valor);

	}
	
	public double getSaldo() {
		
		return this.saldo;
		
	}	
	
	public int getAgencia() {
		
		return this.agencia;
		
	}
	
	public void setAgencia(int agencia) {
		
		this.agencia = agencia;
		
	}
	
	public int getNumero() {
		
		return this.numero;
		
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
		
	}
	
	public Cliente getTitular() {
		
		return this.titular;
		
	}
	
	public void setCliente(Cliente titular) {
		
		this.titular = titular;
		
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N�mero: " + this.numero + ", Ag�ncia: " + this.agencia;
	}	
	
}