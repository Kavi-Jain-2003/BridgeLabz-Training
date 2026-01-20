package EmployeeRole;

class Developer extends Employee {

    // cached bonus
    private final double bonus;

    Developer(String name, double salary) {
        super(name, salary);

        if (salary > 50000) {
            this.bonus = salary * 0.05;
        } else {
            this.bonus = 0.0;
        }
    }

    @Override
    double getBonus() {
        return bonus;
    }
}
