package employee;

import hotel.Room;
import management.Assignment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement implements Assignment {
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

    @Override
    public void assignRoom(String employeeId, Room room) {
        Employee employee = employeeMap.get(employeeId);
        if(employee == null){
            throw new RuntimeException("The employee with id " + employeeId + " doesn't exists.");
        }
        employee.getRooms().add(room);
    }
}
