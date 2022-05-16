package kr.co.eis.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
            String gender = (ssn.substring(7).equals("1") || ssn.substring(7).equals("3")) ?"남자":"여자";
            int age = (123 - Integer.parseInt(ssn.substring(0,2)))%100;
            return String.format("이름: %s, 성별: %s, 나이: %s", name, gender, age);
        }
    }
    //기능 : 회원검색
    interface PersonService{ Person search(List<Person> arr, String name); }

    static class PersonServiceImpl implements PersonService{
        public Person search(List<Person> arr, String name) {
            return arr
                    .stream()
                    .filter(e -> e.getName().equals(name))
                    .collect(Collectors.toList()).get(0);
        }
    }
    @Test
    void personSteamTest(){
        List<Person> arr = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );
        // "홍길동", "900120-1"
        // "김유신", "970620-1"
        // "유관순", "040920-4"
        // 남성, 여성, 나이 판단 로직
        System.out.println(new PersonServiceImpl()
                .search(arr, "유관순"));
        System.out.println(new PersonServiceImpl()
                .search(arr, "홍길동"));
    }
}
