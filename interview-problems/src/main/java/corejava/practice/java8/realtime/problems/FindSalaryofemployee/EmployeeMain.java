package corejava.practice.java8.realtime.problems.FindSalaryofemployee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) throws Exception{

        List<Employee> empList = new ArrayList<>();
        List<Employee> resultList = new ArrayList<>();

        Employee e1 = new Employee(1,"Dinesh", "IT", 20000);
        Employee e2 = new Employee(1,"Rakesh", "IT", 19000);
        Employee e3 = new Employee(1,"Omprakash", "IT", 17000);
        Employee e4 = new Employee(1,"Rajesh", "RCP", 25000);
        Employee e5 = new Employee(1,"Raju", "RCP", 22000);
        Employee e6 = new Employee(1,"Hanuman", "RCP", 21000);
        Employee e7 = new Employee(1,"Rajeshwari", "HR", 15000);
        Employee e8 = new Employee(1,"Avantika", "HR", 13000);
        Employee e9 = new Employee(1,"Radha", "HR", 11000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);

     //   TreeMap<Double, Employee> collect = empList.stream().collect(Collectors.toMap(Employee::getEmpSalary, Function.identity(), (a, b) -> a,
         //       () -> new TreeMap<>(Comparator::comparing(Employee::getEmpSalary)).

        // reversed())).values().skip(1).findFirst().orElse(null);


       // empList.stream().sorted(Comparator::comparingDouble(Employee::getEmpSalary)
        //.reverse())

        //.skip(1).findFIrst();

        // Find max salary
        Map<String,Double> map = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)), emp -> emp.get().getEmpSalary())));

       // map.entrySet().forEach(System.out::println);

        // Find second highest salary

        List<Employee> sortesdList = empList.stream().
                sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).collect(Collectors.toList());

        System.out.println(sortesdList.get(1).getEmpSalary());
    }
}
