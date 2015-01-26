package lib;

public class MM1_lib {
	private double lamuda,mu,rho;

	public MM1_lib(double lamuda, double mu) {
		this.lamuda = lamuda;
		this.mu = mu;
		rho=lamuda/mu;
	}
	public double getRho(){
		return rho;
	}
	public double getLength(){
		return rho/(1-rho);
	}
	public double getQueue(){
		return rho*rho/(1-rho);
		//rho*rho=(Math.pow(rho,2))
	}
	public double getTime(){
		return 1/(1-rho)*1/mu;
	}
	public double getWtime(){
		return rho/(1-rho)*1/mu;
	}
} 
