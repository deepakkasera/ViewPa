package com.example.deepak.viewpager2.model;

/**
 * Created by deepak on 8/4/17.
 */

public class PlacementRecords {
    String name;
    int year;
    int numberOfStudents;
    float CGPA;
    int salary;

    public PlacementRecords(String name, int year, int numberOfStudents, float CGPA, int salary) {
        this.name = name;
        this.year = year;
        this.numberOfStudents = numberOfStudents;
        this.CGPA = CGPA;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public float getCGPA() {
        return CGPA;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
