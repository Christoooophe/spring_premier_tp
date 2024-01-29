package com.example.tpspring.thermometre;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
//@RequestMapping("/temperature")
public class TemperatureController {

    private TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService){
        this.temperatureService = temperatureService;
    }

    @GetMapping("/")
    public HashMap<String, Double> getTemperature(){
        return temperatureService.getTemperatureBase();
    }

    @GetMapping("/temperature")
    public HashMap<String, Double> getTemperatureWithCelsius(@RequestParam double celcius){
        return temperatureService.getTemperatureConverties(celcius);
    }

//    @PostMapping("temperature/convert")
//    public HashMap<String, Double> convertTemperature(@RequestBody String unit, @RequestBody double value){
//        return temperatureService.converter(unit, value);
//    }
}
