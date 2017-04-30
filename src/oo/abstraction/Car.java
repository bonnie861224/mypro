package oo.abstraction;

public class Car {
	int id;
	String brand;
	int cc;
	String name;
	String types;
	int status;
	float milage;

	public Car(String brand, String name, int cc) {
		this.brand = brand;
		this.cc = cc;
		this.name = name;
	}
    public Car(String brand, String name){
		this(brand,name,0);
    }
	public void setMilage(int n) {
		milage = n;
	}

	public float addMilage(int m) {
		if (m < 0) {
			m = -m;
		}
		milage = milage + m;
		return milage;
	}

	public void maintain() {
		status = 5;// 5=狀態保養中
	}// void表示不用回傳

}