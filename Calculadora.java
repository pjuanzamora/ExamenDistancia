package examen;

public class Calculadora {
	private int num1;
	private int num2;
	private int resultado;
	
	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		resultado = 0;
	}
	
	public void calculosComplejos() {
		System.out.println("Ejecutando calculos complejos");
		
		if (num1 < 20 && num1 > 30) {
			resultado = num1 + num2;
			System.out.println("Los calculos son: " + (num1 + num2));
		}else {
			if (num2 >= 0 || num2 <= 10) {
				resultado = num1 - num2;
				System.out.println("Los calculos son: " + (num1 - num2));
			}else {
				resultado = num1 * num2;
				System.out.println("Los calculos son: " + (num1 * num2));
			}
		}
		
		System.out.println("Todos los cálculos se han realizado");
	}
	
	public int getResultado() {
		return resultado;
	}
	
}
