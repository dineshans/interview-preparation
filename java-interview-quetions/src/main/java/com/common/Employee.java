package com.common;

public class Employee {
        int id;

        String name;

        String department;

        Double salary;

        public Employee(int id, String name,  String department, Double salary)
        {
            this.id = id;
            this.name = name;
           // this.age = age;
           // this.gender = gender;
            this.department = department;
           // this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }

        public int getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }

        public String getDepartment()
        {
            return department;
        }

        public double getSalary()
        {
            return salary;
        }

        @Override
        public String toString()
        {
            return "Id : "+id
                    +", Name : "+name
                    +", Department : "+department
                    +", Salary : "+salary;
        }
    }
