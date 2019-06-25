package com.wsb.controller;

import com.wsb.model.CurrencyConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CurrencyController {

    @GetMapping("/currencyConverter")
    public String getCurrencyConverter(final CurrencyConverter currencyConverter, final Model model){
        model.addAttribute("dollar", new CurrencyConverter());
        return "currencyConverter";
    }

    @PostMapping("/currencyConverter")
    public String convertCurrency(@Valid final CurrencyConverter currencyConverter, final BindingResult bindingResult, final Model model){
        if (bindingResult.hasErrors()){
            return "currencyConverter";
        }

        double dollar = (Double.valueOf(currencyConverter.getEuro()) * 1.13902);
        model.addAttribute("dollar", dollar);
        return "currencyConverter";
    }
}
