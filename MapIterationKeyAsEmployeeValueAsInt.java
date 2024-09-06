package in.ganesh.test;

import java.util.*;
import java.util.stream.Stream;

class Employee{
    private Integer empId;
    private String empName;

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee() {

    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + '}';
    }
}
public class MapIterationKeyAsEmployeeValueAsInt {
    public static void main(String[] args) {

        // empid,empName empId=100,
        //output empName="abc";
        List<Employee> list = Arrays.asList(new Employee(100, "abc"), new Employee(200, "pqr"));
        list.stream().filter(employee -> employee.getEmpId() == 100).map(employee -> employee.getEmpName());

        Map<Employee,Integer> mapEmp = new HashMap<>();

        mapEmp.put(new Employee(500,"pqr"),2);
        mapEmp.put(new Employee(200,"abc"),1);
        mapEmp.put(new Employee(100,"mno"),8);

        Stream<Map.Entry<Employee, Integer>> sorted = mapEmp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpId)));
        sorted.forEach(entry-> System.out.println("key ::"+entry.getKey()+" value :: "+entry.getValue()));


    }
}
