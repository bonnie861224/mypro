package oo.shopping;

public class SliverCustomer extends Customer {
	int amount;
	public SliverCustomer(int amount) {
		super(amount);
		this.amount=amount;
	}
	public void print(){
		System.out.println("折扣後"+Math.round(amount*0.9));
	}
}
