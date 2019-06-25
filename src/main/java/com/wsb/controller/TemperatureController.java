package com.wsb.controller;

import com.wsb.model.TemperatureConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TemperatureController {

    @GetMapping("/temperatureConverter")
    public String getTemperatureConverter(final TemperatureConverter temperatureConverter, final Model model){
        model.addAttribute("fahrenheit", new TemperatureConverter());
        return "temperatureConverter";
    }

    @PostMapping("/temperatureConverter")
    public String convertTemperature(@Valid final TemperatureConverter temperatureConverter, final BindingResult bindingResult, final Model model){
        if (bindingResult.hasErrors()){
            return "temperatureConverter";
        }

        double fahrenheit = (Double.valueOf(temperatureConverter.getCelsius()) * 1.8) + 32;
        model.addAttribute("fahrenheit", fahrenheit);
        return "temperatureConverter";
    }
}
