import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Fibonacci x=new Fibonacci();
		
		System.out.println("Digite o numero:");
		x.setN(in.nextInt());
		x.fibonacciN(x.getN());

	}

}
