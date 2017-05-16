package oo.shopping;

public class GoldenCustomer extends Customer {
	int amount;

	public GoldenCustomer(int amount) {
		super(amount);
		this.amount = amount;
	}

	public void print() {
		System.out.println("金級會員" + "\t" + "折扣後:" + Math.round(amount * 0.9) + "還原金:" + Math.round(amount * 0.05));
	}
}
