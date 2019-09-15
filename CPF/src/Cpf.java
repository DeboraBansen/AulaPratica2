import java.lang.String;
public class Cpf {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void digitoCpf(){
		int soma=0;
		int dig1=0,dig2=0;
		for(int i=0,j=10;i<9;i++,j--){
			soma+=Integer.parseInt(cpf.substring(i, i+1))*j;
		}
		if(soma%11<2){
			dig1=0;
		}else{
			dig1=11-(soma%11);
		}
		soma=0;
		for(int i=0,j=11;i<9;i++,j--){
			soma+=Integer.parseInt(cpf.substring(i, i+1))*j;
		}
		soma+=dig1*2;
		if(soma%11<2){
			dig2=0;
		}else{
			dig2=11-(soma%11);
		}
		for(int i=0;i<3;i++){
		    System.out.print(cpf.charAt(i));
		}System.out.print(".");
		for(int i=3;i<6;i++){
			System.out.print(cpf.charAt(i));
		}System.out.print(".");
		for(int i=6;i<9;i++){
			System.out.print(cpf.charAt(i));
		}System.out.print("-");
		System.out.print(dig1);
		System.out.print(dig2);
	}


}
