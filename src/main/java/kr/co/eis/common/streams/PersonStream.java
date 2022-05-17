package kr.co.eis.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.streams
 * fileName   : PersonStream
 * author     : ChoiGeonIl
 * date       : 2022-05-16
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-16    ChoiGeonIl     최초 생성
 */
public class PersonStream {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Person{
        private String name, ssn;


        @Override
        public String toString() {
            int year = Calendar.getInstance().get(Calendar.YEAR);

            String gender = ((Integer.parseInt(ssn.substring(7)))%2 != 0) ?"남자":"여자";
            int age = (year - 1899 - Integer.parseInt(ssn.substring(0,2)))%100;
            return String.format("이름: %s, 성별: %s, 나이: %s", name, gender, age);
        }
    }
    //기능 : 회원검색
    @FunctionalInterface interface PersonService{
        Person search(List<Person> person);
    }

    @Test
    void personSteamTest(){
        // "홍길동", "900120-1"
        // "김유신", "970620-1"
        // "유관순", "040920-4"
        // 남성, 여성, 나이 판단 로직
        List<Person> arr = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );

        PersonService ps = person -> person
                .stream()
                .filter(e -> e.getName().equals("홍길동"))
                .collect(Collectors.toList()).get(0);
        System.out.println(ps.search(arr));
    }
}
