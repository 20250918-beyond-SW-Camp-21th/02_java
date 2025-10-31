package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application4 {


    public static void main(String[] args) {
        MemberDto[] outputMembers = {
                new MemberDto("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDto("user02", "pass02", "유관순", "korea345@ohgiraffers.com", 16, '여', 1850.7),
                new MemberDto("user03", "pass03", "이순신", "leesoonsin777@ohgiraffers.com", 35, '남', 3250.7),
        };

        ObjectOutputStream objOut = null;


        try {
//            objOut = new ObjectOutputStream(
//                    new BufferedOutputStream(
//                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream").exists();

            if (!exists) {
                // 파일이 없을 경우
                objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt",true)));
            }else{
                objOut = new MyOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt",true)));
            }
            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

            objOut.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("======================");
        MemberDto[] inputMembers = new MemberDto[3];

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")
                    )
            );
            while(true){
                System.out.println(objIn.readObject());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
