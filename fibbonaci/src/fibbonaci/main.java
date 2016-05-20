package fibbonaci;

class Fibonacci {
	 
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print the first 30 terms
        for (int i = 0; i < 30; i++) {
            System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
	}

}
