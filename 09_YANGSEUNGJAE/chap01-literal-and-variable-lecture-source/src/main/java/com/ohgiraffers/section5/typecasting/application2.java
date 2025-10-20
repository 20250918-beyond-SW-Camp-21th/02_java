package com.ohgiraffers.section5.typecasting;

public class application2 {
    public static void main(String[] args) {

        long lnum = 99999999999l;
        int inum = (int)lnum;
        System.out.println("inum = " + inum);

        int isum = (int) (inum + lnum);
        System.out.println("isum = " + isum);
        int isim2 = inum + (int) lnum;
        System.out.println("isim2 = " + isim2);
        
        float avg = 31.235f;
        int floornum = (int)avg;
        System.out.println("floornum = " + floornum);
        
    }
}
