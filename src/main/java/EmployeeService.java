public class EmployeeService {

    public Employee createEmployee (String id, String name){
        return new Employee(id, name);
    }

    public Employee updateEmployee (Employee employee, String id, String name, String departmentId){
        employee.setId(id);
        employee.setName(name);
        return employee;
    }

    public void assignToDepartment(Employee employee, String departmentId){
        employee.setDepartmentId(departmentId);
    }
}
