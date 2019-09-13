import java.lang.String;
public class Palindromo {
	private String x;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	public boolean tamPalindromo(){
		if(x.length()==5){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean ehPalindromo(){
		
		int n=x.length();
		int cont=0;
		for(int i=0,j=n-1;i<n/2;i++,j--){
			if(x.charAt(i)==x.charAt(j)){
				cont++;
			}
		}if(cont==n/2){
			return true;
		}else
			return false;
	}
	
}

