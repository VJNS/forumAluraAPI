
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1903.98 && salario <= 2826.65) {
			System.out.println("IR é de 7.5% e pode deduzir na declaração o valor de R$ 142.80");
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("IR é de 15% e pode deduzir R$ 354.80");
		} else if (salario >= 3751.06 && salario <= 4664.68) { 
			System.out.println("IR é de 22.5% e pode deduzir R$ 636.13");
		} else {
			System.out.println("IR é de 27.5% e pode deduzir R$ 869.36");
		}
	}
}
