package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Country {
    public static String country;
    public static int population;
    public static String minister;

    @Autowired
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Country.country = country;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Country.population = population;
    }

    public static String getMinister() {
        return minister;
    }

    public static void setMinister(String minister) {
        Country.minister = minister;
    }

    public Country(City city) {
        this.city = city;

        System.out.println("Default constructor of Country is called");
    }

    public void getDisplay() {
        city.getDetails();
        System.out.println("Country: "+country+" has population of "+population+" people and minister is "+minister);
        System.out.println("Country: "+country+" has city Agra and mayor is "+City.mayor+" and population is "+City.population+
                " and famous street is "+city.getStreet());
    }
}
