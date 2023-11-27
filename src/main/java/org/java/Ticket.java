package org.java;

public class Ticket {
	private int km;
	private int age;
	
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
	
	
	
	 
}
