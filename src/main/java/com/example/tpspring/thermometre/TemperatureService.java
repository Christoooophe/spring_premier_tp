package com.example.tpspring.thermometre;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TemperatureService {
    public Temperature celcius = new Temperature("celcius", 0.0);
    public Temperature fahrenheit = new Temperature("fahrenheit", 0.0);
    public Temperature kelvin = new Temperature("kelvin", 0.0);

    public HashMap<String, Double> getTemperatureBase(){
        HashMap<String, Double> listeTemperatures = new HashMap<>();
        listeTemperatures.put("celcius", 0.0);
        listeTemperatures.put("fahrenheit", 32.0);
        listeTemperatures.put("kelvin", 273.15);

        return listeTemperatures;
    }

    public HashMap<String, Double> getTemperatureConverties(double temp){
        HashMap<String, Double> listeTemperatures = new HashMap<>();
        celcius.setTemperature(temp);
        fahrenheit.setTemperature(temp);
        kelvin.setTemperature(temp);
        listeTemperatures.put(celcius.getNameTemperature(), celcius.getTemperature());
        listeTemperatures.put(fahrenheit.getNameTemperature(), fahrenheit.getFahrenheit());
        listeTemperatures.put(kelvin.getNameTemperature(), kelvin.getKelvin());

        return listeTemperatures;
    }

}
