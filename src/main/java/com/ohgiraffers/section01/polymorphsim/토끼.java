package com.ohgiraffers.section01.polymorphsim;

public class 토끼 extends 동물 {

    @Override
    public void 먹기 (){
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다 챱챱");
    }

    @Override
    public void 달리기(){
        System.out.println("토끼가 깡깡 뜁니다");
    }

    @Override
    public void 울기 (){
        System.out.println("토끼가 웁니다 끼익끼이ㅣ익");
    }

    public void 점프(){
        System.out.println("토끼가 뜁니다 총총 깡 ");

    }

}
