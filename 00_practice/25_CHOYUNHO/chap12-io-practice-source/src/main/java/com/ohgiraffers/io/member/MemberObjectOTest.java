package com.ohgiraffers.io.member;

public class MemberObjectOTest {
    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();
        memberManager.readMembers();
        Member member = new Member("user04","1234", "신사임당", "sinsa@sh.org",
                300, '여', 9000.0);
        memberManager.addMember(member);
        memberManager.readMembers();

    }
}
