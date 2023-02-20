package org.example.level0.P120821_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{5, 4, 3, 2, 1});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 1, 1, 1, 1, 2})).isEqualTo(new int[]{2, 1, 1, 1, 1, 1});
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(new int[]{1, 0, 1, 1, 1, 3, 5})).isEqualTo(new int[]{5, 3, 1, 1, 1, 0, 1});
    }
}
