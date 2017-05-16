package oo.shopping;

public class Customer {
	int amount;
	public Customer(int amount){
		this.amount=amount;
	}
	public void print(){
		System.out.println("原價"+amount);
	}
}
