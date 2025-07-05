package com.custom.algo;

import com.common.Employee;

import java.util.*;


/*
* Find second-highest salary of employee without using any sorting algorithms
* Note - this is same as second-highest element from array
* */

public class FindSecondHighestSalaryOfEmployee {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "dinesh", "IT", Double.valueOf(50000)));
        list.add(new Employee(2, "Raj", "HR", Double.valueOf(20000)));
        list.add(new Employee(3, "Nayak", "IT", Double.valueOf(80000)));
        list.add(new Employee(4, "Kanak", "HR", Double.valueOf(40000)));
        list.add(new Employee(5, "Kanak", "HR", Double.valueOf(60000)));
        FindSecondHighestSalaryOfEmployee secondTestDemo = new FindSecondHighestSalaryOfEmployee();
        System.out.println(secondTestDemo.findSecondHighestSalary(list));
    }

    public Double findSecondHighestSalary(List<Employee> salaryList) {
        if (salaryList.isEmpty()) {
            return null;
        }
        double max = Integer.MIN_VALUE;
        double secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < salaryList.size(); i++) {
            if (salaryList.get(i).getSalary() > max) {
                secondMax = max;
                max = salaryList.get(i).getSalary();
            } else if (salaryList.get(i).getSalary() > secondMax
                    && salaryList.get(i).getSalary() < max) {
                secondMax = salaryList.get(i).getSalary();
            }
        }
        return secondMax;
    }
}
