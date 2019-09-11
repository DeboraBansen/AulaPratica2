
public class Fibonacci {
	private int n;
	public void setN(int n){
		this.n=n;
	}
	public int getN(){
		return n;
	}
	public void fibonacciN(int n){
		int soma=1,t=0,t0=0,t1=1;
		
		System.out.print("0 1 ");
		for(int i=3;i<=n;i++){
			System.out.print(""+(t = t0 + t1)+" ");
			t0=t1;
			t1=t;
			soma+=t;
		}
		System.out.println("\na soma dos "+n+" primeiros termos é = "+soma);
	}

}
