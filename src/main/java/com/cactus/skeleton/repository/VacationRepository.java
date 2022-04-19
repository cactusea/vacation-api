package com.cactus.skeleton.repository;

import com.cactus.skeleton.vo.VacationVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacationRepository {

    public List<VacationVO> findByVacation(String vacationUser);
}
