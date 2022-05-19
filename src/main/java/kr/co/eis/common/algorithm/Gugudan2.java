package kr.co.eis.common.algorithm;

import org.junit.jupiter.api.Test;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : Gugudan2
 * author     : ChoiGeonIl
 * date       : 2022-05-18
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-18    ChoiGeonIl     최초 생성
 */
public class Gugudan2 {

    @FunctionalInterface interface ISolution{
        void solution();
    }
    @Test
    void test(){
        ISolution is = () -> {

        };
        is.solution();
    }
}
