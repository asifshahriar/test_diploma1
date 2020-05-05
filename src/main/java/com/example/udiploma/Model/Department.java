package com.example.udiploma.Model;

public class Department {
    private String department, seat;

    public Department() {
    }

    public Department(String department, String seat) {
        this.department = department;
        this.seat = seat;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
