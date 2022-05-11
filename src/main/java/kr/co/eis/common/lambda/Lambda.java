package kr.co.eis.common.lambda;

import static kr.co.eis.common.dataStructure.AppleList.Apple;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * packageName: kr.co.eis.common.lambda
 * fileName   : LambdaUtil
 * author     : ChoiGeonIl
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11    ChoiGeonIl     최초 생성
 */
public class Lambda {
    public static void main(String[] args) {
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(
                                new Apple.Builder().origin("영동").color("RED").price(1000).build(),
                                new Apple.Builder().origin("영동").color("BLUE").price(2000).build(),
                                new Apple.Builder().origin("풍기").color("BLUE").price(3000).build()
                        ))
                        );
        System.out.println("홍 = 홍 :"+equals("홍", "홍"));
        System.out.println("홍 = 김 :"+equals("홍", "김"));
        System.out.println(array(8));
        System.out.println(array(8).length);
    }
    public static int integer(String s){
        // Integer i = Integer,parseInt("900");
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }
    public static String string(Object o){
        // String s = String.valueOf(Object)
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }
    public static Boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1,s2);
    }
    // int[] arr = new int[8];
    // int 타임의 size를 던지면 배열이 나온다.
    // = int[]::new
    public static int[] array(Integer i){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(i);
    }
    // random 람다함수 만들기
    //int p = random(1, 6)

//    public static int random(int i, int j){
//        Function<Integer, Integer> f = t -> Math.random(t);
//    }
}
