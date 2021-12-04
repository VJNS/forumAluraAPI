package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Co:nt:ai:n;s"; //objeto literal			
	
		String[] splitString = nome.split(" ");
		
		for(String i: splitString) {
			System.out.println(i);
		}
	}

}
