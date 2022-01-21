package com.example.demo;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
@DiscriminatorColumn(name="type_Vehicule", discriminatorType=DiscriminatorType.STRING)
public class Vehicule {

	private String plateNumber; // Plaque d'imatriculation
	private String brand; // Marque du véhicule
	private int price; // Prix du véhicule
	private boolean rented; // Savoir si le véhicule est loué ou non 
	private Dates dates; // Date de location du véhicule s'il est loué 

	//------------------Constructeurs------------------//

	//Champ à champ
	public Vehicule(String plateNumber, String brand, int price) {

		this.setPlateNumber(plateNumber);
		this.setBrand(brand);
		this.setPrice(price);
		
	}

	//Par défaut 
	public Vehicule() {

	}

	//------------------Constructeurs------------------//

	//------------------Getter/Setter------------------//
	
	@Id
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@OneToOne(mappedBy="vehicule" , cascade= CascadeType.ALL)
	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

	//------------------Getter/Setter------------------//
		
	public String toString() {

        String desc = "\n\n" ;
        desc += "------------------Vehicule------------------\n" ;
        desc += "Plaque  = " + this.plateNumber + "\n" ;
        desc += "Marque  = " + this.brand + "\n" ;
        desc += "Prix = " + this.price + "\n" ;
		desc += "Loué ? = " + this.rented + "\n" ;
		desc += "date = " + this.dates + "\n" ;
        desc += "------------------Vehicule------------------\n" ;
        return desc ;
    }

}
