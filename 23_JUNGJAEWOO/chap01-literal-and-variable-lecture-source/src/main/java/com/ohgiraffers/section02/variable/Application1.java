package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        // 변수의 사용 목적

        //  1. 값에 의미를 부여하기 위한 목적(가독성)
        System.out.println("============ 값에 의미 부여 테스트");
        System.out.println("보너스를 포함한 급여 : " + (10000000 + 200000)+ "원");

        int salary = 10000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary+bonus));

        // 2. 한번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("=============== 변수에 저장한 값 재사용 테스트");

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");

        System.out.println(); // 공백 한줄 추가

        int point = 300;
        System.out.println("1번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");

        System.out.println("=========== 변수에 저장한 값 변경 테스트");
        int sum = 0;

        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);

        sum = sum + 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면? " + sum);

        sum = sum + 10;
        System.out.println("sum에 20이 있었는데 추가로 10을 더 더하면? " + sum);

    }
}
