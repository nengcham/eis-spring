package kr.co.eis.common.lambdas;

/**
 * packageName: kr.co.eis.common.lambda
 * fileName   : Calculator
 * author     : ChoiGeonIl
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11    ChoiGeonIl     최초 생성
 */
public class Calculator {
    public static void main(String... args) {
        var s = "계산기";
        Calculator c = new Calculator();
        System.out.println(s);
        System.out.println("10 + 5 = " + c.operate(10, 5, (a, b)->a+b));
        System.out.println("10 - 5 = " + c.operate(10, 5, (a, b)->a-b));
        System.out.println("10 x 5 = " + c.operate(10, 5, (a, b)->a*b));
        System.out.println("10 / 5 = " + c.operate(10, 5, (a, b)->a/b));
    }
    interface Arithmetic{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Arithmetic arith){
        return arith.operation(a, b);
    }
}
