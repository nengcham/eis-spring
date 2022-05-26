package kr.co.eis.common.lambdas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Supplier;

import static kr.co.eis.common.lambdas.Lambda.string;

/**
 * packageName: kr.co.eis.common.lambdas
 * fileName   : LambdaLab
 * author     : ChoiGeonIl
 * date       : 2022-05-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-26    ChoiGeonIl     최초 생성
 */
public class LambdaLab {
    public static String solution(){
        Supplier<String> s = () -> string(LocalDate.now());
        return s.get();
    }
    @Test
    public void testSolution(){
        System.out.println(solution());
    }
}
