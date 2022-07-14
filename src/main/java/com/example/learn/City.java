package com.example.learn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class City {
    public static String mayor;
    public static int population;
    public String street;

    public static String getMayor() {
        return mayor;
    }

    public static void setMayor(String mayor) {
        City.mayor = mayor;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        City.population = population;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void getDetails() {
        System.out.println(" City Mayor : "+mayor);
        System.out.println(" City Population : "+population);
        System.out.println(" City Street : "+street);
        System.out.println("Details showed on screen");
    }

    public City() {
        System.out.println("Default constructor is called, and object is created");
    }

    public City(String street, String mayor, int population) {
        this.street = street;
        this.mayor = mayor;
        this.population = population;

        System.out.println("Constructor is called, and object is created");
    }
}
