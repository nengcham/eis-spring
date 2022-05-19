package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : Gugudan
 * author     : ChoiGeonIl
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17    ChoiGeonIl     최초 생성
 */
public class Gugudan {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        int start, end;
        String res;

        @Override
        public String toString() {
            return res;
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        Solution s = Solution.builder().start(19).end(19).build();

        SolutionService ss = e -> {
            String res = "";
            for (int i = 1; i <= e.getEnd(); i++){
                for (int j = 2; j <= e.getStart(); j++){
                    res += j + "*" + i + "=" + (i * j)+"\t";
                }
                res += "\n";
            }
          return Solution.builder().res(res).build();
        };
        System.out.println(ss.solution(s));
    }

}
