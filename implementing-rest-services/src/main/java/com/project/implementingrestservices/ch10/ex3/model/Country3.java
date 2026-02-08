package com.project.implementingrestservices.ch10.ex3.model;

public class Country3 {
    private String name;
    private int population;

    public static Country3 of(String name, int population) {
        Country3 country3 = new Country3();
        country3.setName(name);
        country3.setPopulation(population);
        return country3;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
