package com.company.kodluyoruz.Homework3;

public class Course {
    private String name;
    private int capacity=40;
    private Student[] students=new Student[capacity];
    private int numberOfStudent;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public boolean addStudent(Student student) {
        if (numberOfStudent < capacity) {
            for (int i = 0; i < numberOfStudent; i++) {
                if (student.equals(students[i])) {
                    return false;
                }
            }
            students[numberOfStudent] = student;
            numberOfStudent++;
            return true;
        }
        return false;
    }

    public boolean dropStudent(Student student) {
        int a = -1;
        Student[] students1 = new Student[this.capacity];
        for (int i = 0; i < numberOfStudent; i++) {
            if (student.equals(students[i])) {
                students[i] = null;
                while (i < numberOfStudent) {
                    students[i] = students[i + 1];
                    i++;
                }
                numberOfStudent--;
                return true;
            }
        }
        return false;
    }
    public void increaseCapacity() {
        this.capacity+=5;
    }
    public Student getBestStudent() {
        double studentMaxGpa=0;
        int MaxGpa=0;
        for(int i=1;i<numberOfStudent;i++) {
            if (students[i].getGpa() > studentMaxGpa) {
                studentMaxGpa = students[i].getGpa();
                MaxGpa = i;
            }
        }
        return students[MaxGpa];
    }
    public Student getYoungestStudent(){
        Student youngestStudent= null;
        for(int i=0;i<numberOfStudent-1;i++) {
            if(students[i].getPd().getBirthDate().isAfter(students[i+1].getPd().getBirthDate())) { //tarih karşılaştırılıyor:isAfter
                youngestStudent=students[i];
            }

        }

        return youngestStudent;
    }
    public void clear() {
        for(int i = 0; i < numberOfStudent; i++){
            students[i] = null;
        }
    }
    public void list() {
        String result="";
        for(int i=0;i<numberOfStudent;i++){
            result+=students[i]+"\n";
        }
        System.out.println(result);
    }


    @Override
    public String toString() {
        return "Course name=" + this.name +
                ", capacity=" + this.capacity+
                ", numberOfStudent=" + this.numberOfStudent;

    }
}
