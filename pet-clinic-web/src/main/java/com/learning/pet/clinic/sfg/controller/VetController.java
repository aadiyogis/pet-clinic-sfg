package com.learning.pet.clinic.sfg.controller;

import com.learning.pet.clinic.sfg.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * aditya created on 18/08/20
 */
@Controller
@RequestMapping("/vet")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String vetIndex(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
