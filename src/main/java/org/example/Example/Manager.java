package org.example.Example;

public class Manager extends Employee{
    private int teamSize;

    Manager(String employeeId, String name, String position, int salary) {
        super(employeeId, name, position, salary);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
