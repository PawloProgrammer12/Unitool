package com.wsb.controller;

import com.wsb.model.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class UnitoolController {

    @GetMapping("/index")
    public String index(Data data){
        return "index";
    }

    @PostMapping("/index")
    public String processIndex(@Valid Data data, Model model){
        Random r = new Random();
        model.addAttribute("rangeFrom", data.getRangeFrom());
        model.addAttribute("rangeTo", data.getRangeTo());
        model.addAttribute("randomNumber", r.nextInt(data.getRangeTo()) + data.getRangeFrom());
        return "index";
    }
}
