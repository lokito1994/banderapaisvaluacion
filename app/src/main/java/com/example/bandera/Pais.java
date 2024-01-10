package com.example.bandera;

public class Pais{
    private final String name;
    private final String capital;
    private final String flagURL;

    public Pais(String name, String capital, String flagURL) {
        this.name = name;
        this.capital = capital;
        this.flagURL = flagURL;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlagURL() {
        return flagURL;
    }
}
