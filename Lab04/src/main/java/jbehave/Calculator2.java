package jbehave;

public class Calculator2 {
	
	private double a;
	private double b;
	
	public double add(){
		return a+b;
	}
	
	public double sub(){
		return a-b;
	}
	
	public double multi(){
		return a*b;
	}
	
	public double div()  {
		if (Double.isInfinite(a/b) == true) return 0;
		else return a/b;
	}
	
	public boolean greater(){
		if (a>b) return true;
		else return false;		
	}
	
	//getters and setters
		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

}
