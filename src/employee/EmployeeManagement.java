package employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement {
    private Map<String, Employee> employeeMap = new HashMap<>();
    public EmployeeManagement() {};

    public EmployeeManagement(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
}
