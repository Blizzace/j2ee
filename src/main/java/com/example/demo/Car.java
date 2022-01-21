package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OneToOne;

@Entity
public class Car extends Vehicule {

	private int numberOfSeats; // Nombre de place
	
	//------------------Constructeurs------------------//

	//Champ à champ
	public Car(int numberOfSeats) {
		super();
		this.setnumberOfSeats(numberOfSeats);
		
	}
	
	//Par défaut
	public Car() {
		super();
		
	}

	//Champ à champ bis
	public Car(String plateNumber, String brand, int price,int numberOfSeats) {
		super(plateNumber,brand,price);
		this.setnumberOfSeats(numberOfSeats);
		
	}

	//------------------Constructeurs------------------//
	
	//------------------Getter/Setter------------------//

	public int getnumberOfSeats() {
		return this.numberOfSeats;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	//------------------Getter/Setter------------------//

	public String toString() {

        String desc = "\n\n" ;
        desc += "------------------Car------------------\n" ;
        desc += "Plaque  = " + super.getPlateNumber() + "\n" ;
        desc += "Marque  = " + super.getBrand() + "\n" ;
        desc += "Prix = " + super.getPrice() + "\n" ;
		desc += "Nombre de place = " + this.numberOfSeats + "\n" ;
        desc += "------------------Car------------------\n" ;
        return desc ;
    }
}
