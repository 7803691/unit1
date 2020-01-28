public class DepartmentService {

    public Department createDepartment(String id, String name){
        return new Department(id, name);
    }
}
