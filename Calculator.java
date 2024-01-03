
public class Calculator {
	
	
	
	//compile time  Polymorphism
	//method overloading
	
	
	
	public  int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		
		
		System.out.println(calc1.add(12.5, 15.999));
		System.out.println(calc2.add(45, 56));
	}

}
