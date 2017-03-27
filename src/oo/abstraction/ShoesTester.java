package oo.abstraction;

public class ShoesTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes s1 = new Shoes("Nike", 23, "Red", "Plaid", "Sneakers", 2600);
		Shoes s2 = new Shoes("Puma", 24, "Yellow", "Striped", "Mules", 2200);
		Shoes s3 = new Shoes("Adidas", 22, "Blue", "Solid", "Flats", 2400);
		int n[] = new int[6];
		System.out.println(n[3]);
		Shoes[] shoes = { s1, s2, s3 };
		shoes[0].id = 123;
		shoes[1].id = 456;
		shoes[2].id = 789;
		System.out.println(shoes[0]);
		int i = 0;
		for (i = 0; i<3; i++) {
			System.out.println(shoes[i].brand);
		}
		System.out.println(i);
	}
}