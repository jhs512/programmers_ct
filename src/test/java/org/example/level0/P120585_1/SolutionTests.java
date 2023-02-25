package org.example.level0.P120585_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    void t1() {
        assertThat(new Solution().solution(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(new int[]{180, 120, 140}, 190)).isEqualTo(0);
    }
}
