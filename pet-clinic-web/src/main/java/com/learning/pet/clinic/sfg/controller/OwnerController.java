package com.learning.pet.clinic.sfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * aditya created on 18/08/20
 */
@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String owner() {
        return "owners/index";
    }
}
