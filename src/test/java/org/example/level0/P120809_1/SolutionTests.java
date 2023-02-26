package org.example.level0.P120809_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{2, 4, 6, 8, 10});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 2, 100, -99, 1, 2, 3})).isEqualTo(new int[]{2, 4, 200, -198, 2, 4, 6});
    }
}
