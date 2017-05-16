package oo.shopping;

import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer(6000);
		Customer c2 = new Customer(2000);
		c1.print();
		c2.print();
		SliverCustomer s1 = new SliverCustomer(8000);
		SliverCustomer s2 = new SliverCustomer(10000);
		s1.print();
		s2.print();
		GoldenCustomer g1 = new GoldenCustomer(30000);
		GoldenCustomer g2 = new GoldenCustomer(10000);
		g1.print();
		g2.print();
	}

}
