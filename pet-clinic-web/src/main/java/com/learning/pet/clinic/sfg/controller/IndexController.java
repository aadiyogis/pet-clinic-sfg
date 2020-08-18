package com.learning.pet.clinic.sfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * aditya created on 18/08/20
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndex() {
        return "index";
    }
}
