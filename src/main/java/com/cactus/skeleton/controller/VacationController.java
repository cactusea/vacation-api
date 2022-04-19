package com.cactus.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/vacation")
public class VacationController {

    /**
     * 휴가 정보 조회
     * @return
     */
    @GetMapping("/info")
    public String getVacationInfo(){
        return "call api - getVacationInfo";
    }

    /**
     * 휴가 신청
     */
    @GetMapping("/update")
    public void updateVacationInfo(){

    }

    /**
     * 휴가 취소 신청
     */
    @GetMapping("/cancel")
    public String cancelVacationInfo(){
        return getVacationInfo();
    }
}
