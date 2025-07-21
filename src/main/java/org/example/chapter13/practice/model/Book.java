package org.example.chapter13.practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public class Book {
    // 추상 클래스: 직접적인 인스턴스화 X, 하위 클래스 생성자 내에서 호출 용도로 정의(생성자를 가질 수는 있음)
    private String id;
    private String title;
    private String author;

    // cf) 인터페이스: 직접적인 인스턴스화 X,  생성자를 가질 수 없음!
}
