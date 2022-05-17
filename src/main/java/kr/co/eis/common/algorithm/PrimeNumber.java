package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : PrimeNumber
 * author     : ChoiGeonIl
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17    ChoiGeonIl     최초 생성
 */
public class PrimeNumber {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Solution{
        int start, end;
        List<Integer> primes;

        @Override
        public String toString() {
            return String.format("1~100 사이의 소수: %s", primes);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        Solution s = Solution.builder().start(1).end(100).build();
        SolutionService sol = e ->{
            List<Integer> arr = new ArrayList<>();
            int count = 0;
            for (int i = e.getStart(); i <= e.getEnd(); i++){
                for(int j = 2; j <= i; j++) {
                    if (i % j == 0) count++;
                }
                if (count == 1) arr.add(i);
                count = 0;
            }
            return Solution.builder().primes(arr).build();
        };
        System.out.println(sol.solution(s));
    }
}
