import java.util.Scanner;
import java.lang.String;

public class Cpf {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("digite o numero do cpf");
        String n = in.nextLine();
        int i,j;
        int soma1=0;
        int soma2=0;
        int num=0;
        int dig1;
        int dig2;

        while (n.length() != 9) {
            System.out.println("numero invalido");
            System.out.println("digite o numero do cpf");
            n = in.nextLine();
            System.exit(0);
        }

        for(i=0,j=10;i<9;i++,j--){
            num=(int)((n.charAt(i)-48)*j);
            soma1=soma1+num;
        }

        int r1=soma1%11;
        if(r1<2){
            dig1=0;
        }else{
                dig1=11-r1;
        }

        for(i=0,j=11;i<9;i++,j--){
            num=(int)((n.charAt(i)-48)*j);
            soma2=soma2+num;
        }
        soma2=soma2+(dig1*2);
        int r2=soma2%11;
        if(r2<2){
            dig2=0;
        }else{
            dig2=11-r2;
        }
        //System.out.println(n.charAt(0));


        //System.out.println(dig2);
       System.out.println(""+n.charAt(0)+n.charAt(1)+n.charAt(2)+"."+n.charAt(3)+n.charAt(4)+n.charAt(5)+"."+n.charAt(6)+n.charAt(7)+n.charAt(8)+"-"+dig1+dig2);




    }
}
