package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : Fruites
 * author     : ChoiGeonIl
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17    ChoiGeonIl     최초 생성
 */
public class Fruits {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        int[][] fruitMarket;
        int total, apple, grape, orange;

        @Override
        public String toString() {
            return String.format("총합: %d\n사과 평균: %d\n포도 평균: %d\n오렌지 평균: %d"
                                 , total, apple, grape, orange);
        }

    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        int[][] fruitMarket = {
                {10000, 20000, 12000},
                {8000, 3000, 15000},
                {20000, 15000, 38000},
                {13000, 20000, 30000},
                {30000, 12000, 20000},
                {35000, 30000, 25000},
                {50000, 23000, 10000},
        };
        Solution s = Solution.builder().fruitMarket(fruitMarket).build();

        ISolution ss = e -> {
            int total = 0;
            int apple = 0;
            int grape = 0;
            int orange = 0;
            int length = e.getFruitMarket().length;
            for (int i = 0; i < length; i++){
                for (int j =0; j < 3; j++){
                    if (j == 0){
                        apple += e.getFruitMarket()[i][j];
                    } else if(j == 1){
                        grape += e.getFruitMarket()[i][j];
                    } else {
                        orange += e.getFruitMarket()[i][j];
                    }
                    total += e.getFruitMarket()[i][j];
                }
            }
            return Solution.builder().total(total).apple(apple/length).grape(grape/length).orange(orange/length).build();
        };
        System.out.println(ss.solution(s));
    }
}
