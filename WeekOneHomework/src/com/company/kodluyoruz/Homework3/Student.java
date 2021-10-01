package com.company.kodluyoruz.Homework3;

public class Student {
    private String name;
    private long id;
    private double gpa;
    private PersonalData pd;


    public Student(String name, long id, double gpa,PersonalData pd) {
        super();
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.pd=pd;

        System.out.println("Name: "+getName());
    }


    public PersonalData getPd() {
        return pd;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student: name='" + this.name +
                ", id=" +this.id+
                ", gpa=" + this.gpa +
                ", pd=" + this.pd +
                ", Address=" +this.pd.getAddress()+
                ", Birthday=" +this.pd.getBirthDate()+
                ",Ssn=" +this.pd.getSsn();
    }

}
