package employee;

import management.Salary;

public class Manager extends Employee implements Salary {
    public static final int SALARY_RATE = 3;

    public Manager(String id, String name) {
        super(id, name);
    }

    @Override
    public Integer getSalary() {
        return getRooms().size() *  SALARY_RATE;
    }
}
