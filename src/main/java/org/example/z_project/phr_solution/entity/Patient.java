package org.example.z_project.phr_solution.entity;

// 환자 정보 클래스

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private Long id; // 환자 고유번호
    private String name;
    private int age;
    private String gender;
}
