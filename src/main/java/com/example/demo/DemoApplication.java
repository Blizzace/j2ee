package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PersonRepository personRepository,DatesRepository datesRepository) {
		return (args) -> {
			Person tintin = new Person();
			tintin.setAge(20);
			tintin.setNom("Tintin");
			
			Person jean = new Person();
			jean.setAge(23);
			jean.setNom("Jean");
			
			 String pattern = "yyyy-MM-dd";
		     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		     Date datedebut = simpleDateFormat.parse("2021-04-09");
		     Date datefin = simpleDateFormat.parse("2022-09-12");		     
		     Date datedebut2 = simpleDateFormat.parse("2020-07-30");
		     Date datefin2 = simpleDateFormat.parse("2021-12-31");
			    
			Dates date=new Dates();		
			date.setBegin(datedebut);
			date.setEnd(datefin);
		
			Dates date2=new Dates();
			date2.setBegin(datedebut2);
			date2.setEnd(datefin2);
			
		
			Van van_1 = new Van();
			van_1.setPlateNumber("DC425AB");
			van_1.setRented(false);
			van_1.setBrand("Porsche");
			van_1.setPrice(500000);
			van_1.setMaxWeight(500);
			
			Car car_1 = new Car();
			car_1.setPlateNumber("AC329DC");
			car_1.setRented(false);
			car_1.setBrand("Peugeot");
			car_1.setPrice(15000);
			car_1.setnumberOfSeats(4);
			
			jean.addDates(date);
			tintin.addDates(date2);
			van_1.setDates(date2);
			car_1.setDates(date);
			date.setPerson(jean);
			date2.setPerson(tintin);
			date2.setVehicule(van_1);
			date.setVehicule(car_1);
			datesRepository.save(date);
			datesRepository.save(date2);

		};
	}
	


}