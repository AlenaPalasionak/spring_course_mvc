package com.lenapalasionak.spring.mvc;


import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String Department;
//
//    private Map<String, String> deprtments;
//
//    public Employee() {
//        deprtments = new HashMap<>();
//        deprtments.put("IT", "Information Technology");
//        deprtments.put("HR", "Human Resources");
//        deprtments.put("Sales", "Sales");
//    }

    public Employee() {
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", Department='" + Department + '\'' +
                '}';
    }
}
