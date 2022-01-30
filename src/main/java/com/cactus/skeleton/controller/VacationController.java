package com.cactus.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationController {

    @GetMapping("/vacation/info")
    public String getVacationInfo(){
        return "call api - getVacationInfo";
    }
    
}
