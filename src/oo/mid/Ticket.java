package oo.mid;

import java.util.ArrayList;

public class Ticket {

	private static final ArrayList<Integer> a = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		float price = 1000;
		float price1 = 1500;

		ArrayList<Integer> a = new ArrayList();
		a.add(012);
		a.add(456);
		a.add(789);
		a.set(0, 123);
		ArrayList<String> b = new ArrayList();
		b.add("Superman");
		b.add("Spiderman");
		b.add("Batman");
		b.set(1, "Thor");
		ArrayList<Float> c = new ArrayList();
		c.add(price);
		c.add(price);
		c.add(price);
		c.set(2, price1);

		System.out.print(a.get(0));
		System.out.print(b.get(1));
		System.out.print(c.get(2));
	}
}