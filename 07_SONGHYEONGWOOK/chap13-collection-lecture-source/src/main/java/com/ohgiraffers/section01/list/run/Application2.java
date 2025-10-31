package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDto;

import java.util.*;

public class Application2 {

    public static void main(String[] args) {
        // 리스트 계열에 데이터를 추가 : add()
        //             데이터를 조회 : get(index)
        //             데이터를 수정 : set(value)
        //             데이터를 삭제 : remove(index)

        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto(1, "홍길동전1", "허균", 50000));
        bookList.add(new BookDto(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDto(3, "동의보감", "허준", 40000));
        bookList.add(new BookDto(4, "삼국사기", "김부식", 40000));
        bookList.add(new BookDto(5, "삼국유사", "일연", 50000));

        System.out.println("bookList = " + bookList);
        System.out.println("bookList = " + bookList.size());    // 요소의 수

        // 향상된 for문을 이용해서 출력
        for(BookDto book : bookList) {
            System.out.println(book);
        }

        // String과 int와는 달리 객체타입에서는 다르게 써주어야함
//        Collections.sort(bookList);
        bookList.sort(new AscendingPrice()); // 가격으로 오름차순
        System.out.println("가격 오름차순 정렬 =============");
        for(BookDto book : bookList) {
            System.out.println(book);
        }

        // 익명 클래스
        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("가격 내림차순 정렬 ====================");
        for(BookDto book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("책 제목 오름차순 정렬 ==================");
        for(BookDto book : bookList) {
            System.out.println(book);
        }


        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });

        // 익명 클래스를 람다식 표현으로 변경
        bookList.sort((BookDto o1, BookDto o2) -> o1.getAuthor().compareTo(o2.getAuthor()));

        System.out.println("책 제목 내림차순 정렬 ==================");
        for(BookDto book : bookList) {
            System.out.println(book);
        }
    }
}
