package in.ganesh.test;


import in.ganesh.model.EmpDb;
import in.ganesh.model.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static in.ganesh.model.EmpDb.getAllEmp;

public class Test4 {
    public static void main(String[] args) {
        List<Employee> employees = getAllEmp();
        List<Employee> employeeList = employees.stream()
                .filter(emp -> emp.getSalary() > 30000)
                .filter(emp -> emp.getName().startsWith("a"))
                .filter(emp -> emp.getAge() > 30 && emp.getAge() < 35)
                .toList();
        employeeList.forEach(System.out::println);
    }
}
