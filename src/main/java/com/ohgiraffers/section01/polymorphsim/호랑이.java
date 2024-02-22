package com.ohgiraffers.section01.polymorphsim;

public class 호랑이 extends  동물{

    @Override
    public void 먹기() {
        System.out.println("호랑이가 고기 냠냠");

    }
        @Override
        public void 달리기 (){
            System.out.println(" 호랑이가 안뛰네요");
        }

    @Override
    public void 울기() {
        System.out.println("호랑이가 울부짖습니다. 어흐ㅡㅇ흥흥흥흐");
    }
    public void 물어뜯기(){
        System.out.println("다리를 물어 뜯는 호랑이의 모습 ");
    }
}

