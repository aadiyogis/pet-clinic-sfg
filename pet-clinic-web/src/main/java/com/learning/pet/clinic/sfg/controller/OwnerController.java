package com.learning.pet.clinic.sfg.controller;

import com.learning.pet.clinic.sfg.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * aditya created on 18/08/20
 */
@Controller
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String owner(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
