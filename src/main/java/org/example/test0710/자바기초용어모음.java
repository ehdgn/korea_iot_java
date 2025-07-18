package org.example.test0710;

public class 자바기초용어모음 {
}

/*
    📍접근제한자

    public: 모든 위치에서 접근가능
    protected: 같은 패키지 내에서만 접근 가능 / 상속받은 클래스에서는 접근가능
    default: 같은 패키지 내에서만 접근 가능
    private: 같은 클래스 내에서만 접근 가능


    📍static

    static 변수: 모든 인스턴스가 공유하는 변수
    static 메서드: 인스턴스를 생성하지 않아도 호출가능


    📍final

    final 변수: 상수로 더이상 변경할 수 없음 (선언과 동시에 초기화 하거나 생성자를 통해 초기화)
    final 메서드: 상속받은 클래스에서 오버라이딩이 불가능한 메서드
    final 클래스: 상속할 수 없음



    📍super VS this

    this: 생성자에서 클래스의 변수와 생성자의 매개변수를 구분하기 위해 사용
    super: 부모 클래스의 생성자를 불러오기 위해 사용



    📍오버로딩 VS 오버라이딩

    오버로딩: 같은 클래스 안에서 사용 변수타입은 상관 X / 변수명이 동일 / 매개변수의 개수나 타입이 달라야함
    오버라이딩: 상속받은 클래스에서 사용하며 변수타입(자동 형변환이 가능하면 O),변수명,매개변수가 모두 동일하고 {}안의 내용이 다름 @Override를 사용



    📍abstract

    abstract 클래스: 추상클래스로 하나 이상의 추상메서드를 포함해야 함, 일반 메서드도 포함할 수 있음
    abstract 메서드: 추상메서드는 상속받은 클래스에서 메서드의 오버라이딩을 강제하여 반드시 구현하도록 함, {} 대신 ;을 붙여 구현을 하지 않음



    📍interface VS abstract class

    interface: 다중 구현 가능
    abstract class: 다중 상속 불가능



    📍extends VS implements

    extends: 확장하다는 의미로 부모 클래스를 상속받을 때 사용하고 자식 클래스에서 부모 클래스의 메서드를 오버라이딩 하거나 자신만의 메서드를 만들어 기능을 확장하거나 수정할때 사용
    implements: 구현하다는 의미로 인터페이스를 구현할 때 사용한다.



    📍try-catch-finally

    try: 예외처리가 포함된 구문을 실행할 때 사용
    catch: ()안에 예외처리를 넣어 각각의 예외가 발생할 시 실행할 구문을 넣음, 여러개 사용 가능
    finally: 반드시 실행되는 구문

 */
