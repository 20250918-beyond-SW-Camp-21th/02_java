package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("=== 값에 의미부여 === ");
        System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");


        int salary = 1000000;
        int bonus = 200000;

        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");

        // 2. 한번 저장해둔 값을 재사용
        System.out.println("=== 변수에 저장한 값 재사용 테스트");

        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");

        System.out.println();

        int point = 400;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");

        System.out.println();

        System.out.println("====== 변수에 저장한 값 변경 테스트");
        int sum = 0;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        sum = sum + 10;
        System.out.println(sum);

    }
}
