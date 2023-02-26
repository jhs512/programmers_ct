package org.example.level0.P120819_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(5_500)).isEqualTo(new int[] {1, 0});
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(15_000)).isEqualTo(new int[] {2, 4_000});
    }
}
