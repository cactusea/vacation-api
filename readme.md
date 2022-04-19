# vacation-api
- 휴가 신청 시스템 API
- spring cloud config, eureka 적용

---
1. CREATE TABLE
```sql
-- member table
CREATE TABLE IF NOT EXISTS MEMBER(
    businessNum VARCHAR(200) NOT NULL,
    memberName VARCHAR(100),
    remainDay DOUBLE ,
    usedDay DOUBLE,
    createDate DATE ,
    updateDate DATE
);

--vacation info table
CREATE TABLE IF NOT EXISTS VACATION(
    id INT NOT NULL AUTO_INCREMENT,
    vacationUser VARCHAR(20) NOT NULL,
    vacationType VARCHAR(100),
    vacationTime VARCHAR(100),
    createdDate DATE,
    startDate DATE,
    endDate DATE,
    comment VARCHAR(300),
    subWorker VARCHAR(100),
);
```
---

- 있어야 할 것
  - 사용자 확인
  - 휴가 신청
    - 날짜, 휴가 종류, 업무 대체자, 승인 요청자 
  - 휴가 취소
  - 휴가 승인
  - 휴가 조회 (남은 일수 / 신청 내역)
  - 테스트 및 샘플 코드 작성 

- 해야할 것  
  -[x] 기본 틀 만들기  
  -[ ] JPA 기능 연동  
  -[ ] ㅇㅅㅇ 