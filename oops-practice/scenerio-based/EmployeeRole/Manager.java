package EmployeeRole;

class Manager extends Employee {

    // cached bonus
    private final double bonus;

    Manager(String name, double salary) {
        super(name, salary);
        // 10% of salary
        this.bonus = salary * 0.10;
    }

    @Override
    double getBonus() {
        return bonus;
    }
}
