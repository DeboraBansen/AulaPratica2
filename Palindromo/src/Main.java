import java.util.Scanner;
import java.lang.String;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Palindromo x=new Palindromo();
		
		System.out.println("Digite um numero de 5 digitos");
	    x.setX(in.next());
	   
	    if(x.tamPalindromo()){
	     if(x.ehPalindromo()){
	    	System.out.println("é um palindromo");
	    }else{
	    	System.out.println("nao e um palindromo");
	    }
	    }else{
	    	System.out.print("ERRO! Digite um numero de 5 digitos! ");
	    	
	    }
	    
	}

	
}
