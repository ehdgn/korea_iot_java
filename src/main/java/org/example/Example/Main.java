package org.example.Example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E001","조성민", "대리", 3500000);
        employee1.displayInfo();
        employee1.setName("조승범");
        employee1.setSalary(-500000);
        employee1.displayInfo();

    }
}
