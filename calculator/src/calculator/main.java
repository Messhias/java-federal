package calculator;

import java.util.Scanner;

class Calculator{
	
	// sum
	public static void add(int n1, int n2){
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
	
	//subract
	public static void subtract(int n1, int n2){
		int  result = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + result);
	}
	
	//multiply
	public static void multiply(int n1, int n2){
		int result = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + result);
	}
	
	//divide
	public static void divide(double n1, double n2){
		double result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + result);
	}
}


public class main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =0;
		int n2 = 0;
		double dn1 = 0;
		double dn2 = 0;
		Calculator calculator = new Calculator();
		
		sc = new Scanner(System.in);    
		
	    String entrada;
	    
	    System.out.println("Digite o primeiro numero: ");
	    entrada = sc.nextLine();
	    n1 = Integer.parseInt(entrada);
	    dn1 = Double.parseDouble(entrada);
	    
	    System.out.print("Digite o segundo número: ");
	    entrada = sc.nextLine();
	    n2 = Integer.parseInt(entrada);
	    dn2 = Double.parseDouble(entrada);
	    
	    Calculator.add(n1, n2);
	    Calculator.subtract(n1, n2);
	    Calculator.multiply(n1, n2);
	    
	}

}
