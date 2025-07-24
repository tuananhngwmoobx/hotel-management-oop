package employee;

import management.Salary;

public class Receptionist extends Employee implements Salary {
    public static final int SALARY_RATE = 2;

    public Receptionist(String id, String name) {
        super(id, name);
    }

    @Override
    public Integer getSalary() {
        return 0;
    }

}
