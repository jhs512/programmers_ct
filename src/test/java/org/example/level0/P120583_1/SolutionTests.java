package org.example.level0.P120583_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);
    }
}
