package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : RemoveDupl
 * author     : ChoiGeonIl
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17    ChoiGeonIl     최초 생성
 */
public class RemoveDuplicateElements {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        List<Integer> arr, res;

        @Override
        public String toString() {
            return String.format("중복제거후: %s",res);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void testSolution(){
        List<Integer> arr = Arrays.asList(5, 10, 9, 27, 2, 8, 10, 4, 27, 1);
        System.out.println(arr);
        Solution s = Solution.builder().arr(arr).build();

        SolutionService ss = e -> {
            List<Integer> res = e.getArr().stream().distinct().collect(Collectors.toList());
            return Solution.builder().res(res).build();
        };
        System.out.println(ss.solution(s));
    }
}
