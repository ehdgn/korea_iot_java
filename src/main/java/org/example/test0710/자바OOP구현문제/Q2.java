package org.example.test0710.자바OOP구현문제;

class Person {
    private String name;
    private int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
        System.out.println("이름이 설정되었습니다.");
    }

    void setAge(int age) {
        if(age < 0) {
            System.out.println("나이는 0보다 작을 수 없습니다.");
        } else {
            this.age = age;
            System.out.println("나이가 설정되었습니다.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("김동후");
        System.out.println(person.getName());

        person.setAge(-1);
        person.setAge(26);
        System.out.println(person.getAge());
    }
}
