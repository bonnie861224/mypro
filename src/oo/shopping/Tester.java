package oo.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new Customer(2000));
		list.add(new SliverCustomer(8000));
		list.add(new SliverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new GoldenCustomer(10000));
		// for (int i = 0; i < list.size(); i++) {
		// Customer cus = list.get(i);
		for (Customer cus : list) {
			if (cus instanceof Customer && !(cus instanceof SliverCustomer) && !(cus instanceof GoldenCustomer)) {
				System.out.print("*");
				Customer customer =(Customer)cus;//轉型
			}
			cus.print();
		}
	}
}
