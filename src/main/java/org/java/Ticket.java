package org.java;

public class Ticket {
	private int km;
	private int age;
    private static final double PRICE_PER_KM = 0.21;

	public Ticket(int km, int age) throws Exception {
		setKm(km);
		setAge(age);
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) throws Exception {
        if (km <= 0) {
            throw new Exception("Km devono essere superiori a 0.");
        }
        this.km = km;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age <= 0 ) {
			throw new Exception("Eta deve essere superiore a 0");
		}
		this.age = age;
	}
	
    public double calculatePrice() {
        double standardPrice = getKm() * PRICE_PER_KM;
        double discount = 0;

        if (getAge() < 18) {
            discount = standardPrice * 0.20;
        } else if (getAge() > 65) {
            discount = standardPrice * 0.40;
        }

        return standardPrice - discount;
    }
	
	
	
	 
}
