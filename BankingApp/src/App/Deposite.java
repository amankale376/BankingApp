package App;

public class Deposite {
 double total =0;
 double prev=0;
 
 
	public void depos(double x) {
		this.total= total+x;
		System.out.println("Amount deposited!!");
		this.prev=x;
	}

	public void width(double x) {
		if(total==0)
			System.out.println("Your account have 0 Balance please deposite first.");
		else
		{
			total=total-x;
			System.out.println("Amount widthdrawn!!");
			this.prev= (-x);
		}
	}
	
	public double balance() {
		double x = this.total;
		return x;
	}
	 
	public void previousbalance() {
		if(prev>0) {
			System.out.println("You Deposited: "+prev );
		}else
			System.out.println("You Widthdrawn: "+(-prev));
	}
	
}
