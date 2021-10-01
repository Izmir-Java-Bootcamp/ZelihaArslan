package com.company.kodluyoruz.Homework3;

import java.time.LocalDate;

public class PersonalData {
    private String address;
    private long ssn;
    private LocalDate birthDate;

    public PersonalData(long ssn, LocalDate birthDate) {
        super();
        this.ssn = ssn;
        this.birthDate = birthDate;
    }

    public PersonalData(int year,int month,int day,long ssn) {
        super();
        this.birthDate=LocalDate.of(year,month,day);
        this.ssn=ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public long getSsn() {
        return ssn;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
