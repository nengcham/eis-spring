package kr.co.eis.common.streams;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.streams
 * fileName   : HelloStream
 * author     : ChoiGeonIl
 * date       : 2022-05-16
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-16    ChoiGeonIl     최초 생성
 */
// 한국어 안녕, 영어 Hello
public class HelloStream {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Hello{
        private String greeting, inLanguage;

        @Override
        public String toString() {
            return "Hello{" +
                    "greeting='" + greeting + '\'' +
                    ", inLanguage='" + inLanguage + '\'' +
                    '}';
        }
    }
    interface HelloService{
        Set<Hello> greet(List<Hello> arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<Hello> greet(List<Hello> arr) {
            return arr
                    .stream()
                    .filter(e -> e.getInLanguage().equals("영어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test
    void helloTest(){
        List<Hello> arr = Arrays.asList(
                Hello.builder().inLanguage("영어").greeting("Hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
        );
        new  HelloServiceImpl()
                .greet(arr)
                .forEach(System.out::println);
    }
}
