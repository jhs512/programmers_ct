package org.example.level0.P120813_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(new int[] {1, 3, 5, 7, 9});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(15)).isEqualTo(new int[] {1, 3, 5, 7, 9, 11, 13, 15});
    }
}
