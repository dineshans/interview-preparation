package com.app.SRP;


public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {

        Employee emp = new Employee(0);

        CalculateSalary salary = new CalculateSalary();
        PerfomenceReporting pr = new PerfomenceReporting();
        BioDataMatrix bio = new BioDataMatrix();

        System.out.println("Calculate Salary - " + salary.calculateEmployeeSalary(emp));
        System.out.println("Calculate Salary - " + pr.getPerformenceReport(emp));
        System.out.println("Calculate Salary - " + bio.getBioDataMatrix(emp));

    }
}
