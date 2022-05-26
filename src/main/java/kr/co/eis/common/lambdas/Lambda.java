package kr.co.eis.common.lambdas;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;
import java.util.function.*;

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
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static String nowDate(){
        Supplier<String> s = () -> string(LocalDate.now());
        return s.get();
    }


    public static void main(String[] args) {
        /**
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
         */
        System.out.println(random(1, 6));
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

    public static int random(int min, int max){
//        Supplier<Double> f = Math::random;
//        return (int)(f.get()*max)+min;
//        BiFunction<Integer, Integer, Integer> f = Math::random;
//        return f.apply(i, j);
        BiFunction<Integer, Integer, Integer> f = (t, u) -> (int)(Math.random()*u)+t;
        return f.apply(min, max);
    }
    public static File makeFile(String s){
        Function<String, File> f = File::new;
        return f.apply(s);
    }


}
