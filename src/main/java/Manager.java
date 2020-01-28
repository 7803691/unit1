import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Manager {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        DepartmentService departmentService = new DepartmentService();
        Random rand = new Random();
        int randomNum = 1 + rand.nextInt((3 - 1) + 1);

        departmentService.createDepartment("1", "Java Development");
        departmentService.createDepartment("2", "C# Development");
        departmentService.createDepartment("3", "JavaScript Development");

        List<Employee> employees = new ArrayList<Employee>(Arrays.asList(
                employeeService.createEmployee("1", "John"),
                employeeService.createEmployee("2", "Smith"),
                employeeService.createEmployee("3", "Jim"),
                employeeService.createEmployee("4", "Corry"),
                employeeService.createEmployee("5", "Oleg"),
                employeeService.createEmployee("6", "Vasya"))
        );

        for (int i = 0; i < employees.size(); i++) {
            employeeService.assignToDepartment(employees.get(i), Integer.toString(1 + rand.nextInt((3 - 1) + 1)));
        }
    }
}
