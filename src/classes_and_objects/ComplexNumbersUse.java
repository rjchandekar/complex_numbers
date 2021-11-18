package classes_and_objects;

public class ComplexNumbersUse {
	
	public static void main(String [] args) {
		ComplexNumbers c1 = new ComplexNumbers(2, 6);
		c1.print();
		
		ComplexNumbers c2 = new ComplexNumbers(-6, 8);
		
		c1.plus(c2);
		c1.print();
		System.out.println(c1.getImaginary());
		
		c2.multiply(c1);
		c2.setImaginary(34);
		c2.print();
		
	}

}
