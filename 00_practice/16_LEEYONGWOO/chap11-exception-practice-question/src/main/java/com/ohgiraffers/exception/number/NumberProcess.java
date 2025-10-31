package com.ohgiraffers.exception.number;

public class NumberProcess {


    //a. 기본 생성자
    public NumberProcess() {
    }

    //b.메소드
    public boolean checkDouble(int a, int b) throws NumberRangeException{
        if(a>=1&&a<=100&&b>=1&&b<=100){
            if(a%b==0){
                return true;
            }else{
                return false;
            }
        }else {
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }


    }

}
