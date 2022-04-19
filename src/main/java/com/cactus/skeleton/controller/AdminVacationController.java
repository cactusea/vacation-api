package com.cactus.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 관리자용 휴가 API
 * - 승인, 취소
 */
@RestController(value = "/admin")
public class AdminVacationController {

    @GetMapping
    public boolean isSuperUser(){
        return true;
    }

    /**
     * 관리자 - 휴가 취소
     */
    @GetMapping
    public void adminCancelVacation(){

    }

    /**
     * 휴가 승인
     */
    @GetMapping
    public void acceptVacation(){

    }
}
