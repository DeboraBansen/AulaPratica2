import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,i;
        int t;
        int t0=0;
        int t1=1;
        int soma=1;

        System.out.println("digite n:");
        n=in.nextInt();
        System.out.println(+t0+"\n"+t1);

        for(i=1;i<=n-2;i++){
            t=t0+t1;
            System.out.println(+t);
            t0=t1;
            t1=t;
            soma=soma+t;
        }
        System.out.println("soma="+soma);

    }
}
