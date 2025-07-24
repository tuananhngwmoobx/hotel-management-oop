package employee;

import management.Salary;

public class Labor extends Employee implements Salary {
    public static final int SALARY_RATE = 1;

    public Labor(String id, String name) {
        super(id, name);
    }

    @Override
    public Integer getSalary() {
        return getRooms().size() *  SALARY_RATE;
    }
}
