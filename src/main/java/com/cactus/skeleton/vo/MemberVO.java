package com.cactus.skeleton.vo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name="member")
public class MemberVO {

    @Id
    private String businessNum;
    private String memberName;
    private double remainDay;
    private double usedDay;
    private Date createDate;
    private Date updateDate;

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public double getRemainDay() {
        return remainDay;
    }

    public void setRemainDay(double remainDay) {
        this.remainDay = remainDay;
    }

    public double getUsedDay() {
        return usedDay;
    }

    public void setUsedDay(double usedDay) {
        this.usedDay = usedDay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
