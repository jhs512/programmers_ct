package org.example.level0.P120841_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{2, 4})).isEqualTo(1);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{-7, 9})).isEqualTo(2);
    }
}
