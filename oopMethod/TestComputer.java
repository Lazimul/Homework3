package oopMethod;

public class TestComputer {

	public static void main(String[] args) {
		Apple c1=new Apple("Mac" , "air");
		Apple c2=new Apple ("Macbook", "pro");
		c1.start();
		c1.stop();
		c1.volume();
		c1.touhpad();
		c1.computerPrice(500);
		c1.computerPrice(500, 300);
		
		c2.start();
		c2.stop();
		c2.volume();
		c2.touhpad();
		c2.computerPrice(300);
		c2.computerPrice(600, 400);
		
	}

}
