import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    //your code here
    private static EmployeeRepository singleton = new EmployeeRepository();
    private Map<String, Employee> employees = new HashMap<String, Employee>();

    private EmployeeRepository(){}

    public static EmployeeRepository getInstance() {
        //your code here
        return singleton;
    }

    public void add(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public boolean contains(Employee employee) {
        return employees.containsKey(employee.getName());
    }

    public Employee get(Employee employee) {
        return employees.get(employee.getName());
    }
}