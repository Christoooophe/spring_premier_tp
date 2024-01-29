package com.example.tpspring.thermometre;

import lombok.Data;

@Data
public class Temperature {
    public String nameTemperature;
    public double temperature;

    public Temperature(String nameTemperature, double temperature) {
        this.nameTemperature = nameTemperature;
        this.temperature = temperature;
    }
    public Temperature(){

    }
    public String getNameTemperature(){
        return this.nameTemperature;
    }

    public void setNameTemperature(String newName){
        this.nameTemperature = newName;
    }

    public double getCelsius(){
        return this.temperature;
    }

    public void setCelsius(double nouvelleTempEnCelsius){
        this.temperature = nouvelleTempEnCelsius;
    }

    public double getKelvin(){
        return this.temperature + 273.15;
    }

    public void setKelvin(double nouvelleTempEnKelvin){
        this.temperature = nouvelleTempEnKelvin - 273.15;
    }

    public double getFahrenheit(){
        return this.temperature *1.8 +32;
    }
    public void setFahrenheit(double nouvelleTempEnFahrenheit){
        this.temperature = (nouvelleTempEnFahrenheit - 32 /1.8 );
    }
}
