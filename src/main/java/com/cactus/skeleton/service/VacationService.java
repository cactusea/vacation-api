package com.cactus.skeleton.service;

import com.cactus.skeleton.repository.VacationRepository;
import com.cactus.skeleton.vo.VacationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class VacationService {

    @Autowired
    VacationRepository vacationRepository;

    public List<VacationVO> findByVacation(String bussinesUser){
        List<VacationVO> vacationList = new ArrayList<>();
        vacationRepository.findByVacation(bussinesUser).forEach(e->vacationList.add(e));
        return vacationList;
    }

}
