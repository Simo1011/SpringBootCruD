package CRUD.Services;

import java.util.List;

import CRUD.Model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

void saveEmployee (Employee employee);

Employee getEmployeeById(long id);
void deleteEmployeeById(long id);

	

}
