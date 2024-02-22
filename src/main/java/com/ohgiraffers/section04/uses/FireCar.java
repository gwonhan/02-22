package com.ohgiraffers.section04.uses;

public class FireCar extends Car implements  Soundable {


    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다..");

    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다...");

    }

    @Override
    public void horn() {
        System.out.println(" 소방차 지나간ㄷ ㅏ 이도아 비켜라 @@@@@@@@@@@@ ");

    }
    @Override
    public void slide(){
        System.out.println("sddasdasdsd");
    }
}
