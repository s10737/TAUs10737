package zad1ab;

public class Calculator {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public int multi(int a, int b){
		return a*b;
	}
	
	public int div(int a, int b)  {	
		try {
			return a/b;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	
	public boolean greater(int a, int b){
		if (a>b) return true;
		else return false;
	}
}
