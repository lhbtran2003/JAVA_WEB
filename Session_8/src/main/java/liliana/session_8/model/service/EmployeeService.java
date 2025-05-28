package liliana.session_8.model.service;

import liliana.session_8.model.entity.Employee;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Nguyễn Văn A", "a.nguyen@example.com", "Kế toán"),
            new Employee("Trần Thị B", "b.tran@example.com", "Nhân sự"),
            new Employee("Lê Văn C", "c.le@example.com", "Lập trình viên")
    ));

    public void addEmployees(String name, String email, String position) {
        Employee employee = new Employee(name, email, position);
        employees.add(employee);
    }
}
