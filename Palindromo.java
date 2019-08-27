import java.util.Scanner;
import java.lang.String;
public class Palindromo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        int m = 0;
        //do {
        System.out.println("digite um numero de 5 digitos");
        String n = in.nextLine();

        while (n.length() != 5) {
            System.out.println("numero invalido");
            System.out.println("digite um numero de 5 digitos");
            n = in.nextLine();
            System.exit(0);
        }

        for (i = 0, j = 4; i < 2; i++, j--) {
            if (n.charAt(i) == n.charAt(j)) {
                m++;
            }
        }
        if (m == 2) {
            System.out.println("eh palindromo");
        } else {
            System.out.println("nao eh palindromo");
        }
    }
}


