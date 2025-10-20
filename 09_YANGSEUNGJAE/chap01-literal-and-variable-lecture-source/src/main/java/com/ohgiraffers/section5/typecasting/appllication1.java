package com.ohgiraffers.section5.typecasting;

public class appllication1 {
    public static void main(String[] args) {

        // 정수형 : byte < short < int < long
        // 실수형 : float < double
        // 문자형 : char
        // 논리형 : boolean

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;
        long result1 = num1 + num2;

        System.out.println("result1 = " + result1);

        // 문잦형은 int형으로 자동 형변환

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
















    }
}
