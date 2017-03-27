package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("TOTOTA", 1800, "ALTIS");
		Car c2 = new Car("HONDA", 2000, "ACCORD");
		Car c3 = new Car("TOYOTA", 2000, "WISH");
		int[] n = new int[5];
		// n[0]=0
		// n[1]=0
		// n[2]=0
		// n[3]=0
		System.out.println(n[2]);
		Car[] cars = { c1, c2, c3 };
		cars[0].id = 302;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[1]);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		System.out.println(i);
	}
	class AA {

	}

	AA a = new AA();
}