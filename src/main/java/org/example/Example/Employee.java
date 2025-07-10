package org.example.Example;

import java.util.ArrayList;

public class Employee {
    private final String employeeId;
    private String name;
    private String position;
    private int salary;

    Employee (String employeeId, String name, String position, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        if(salary < 0) this.salary = 0;
        else this.salary = salary;
    }


    public void displayInfo() {
        System.out.println("사원 ID: " + employeeId + ", 이름: " + name + ", 직급: " + position + ", 급여: " + salary);
    }

    public void setName(String name){
        System.out.println("이름을 " + name + "으로 변경합니다");
        if(name == null || name.equals(" ") || name.isEmpty()) {
            System.out.println("이름 변경에 실패했습니다.");
        } else this.name = name;
    }

    public void setPosition(String position) {
        System.out.println("직급을 " + position + "으로 변경합니다.");
        if(position == null || position.equals(" ") || position.isEmpty()) {
            System.out.println("직급 변경에 실패했습니다.");
        } else this.position = position;

    }

    public void setSalary(int salary) {
        System.out.println("급여를 " + salary + "으로 변경 시도합니다.");
        if(salary < 0) System.out.println("급여 변경에 실패했습니다.");
        else this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
