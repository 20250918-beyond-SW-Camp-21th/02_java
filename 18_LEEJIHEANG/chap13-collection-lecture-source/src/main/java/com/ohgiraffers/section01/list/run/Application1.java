package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /*컬렉션 프레임워크(Collection Framework)
        *자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
        * 즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스를 말한다.
        *
        * */

        /*
        * ArrayList
        * 가장 많이 사용되는 컬렉션 클래스이다.
        * JDK 1.2부터 제공된다.
        *
        * 배열은 크기를 변경하는 것이 불가능하고 요소의 추가/삭제/정렬 등이 복잡하다.
        * 이러한 기능을 메소드로 구혀해서 제공하고 있으며 단, 속도가 빨라지는 것은 아니다.
        *
        * */

        /*
        * 다형성을 이용해서 상위 레퍼런스로 ArrayList객체를 참조할 수 있다.
        * List 인터페이스 하위의 다양한 구현체들로 타입변경이 가능하므로
        * 보다 유연한 코드를 작성할 수 있다.
        * */
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        // list 와 arraylist, linkedlist는 형변환이 가능하다.
        // list, arraylist 순차적으로 들어옴, linkedlist
        list = new LinkedList(alist);

        LinkedList list1 = new LinkedList<>(new ArrayList<>());

        alist.add("hello");
        alist.add(10); // autoboxing( 값 => 객체로 바꾼내용이다)
        System.out.println(alist);
        System.out.println("alist.size(): " + alist.size());
        for(int i = 0; i < alist.size(); i++) {
            System.out.println(i + ": " + alist.get(i));
        }

        alist.add("apple");
        alist.add(2,"orange");
        System.out.println("alist = " + alist);

        alist.remove(2);
        System.out.println("alist = " + alist);

        alist.set(1, Boolean.valueOf(true));
        System.out.println("alist = " + alist);

        /*String타입의 Element만 저장하는 ArrayList 생성*/
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
//        stringList.add(123);
        stringList.add("oragne");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);
        Collections.sort(stringList); // String에는 문자열 오름차순(Ascending)에 대한 정의가 되어있다.
        System.out.println("stringList = " + stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(9);
        integerList.add(14);
        System.out.println("integerList = " + integerList);
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList); // 오름차순
        // 내림차순은 별도의 작업이 필요하다.
        /*
         * Iterator란?
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *
         * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */
        stringList = new LinkedList<>(stringList);

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList = " + descList);

        /*arrayalist의 크기는 size()메소드로 확인가능
        * 단, size메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.*/
// String은 불변객체(새롭게 붙인다) Stringbuilder는 가변객체(값이 빈번하게 변경)
        // toString내용 오버라이딩해서 재정의중
        // 배열           ArrayList
        // int[] iarr = new int[3] ArrayList alist = new ArrayList
        // 인덱스                      인덱스
        // iarr[0] = 1                alist.add(값);

//        sout(iarr[0]);                sout(alist.get(인덱스))

    }
}

// generic과 정렬 가능
// stream이 가지고 있는 오름차순을 가지고 있다.
// dto관련 내용들은 순수한 아이.
// 코드를 별도로 짜줘야한다.