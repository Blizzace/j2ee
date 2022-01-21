package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{

	private int maxWeight; // Taille max du van
	
	//------------------Constructeurs------------------//

	//Champ à champ
	public Van(int maxWeight) {
		super();
		this.setMaxWeight(maxWeight);
		
	}

	//Champ à champ bis
	public Van(String plateNumber, String brand, int price,int maxWeight) {
		super(plateNumber,brand,price);
		this.setMaxWeight(maxWeight);
		
	}
	
	//Par défaut 
	public Van() {
		super();
		
	}

	//------------------Constructeurs------------------//

	//------------------Getter/Setter------------------//
	
	public int getMaxWeight() {
		return this.maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	//------------------Getter/Setter------------------//
	
	public String toString() {

        String desc = "\n\n" ;
        desc += "------------------van------------------\n" ;
        desc += "Plaque  = " + super.getPlateNumber() + "\n" ;
        desc += "Marque  = " + super.getBrand() + "\n" ;
        desc += "Prix = " + super.getPrice() + "\n" ;
		desc += "Taille max = " + this.maxWeight + "\n" ;
        desc += "------------------van------------------\n" ;
        return desc ;
    }
	
}
