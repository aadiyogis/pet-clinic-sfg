package com.learning.pet.clinic.sfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * aditya created on 18/08/20
 */
@Controller
@RequestMapping("/vet")
public class VetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String vetIndex() {
        return "vets/index";
    }
}
