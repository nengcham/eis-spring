package kr.co.eis.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: kr.co.eis.common.algorithm
 * fileName   : CheckSameArray
 * author     : ChoiGeonIl
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17    ChoiGeonIl     최초 생성
 */
public class CheckSameArray {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        int[] arr1, arr2;
        String res;

        @Override
        public String toString() {
            return String.format("두 배열은 %s 요소들을 포함하는 배열 입니다.", res);
        }
    }
    @FunctionalInterface private interface ISolution{
        Solution solution(Solution s);
    }
    @Test
    void test(){
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {2, 3, 1};
        Solution s = Solution.builder().arr1(arr1).arr2(arr2).build();

        ISolution ss = e -> {
            int count = 0;
            int[] arr3 = e.getArr1();
            int[] arr4 = e.getArr2();
            Arrays.sort(arr3);
            Arrays.sort(arr4);
            for (int i = 0; i < arr3.length; i ++){
                if (arr3[i] == arr4[i]) count++;
            }
            String res = (count == arr3.length)? "같은" : "다른";
            return Solution.builder().res(res).build();
        };
        System.out.println(ss.solution(s));
    }
}
