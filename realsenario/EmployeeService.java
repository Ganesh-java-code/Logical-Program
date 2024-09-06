package in.ganesh.test.realsenario;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
 public class EmployeeService {

        private List<Employee> employees = new ArrayList<>();
        private Long idCounter = 1L;

        public List<Employee> saveEmployees(List<Employee> employees) {
            for (Employee employee : employees) {
                employee.setId(idCounter++);
                this.employees.add(employee);
            }
            return employees;
        }

        public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
            return employees.stream()
                    .filter(employee -> departmentId.equals(employee.getDepartmentId()))
                    .collect(Collectors.toList());
        }
}
