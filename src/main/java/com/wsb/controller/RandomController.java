package com.wsb.controller;

import com.wsb.model.RandomGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RandomController {

    @GetMapping("/randomGenerator")
    public String getRandomNumbers(final RandomGenerator randomGenerator, final Model model){
        model.addAttribute("randomNumber", new RandomGenerator());
        return "randomGenerator";
    }

    @PostMapping("/randomGenerator")
    public String generateRandomNumber(@Valid final RandomGenerator randomGenerator, final BindingResult bindingResult, final Model model){
        if (bindingResult.hasErrors()){
            return "randomGenerator";
        }

        int random = (int)(Math.random() * Integer.valueOf(randomGenerator.getRangeTo()) + Integer.valueOf(randomGenerator.getRangeFrom()));
        model.addAttribute("randomNumber", random);
        return "randomGenerator";
    }
}
