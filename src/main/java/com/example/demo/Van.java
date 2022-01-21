package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{

	private int maxWeight; 
	
	public Van(int maxWeight) {
		super();
		this.setMaxWeight(maxWeight);
		
	}

	public Van(String plateNumber, String brand, int price,int maxWeight) {
		super(plateNumber,brand,price);
		this.setMaxWeight(maxWeight);
		
	}

	public Van() {
		super();
		
	}


	
	public int getMaxWeight() {
		return this.maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	
	public String toString() {

        String desc = "\n" ;
        desc += "Plaque  = " + super.getPlateNumber() + "\n" ;
        desc += "Marque  = " + super.getBrand() + "\n" ;
        desc += "Prix = " + super.getPrice() + "\n" ;
		desc += "Taille max = " + this.maxWeight + "\n" ;
        return desc ;
    }
	
}
