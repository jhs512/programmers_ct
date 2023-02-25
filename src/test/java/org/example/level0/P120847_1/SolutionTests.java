package org.example.level0.P120847_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(20);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{0, 31, 24, 10, 1, 9})).isEqualTo(744);
    }
}
