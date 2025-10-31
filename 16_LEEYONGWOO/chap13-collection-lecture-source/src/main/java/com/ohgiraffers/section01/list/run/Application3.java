package com.ohgiraffers.section01.list.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        List<String> linkedList=new LinkedList<>();


        /**
         * 내부적인 구현코드는 다르지만 LinkedList도 List계열이기 때문에
         * 동일한 메소드를 호출해서 작업할 수 있다.
         */
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("banana");
        linkedList.add("pear");
        linkedList.add("banana");

        System.out.println("LinkedList의 size() : "+linkedList.size());

        //저장 순서 유지, 중복 허용을 확인
        for(int i=0; i<linkedList.size(); i++){
            System.out.println(i+" : "+linkedList.get(i));
        }

        //toString()을 오버라이딩
        System.out.println("linkedList : "+linkedList);

        for(String str : linkedList){
            System.out.println(str);
        }

        Iterator<String> iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        linkedList.set(0,"pineapple");
        System.out.println("linkedList : "+linkedList);

        /**
         * LinkedList는 ArrayList와 내부적 구현 방식이 다르므로
         * 수정, 삭제가 빈번한 상황에서는 LinkedList를 사용하는 것이 효율적이다.
         * ~first, ~last 접미어를 붙여 순차적 기능을 강조한 함수들이 LinkedList에는 추가적으로 정의 되어 있다
         */
        linkedList.clear();
        linkedList.add("hello");
        ((LinkedList)linkedList).addFirst("world");
        ((LinkedList)linkedList).addLast("java");
        System.out.println("linkedList : "+linkedList);
        ((LinkedList)linkedList).removeFirst();
        ((LinkedList)linkedList).removeLast();
        System.out.println("linkedList : "+linkedList);

        System.out.println("isEmpty() "+linkedList.isEmpty());
        System.out.println("contains() "+linkedList.contains("apple"));
        System.out.println("indexOf() "+linkedList.indexOf("apple"));
        System.out.println("lastIndexOf() "+linkedList.lastIndexOf("apple"));


    }
}
