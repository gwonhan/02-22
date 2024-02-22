package com.ohgiraffers.section02.abstarctclass;

public class SmartPhone extends Product{


    /*필기.
    *   SmartPhone 클래스는 Product 클래스를 상속 받아서 구현한다
    *  extends 키워드로 클래스를 상속 받을 때 두 새 이상의 클래스는
    *  상속 받지 못한다.
    *  추상 클래스가 가지는 추상 메소드는 "반드시" 오버라이딩 해야한다 (강제성)
    *  */

    public SmartPhone(){}

    @Override
    public void abstMethod() {

        System.out.println("Product 클래스의 추상메소드를 오버라이딩 한 메소드 호출... ");


    }

    public void pintSmartPhone(){
        System.out.println("SmartPhone 클래스의 일반 메소드 호출됨...");
    }


}
