package corejava.practice.java8.realtime.problems.FindSalaryofemployee;

import java.util.Objects;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private double empSalary;

    public Employee(int empId, String empName, String department, double empSalary){
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.empSalary = empSalary;
     }


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(empSalary, employee.empSalary) == 0 && Objects.equals(empName, employee.empName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, department, empSalary);
    }
}
