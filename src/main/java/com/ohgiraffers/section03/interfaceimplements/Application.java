package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 인터페이스(interface) 에 대해 이해할 수 있다.*/
        /*필기.
        *  인터페이스(interface)
        *  인터페이스 자바의 클래스의 유사한 형태이지만,
        *  추상메소드와 상수필드만 가질 수있는 클래스의 변형체를 말한다.
        * */

        /*필기.
        *   인터페이스 사용 목적
        *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 핵서 강제성을 부여할 목적으로 사용한다.
        *  2. java 의 단일상속의 단점을 극복할 수 있다. (다중 상속)
        *  */

        /* 필기. 인스턴스를 생성하지 못하고, 생서아 자체가 존재하지 않느다*/

//        InterProduct inter = new InterProduct();

        /*필기. 레퍼런스 타입으로만 사용이 가능하다.*/

        InterProduct inter = new Product();
        /*필기. 인터페이스의 추상메소드 오버라이딩한 메소드로 동적바인디에 의해 호출 */
        inter.nonStaticMethod();
        inter.absMethod();

        InterProduct.StaticMethod();
        System.out.println(InterProduct.Max_Num);




    }
}
