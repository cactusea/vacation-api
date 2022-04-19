package com.cactus.skeleton.vo;

import java.util.Date;

public class VacationVO {

    private String vacationType;
    private String vacationUser;
    private String vacationTime;
    private Date createdDate;
    private Date startDate;
    private Date endDate;
    private String comment;
    private String subWorker;

    public String getVacationType() {
        return vacationType;
    }

    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }

    public String getVacationUser() {
        return vacationUser;
    }

    public void setVacationUser(String vacationUser) {
        this.vacationUser = vacationUser;
    }

    public String getVacationTime() {
        return vacationTime;
    }

    public void setVacationTime(String vacationTime) {
        this.vacationTime = vacationTime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubWorker() {
        return subWorker;
    }

    public void setSubWorker(String subWorker) {
        this.subWorker = subWorker;
    }
}
